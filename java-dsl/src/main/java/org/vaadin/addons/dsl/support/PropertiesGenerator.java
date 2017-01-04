package org.vaadin.addons.dsl.support;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Modifier;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ClassUtils.Interfaces;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.vaadin.addons.dsl.core.PropertyNode;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.vaadin.ui.Component;

public class PropertiesGenerator extends AbstractGenerator {

    public static void main(String[] args) throws IntrospectionException, IOException {

        Set<PojoClass> classes = PojoClassFactory
                .enumerateClassesByExtendingType("com.vaadin", Component.class,
                    new FilterChain(
                            filterComponentContainers(),
                            filterExcludedClassesPattern(),
                            filterNonConcreteClasses(),
                            filterDeprecatedClasses(),
                            hasDefaultConstructor()))
                .stream()
                .collect(Collectors.toSet());

        Map<Method, Set<Class<?>>> methodMap = new TreeMap<>((o1, o2) -> {
            return new CompareToBuilder()
                    .append(o1.getName(), o2.getName())
                    .append(o1.getParameterCount(), o2.getParameterCount())
                    .toComparison();
        });

        for (PojoClass pojoClass : classes) {
            BeanInfo beanInfo = Introspector.getBeanInfo(pojoClass.getClazz());
            Arrays.asList(beanInfo.getMethodDescriptors()).forEach(method -> {
                String methodName = method.getName();
                if (methodName.startsWith("set")) {
                    Method declaringMethod = findOriginallyDeclaredMethod(method.getMethod());
                    if (methodMap.get(declaringMethod) == null) {
                        methodMap.put(declaringMethod, new TreeSet<>(new SuperclassFirstComparator()));
                    }
                    methodMap.get(declaringMethod).add(declaringMethod.getDeclaringClass());
                }
            });
        }

        List<MethodSpec> methodSpecs = methodMap.entrySet()
                .stream()
                .map(PropertiesGenerator::buildPropertySetterMethodSpec)
                .filter(method -> method != null)
                .sorted((e1, e2) -> e1.name.compareTo(e2.name))
                .collect(Collectors.toList());

        TypeSpec.Builder typeSpecBuilder = TypeSpec
                .classBuilder("Properties")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(AnnotationSpec.builder(SuppressWarnings.class).addMember("value", "{$S, $S}", "rawtypes", "unchecked").build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .build())
                .addMethods(methodSpecs);

        JavaFile javaFile = JavaFile
                .builder("org.vaadin.addons.dsl", typeSpecBuilder.build())
                .build();

        javaFile.writeTo(new File("src/main/java"));
    }

    private static MethodSpec buildPropertySetterMethodSpec(Entry<Method, Set<Class<?>>> entry) {
        Method method = entry.getKey();
        if (method.isAnnotationPresent(Deprecated.class)) {
            return null;
        }

        MethodSpec.Builder methodSpecBuilder = MethodSpec
                .methodBuilder(propertyPlainName(method.getName()))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC);

        Class<?> typeVariableClass = entry.getValue().iterator().next();
        TypeVariableName typeVariableName = TypeVariableName.get("T", typeVariableClass);
        if (!Component.class.isAssignableFrom(typeVariableClass)) {
            typeVariableName = typeVariableName.withBounds(Component.class);
        }
        methodSpecBuilder.addTypeVariable(typeVariableName);
        methodSpecBuilder.returns(ParameterizedTypeName.get(ClassName.get(PropertyNode.class), TypeVariableName.get("T")));

        for (Parameter param : method.getParameters()) {
            methodSpecBuilder.addParameter(param.getType(), param.getName());
            if (param.getType().isArray()) {
                methodSpecBuilder.varargs();
            }
        }

        String returnStatement = "return c -> c.$L("
                + StringUtils.stripToEmpty(Stream.of(method.getParameters()).map(param -> "$L").collect(Collectors.joining(", ")))
                + ")";

        List<Object> parameters = new ArrayList<>();
        parameters.add(method.getName());
        for (Parameter param : method.getParameters()) {
            parameters.add(param.getName());
        }

        methodSpecBuilder.addStatement(
            returnStatement,
            Stream.concat(Stream.of(method.getName()), Stream.of(method.getParameters()).map(param -> param.getName())).toArray());

        return methodSpecBuilder.build();
    }

    public static Method findOriginallyDeclaredMethod(Method method) {
        Method originallyDeclaredMethod = null;
        for (Class<?> clazz : ClassUtils.hierarchy(method.getDeclaringClass(), Interfaces.INCLUDE)) {
            try {
                if (clazz.getDeclaredMethod(method.getName(), method.getParameterTypes()) != null) {
                    originallyDeclaredMethod = clazz.getDeclaredMethod(method.getName(), method.getParameterTypes());
                }
            } catch (NoSuchMethodException | SecurityException e) {
            }
        }

        return originallyDeclaredMethod != null ? originallyDeclaredMethod : method;
    }

    private static String propertyPlainName(String name) {
        return Introspector.decapitalize(StringUtils.substring(name, 3));
    }

}

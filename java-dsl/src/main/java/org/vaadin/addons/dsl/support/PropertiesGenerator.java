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
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import javax.lang.model.element.Modifier;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ClassUtils.Interfaces;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.vaadin.addons.dsl.core.PropertyNode;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoClassFilter;
import com.openpojo.reflection.filters.FilterChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.SingleComponentContainer;

public class PropertiesGenerator {

    public static void main(String[] args) throws IntrospectionException, IOException {

        Set<PojoClass> classes = PojoClassFactory
                .enumerateClassesByExtendingType("com.vaadin", Component.class,
                    new FilterChain(
                            filterComponentContainers(),
                            filterExcludedClasses(),
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
                    Method declaringMethod = findOriginallyDeclaredMethod(method.getMethod(), method.getMethod().getDeclaringClass());
                    Optional<Method> getterMethod = Stream.of(declaringMethod.getDeclaringClass().getMethods())
                            .filter(getter -> getter.getName().substring(3).equals(methodName.substring(3)))
                            .filter(getter -> getter.getName().startsWith("get"))
                            .findAny();
                    if (getterMethod.isPresent()) {
                        if (methodMap.get(declaringMethod) == null) {
                            methodMap.put(declaringMethod, new TreeSet<>((o1, o2) -> {
                                if (o1.equals(o2)) {
                                    return 0;
                                }
                                if (o1.isAssignableFrom(o2)) {
                                    return -1;
                                }
                                if (o2.isAssignableFrom(o1)) {
                                    return 1;
                                }
                                return 0;
                            }));
                        }
                        methodMap.get(declaringMethod).add(declaringMethod.getDeclaringClass());
                    }
                }
            });
        }

        methodMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(val -> {
                System.out.println("    " + val);
            });
        });
        System.out.println(methodMap.size());

        List<MethodSpec> methodSpecs = methodMap.entrySet()
                .stream()
                .map(entry -> {
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
                })
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

    public static Method findOriginallyDeclaredMethod(Method currentMethod, Class<?> currentClass) {
        return StreamSupport.stream(ClassUtils.hierarchy(Button.class, Interfaces.INCLUDE).spliterator(), false)
                .map(clazz -> getDeclaredMethod(currentMethod, clazz))
                .filter(method -> method != null)
                .findFirst()
                .orElse(currentMethod);
    }

    private static Method getDeclaredMethod(Method method, Class<?> clazz) {
        try {
            return clazz.getDeclaredMethod(method.getName(), method.getParameterTypes());
        } catch (NoSuchMethodException | SecurityException e) {
        }
        return null;
    }

    private static String propertyPlainName(String name) {
        return Introspector.decapitalize(StringUtils.substring(name, 3));
    }

    private static PojoClassFilter filterComponentContainers() {
        return pojoClass -> !(pojoClass.extendz(ComponentContainer.class) || pojoClass.extendz(SingleComponentContainer.class));
    }

    private static PojoClassFilter filterExcludedClasses() {
        return pojoClass -> Pattern.compile("^((?!ColorPicker).)*$").matcher(pojoClass.getName()).find();
    }

    private static PojoClassFilter filterNonConcreteClasses() {
        return pojoClass -> pojoClass.isConcrete();
    }

    private static PojoClassFilter filterDeprecatedClasses() {
        return pojoClass -> pojoClass.getAnnotation(Deprecated.class) == null;
    }

    private static PojoClassFilter hasDefaultConstructor() {
        return pojoClass -> pojoClass.getPojoConstructors()
                .stream()
                .filter(method -> method.getPojoParameters().isEmpty())
                .findAny()
                .isPresent();
    }

}

package org.vaadin.addons.dsl.support;

import java.beans.Introspector;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Modifier;

import org.vaadin.addons.dsl.core.ComponentNode;
import org.vaadin.addons.dsl.core.PropertyNode;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.WildcardTypeName;
import com.vaadin.ui.Component;

public class ComponentsGenerator extends AbstractGenerator {

    public static void main(String[] args) throws Exception {

        Set<PojoClass> classes = PojoClassFactory
                .enumerateClassesByExtendingType("com.vaadin.ui", Component.class,
                    new FilterChain(
                            filterComponentContainers(),
                            filterExcludedClassesPattern(),
                            filterNonConcreteClasses(),
                            filterDeprecatedClasses(),
                            hasDefaultConstructor()))
                .stream()
                .collect(Collectors.toSet());

        List<MethodSpec> methodSpecs = Stream
                .concat(
                    classes.stream().map(ComponentsGenerator::buildNewInstanceMethodSpec),
                    classes.stream().map(ComponentsGenerator::buildRefInstanceMethodSpec))
                .sorted((e1, e2) -> e1.name.compareTo(e2.name))
                .collect(Collectors.toList());

        TypeSpec.Builder typeSpecBuilder = TypeSpec
                .classBuilder("Components")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(AnnotationSpec.builder(SuppressWarnings.class)
                        .addMember("value", "{$S, $S}", "rawtypes", "unchecked")
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .build())
                .addMethods(methodSpecs);

        JavaFile javaFile = JavaFile
                .builder("org.vaadin.addons.dsl", typeSpecBuilder.build())
                .build();

        javaFile.writeTo(new File("src/main/java"));
    }

    private static MethodSpec buildNewInstanceMethodSpec(PojoClass pojoClass) {
        return MethodSpec
                .methodBuilder(Introspector.decapitalize(pojoClass.getClazz().getSimpleName()))
                .addAnnotation(SafeVarargs.class)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addTypeVariable(TypeVariableName.get("T", pojoClass.getClazz()))
                .returns(ParameterizedTypeName.get(ClassName.get(ComponentNode.class), TypeVariableName.get("T")))
                .addParameter(
                    ArrayTypeName.of(
                        ParameterizedTypeName.get(
                            ClassName.get(PropertyNode.class), WildcardTypeName.supertypeOf(TypeVariableName.get("T")))),
                    "args", Modifier.FINAL)
                .varargs()
                .addStatement("return new ComponentNode($L.class, args)", pojoClass.getClazz().getSimpleName())
                .build();
    }

    private static MethodSpec buildRefInstanceMethodSpec(PojoClass pojoClass) {
        return MethodSpec
                .methodBuilder(Introspector.decapitalize(pojoClass.getClazz().getSimpleName()))
                .addAnnotation(SafeVarargs.class)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addTypeVariable(TypeVariableName.get("T", pojoClass.getClazz()))
                .returns(ParameterizedTypeName.get(ClassName.get(ComponentNode.class), TypeVariableName.get("T")))
                .addParameter(ParameterSpec.builder(TypeVariableName.get("T"), "instance", Modifier.FINAL).build())
                .addParameter(
                    ArrayTypeName.of(
                        ParameterizedTypeName.get(
                            ClassName.get(PropertyNode.class), WildcardTypeName.supertypeOf(TypeVariableName.get("T")))),
                    "args", Modifier.FINAL)
                .varargs()
                .addStatement("return new ComponentNode(instance, args)")
                .build();
    }

}

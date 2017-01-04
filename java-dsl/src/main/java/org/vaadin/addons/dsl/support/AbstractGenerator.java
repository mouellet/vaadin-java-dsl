package org.vaadin.addons.dsl.support;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import com.openpojo.reflection.PojoClassFilter;
import com.openpojo.reflection.filters.FilterChain;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.SingleComponentContainer;

public abstract class AbstractGenerator {

    public static class SuperclassFirstComparator implements Comparator<Class<?>> {

        @Override
        public int compare(Class<?> o1, Class<?> o2) {
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
        }
    }

    protected static PojoClassFilter filterNonComponnentContainers() {
        return pojoClass -> pojoClass.extendz(ComponentContainer.class) || pojoClass.extendz(SingleComponentContainer.class);
    }

    protected static PojoClassFilter filterComponentContainers() {
        return pojoClass -> !(pojoClass.extendz(ComponentContainer.class) || pojoClass.extendz(SingleComponentContainer.class));
    }

    protected static PojoClassFilter filterExcludedClassesPattern() {
        return pojoClass -> Pattern.compile("^((?!ColorPicker|DragAndDropWrapper).)*$").matcher(pojoClass.getName()).find();
    }

    protected static PojoClassFilter filterExcludedClasses(Class<?>... excludes) {
        List<PojoClassFilter> filters = new ArrayList<>();
        for (Class<?> exclude : excludes) {
            filters.add(pojoClass -> !pojoClass.extendz(exclude));
        }
        return new FilterChain(filters.toArray(new PojoClassFilter[0]));
    }

    protected static PojoClassFilter filterIncludedClasses(Class<?>... includes) {
        List<PojoClassFilter> filters = new ArrayList<>();
        for (Class<?> include : includes) {
            filters.add(pojoClass -> pojoClass.extendz(include));
        }
        return new FilterChain(filters.toArray(new PojoClassFilter[0]));
    }

    protected static PojoClassFilter filterNonConcreteClasses() {
        return pojoClass -> pojoClass.isConcrete();
    }

    protected static PojoClassFilter filterDeprecatedClasses() {
        return pojoClass -> pojoClass.getAnnotation(Deprecated.class) == null;
    }

    protected static PojoClassFilter hasDefaultConstructor() {
        return pojoClass -> pojoClass.getPojoConstructors()
                .stream()
                .filter(method -> method.getPojoParameters().isEmpty())
                .findAny()
                .isPresent();
    }

}

package org.vaadin.addons.dsl.core;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.SingleComponentContainer;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ComponentNode<T extends Component> implements Node<T> {

    private Class<T> componentClass;
    private WeakReference<T> reference;
    private List<ComponentNode> children = new ArrayList<>();
    private List<PropertyNode> properties = new ArrayList<>();

    public ComponentNode(Class<T> componentClass) {
        this.componentClass = componentClass;
    }

    public ComponentNode(Class<T> componentClass, Node<? extends T>... args) {
        this(componentClass);
        Stream.of(args).forEach(node -> {
            if (node instanceof ComponentNode) {
                this.children.add((ComponentNode<? extends Component>) node);

            } else if (node instanceof PropertyNode) {
                this.properties.add((PropertyNode<? extends Component>) node);
            }
        });
    }

    public ComponentNode(T reference, Node<? extends T>... args) {
        this((Class<T>) reference.getClass(), args);
        this.reference = new WeakReference<>(reference);
    }

    public Class<T> getComponentClass() {
        return componentClass;
    }

    public WeakReference<T> getReference() {
        return reference;
    }

    public List<ComponentNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public List<PropertyNode> getProperties() {
        return Collections.unmodifiableList(properties);
    }

    public T get() {
        return internalGet(null, this);
    }

    private static <T extends Component> T internalGet(Component parent, ComponentNode<T> node) {

        try {
            T component;
            if (node.getReference() != null) {
                component = node.getReference().get();
            } else {
                component = node.getComponentClass().newInstance();
            }

            node.getChildren().forEach(childNode -> internalGet(component, childNode));

            if (parent != null) {
                if (ComponentContainer.class.isAssignableFrom(parent.getClass())) {
                    ((ComponentContainer) parent).addComponent(component);

                } else if (SingleComponentContainer.class.isAssignableFrom(parent.getClass())) {
                    ((SingleComponentContainer) parent).setContent(component);
                }
            }

            node.getProperties().forEach(attributeNode -> {
                attributeNode.apply(component);
            });

            return component;

        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}

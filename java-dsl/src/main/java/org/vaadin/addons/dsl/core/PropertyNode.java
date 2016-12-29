package org.vaadin.addons.dsl.core;

import com.vaadin.ui.Component;

@FunctionalInterface
public interface PropertyNode<T extends Component> extends Node<T> {

    void apply(T c);
}

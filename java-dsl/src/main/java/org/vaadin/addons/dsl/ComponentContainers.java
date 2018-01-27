package org.vaadin.addons.dsl;

import org.vaadin.addons.dsl.core.ComponentNode;
import org.vaadin.addons.dsl.core.Node;

import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ComponentContainers {

    private ComponentContainers() {
    }

    @SafeVarargs
    public static <T extends AbsoluteLayout> ComponentNode<T> absoluteLayout(final Node<? extends Component>... args) {
        return new ComponentNode(AbsoluteLayout.class, args);
    }

    @SafeVarargs
    public static <T extends AbsoluteLayout> ComponentNode<T> absoluteLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends Accordion> ComponentNode<T> accordion(final Node<? extends Component>... args) {
        return new ComponentNode(Accordion.class, args);
    }

    @SafeVarargs
    public static <T extends Accordion> ComponentNode<T> accordion(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends CssLayout> ComponentNode<T> cssLayout(final Node<? extends Component>... args) {
        return new ComponentNode(CssLayout.class, args);
    }

    @SafeVarargs
    public static <T extends CssLayout> ComponentNode<T> cssLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends CustomLayout> ComponentNode<T> customLayout(final Node<? extends Component>... args) {
        return new ComponentNode(CustomLayout.class, args);
    }

    @SafeVarargs
    public static <T extends CustomLayout> ComponentNode<T> customLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends FormLayout> ComponentNode<T> formLayout(final Node<? extends Component>... args) {
        return new ComponentNode(FormLayout.class, args);
    }

    @SafeVarargs
    public static <T extends FormLayout> ComponentNode<T> formLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends GridLayout> ComponentNode<T> gridLayout(final Node<? extends Component>... args) {
        return new ComponentNode(GridLayout.class, args);
    }

    @SafeVarargs
    public static <T extends GridLayout> ComponentNode<T> gridLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends HorizontalLayout> ComponentNode<T> horizontalLayout(final Node<? extends Component>... args) {
        return new ComponentNode(HorizontalLayout.class, args);
    }

    @SafeVarargs
    public static <T extends HorizontalLayout> ComponentNode<T> horizontalLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends HorizontalSplitPanel> ComponentNode<T> horizontalSplitPanel(final Node<? extends Component>... args) {
        return new ComponentNode(HorizontalSplitPanel.class, args);
    }

    @SafeVarargs
    public static <T extends HorizontalSplitPanel> ComponentNode<T> horizontalSplitPanel(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends LoginForm> ComponentNode<T> loginForm(final Node<? extends Component>... args) {
        return new ComponentNode(LoginForm.class, args);
    }

    @SafeVarargs
    public static <T extends LoginForm> ComponentNode<T> loginForm(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends Panel> ComponentNode<T> panel(final Node<? extends Component>... args) {
        return new ComponentNode(Panel.class, args);
    }

    @SafeVarargs
    public static <T extends Panel> ComponentNode<T> panel(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends TabSheet> ComponentNode<T> tabSheet(final Node<? extends Component>... args) {
        return new ComponentNode(TabSheet.class, args);
    }

    @SafeVarargs
    public static <T extends TabSheet> ComponentNode<T> tabSheet(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends VerticalLayout> ComponentNode<T> verticalLayout(final Node<? extends Component>... args) {
        return new ComponentNode(VerticalLayout.class, args);
    }

    @SafeVarargs
    public static <T extends VerticalLayout> ComponentNode<T> verticalLayout(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }

    @SafeVarargs
    public static <T extends VerticalSplitPanel> ComponentNode<T> verticalSplitPanel(final Node<? extends Component>... args) {
        return new ComponentNode(VerticalSplitPanel.class, args);
    }

    @SafeVarargs
    public static <T extends VerticalSplitPanel> ComponentNode<T> verticalSplitPanel(final T instance, final Node<? extends Component>... args) {
        return new ComponentNode(instance, args);
    }
}

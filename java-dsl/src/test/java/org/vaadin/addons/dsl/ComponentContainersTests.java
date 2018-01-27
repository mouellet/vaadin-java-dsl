package org.vaadin.addons.dsl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.ComponentContainers.absoluteLayout;
import static org.vaadin.addons.dsl.ComponentContainers.accordion;
import static org.vaadin.addons.dsl.ComponentContainers.cssLayout;
import static org.vaadin.addons.dsl.ComponentContainers.customLayout;
import static org.vaadin.addons.dsl.ComponentContainers.formLayout;
import static org.vaadin.addons.dsl.ComponentContainers.gridLayout;
import static org.vaadin.addons.dsl.ComponentContainers.horizontalLayout;
import static org.vaadin.addons.dsl.ComponentContainers.horizontalSplitPanel;
import static org.vaadin.addons.dsl.ComponentContainers.loginForm;
import static org.vaadin.addons.dsl.ComponentContainers.panel;
import static org.vaadin.addons.dsl.ComponentContainers.tabSheet;
import static org.vaadin.addons.dsl.ComponentContainers.verticalLayout;
import static org.vaadin.addons.dsl.ComponentContainers.verticalSplitPanel;

import org.junit.Test;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.VerticalLayout;

public class ComponentContainersTests {

    private static final VerticalLayout VERTICAL_LAYOUT = new VerticalLayout();

    @Test
    public void testComponentContainers() {

        CssLayout root = cssLayout(
            absoluteLayout(),
            accordion(),
            cssLayout(),
            customLayout(),
            formLayout(),
            gridLayout(),
            horizontalLayout(),
            horizontalSplitPanel(),
            loginForm(),
            panel(),
            tabSheet(),
            verticalLayout(),
            verticalSplitPanel())
                .get();

        assertThat(root).isNotNull();
        assertThat(root.getComponentCount()).isEqualTo(13);
    }

    @Test
    public void testComponentContainersInstance() {

        CssLayout root = cssLayout(
            verticalLayout(VERTICAL_LAYOUT))
                .get();

        assertThat(root).isNotNull();
        assertThat(root.iterator()).contains(VERTICAL_LAYOUT);
    }

}

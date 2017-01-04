package org.vaadin.addons.dsl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
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

public class ComponentContainersTest {

    @Test
    public void testComponentContainerInstanciated() {

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

        assertNotNull(root);
        assertTrue(root.getComponentCount() > 1);
    }

    @Test
    public void testComponentContainerReferenceAssigned() {

        VerticalLayout verticalLayout = new VerticalLayout();

        CssLayout root = cssLayout(
            verticalLayout(verticalLayout))
                    .get();

        assertNotNull(root);
        assertTrue(root.getComponent(0).equals(verticalLayout));
    }

}

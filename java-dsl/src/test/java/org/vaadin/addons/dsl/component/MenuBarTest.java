package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.menuBar;
import static org.vaadin.addons.dsl.Properties.autoOpen;
import static org.vaadin.addons.dsl.Properties.moreMenuItem;
import static org.vaadin.addons.dsl.Properties.tabIndex;

import org.junit.Test;

public class MenuBarTest {

    @Test
    public void testSpecificPropertySetters() {
        menuBar(
            autoOpen(true),
            // FIXME conflicts w. Tree
            // htmlContentAllowed(true),
            // TODO validate usability
            moreMenuItem(null),
            tabIndex(0));
    }
}

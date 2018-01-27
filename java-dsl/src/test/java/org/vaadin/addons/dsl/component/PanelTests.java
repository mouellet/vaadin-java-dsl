package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.ComponentContainers.panel;
import static org.vaadin.addons.dsl.Properties.caption;
import static org.vaadin.addons.dsl.Properties.scrollLeft;
import static org.vaadin.addons.dsl.Properties.scrollTop;
import static org.vaadin.addons.dsl.Properties.tabIndex;

import org.junit.Test;

public class PanelTests {

    @Test
    public void testSpecificPropertySetters() {
        panel(
            caption(""),
            scrollLeft(10),
            scrollTop(10),
            tabIndex(1));
    }
}

package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.flash;
import static org.vaadin.addons.dsl.Properties.archive;
import static org.vaadin.addons.dsl.Properties.codebase;
import static org.vaadin.addons.dsl.Properties.codetype;
import static org.vaadin.addons.dsl.Properties.parameter;
import static org.vaadin.addons.dsl.Properties.standby;

import org.junit.Test;

public class FlashTest {

    @Test
    public void testSpecificPropertySetters() {
        flash(
            archive(""),
            codebase(""),
            codetype(""),
            parameter("name", "value"),
            standby(""));
    }
}

package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.twinColSelect;
import static org.vaadin.addons.dsl.Properties.leftColumnCaption;
import static org.vaadin.addons.dsl.Properties.rightColumnCaption;

import org.junit.Test;

public class TwinColSelectTest {

    @Test
    public void testSpecificPropertySetters() {
        twinColSelect(
            // FIXME conflicts w. AbstractTextField
            // columns(10),
            leftColumnCaption(""),
            rightColumnCaption("")
        // FIXME conflics w. GridLayout
        // rows(100)
        );
    }
}

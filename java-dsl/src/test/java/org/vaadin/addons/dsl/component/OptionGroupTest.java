package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.optionGroup;
import static org.vaadin.addons.dsl.Properties.itemEnabled;

import org.junit.Test;

public class OptionGroupTest {

    @Test
    public void testSpecificPropertySetters() {
        optionGroup(
            // FIXME conflicts w. Tree
            // htmlContentAllowed(true),
            // TODO validate usability
            itemEnabled(new Object(), true));
    }
}

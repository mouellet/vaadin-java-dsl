package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.nativeSelect;
import static org.vaadin.addons.dsl.Properties.multiSelect;
import static org.vaadin.addons.dsl.Properties.newItemsAllowed;

import org.junit.Test;

public class NativeSelectTest {

    @Test
    public void testSpecificPropertySetters() {
        nativeSelect(
            // FIXME conflicts w. Grid (and Deprecated)
            // columns(10),
            multiSelect(true),
            newItemsAllowed(true));
    }
}

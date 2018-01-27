package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.progressBar;
import static org.vaadin.addons.dsl.Properties.indeterminate;
import static org.vaadin.addons.dsl.Properties.value;

import org.junit.Test;

public class ProgressBarTests {

    @Test
    public void testSpecificPropertySetters() {
        progressBar(
            indeterminate(true),
            value(100F));
    }
}

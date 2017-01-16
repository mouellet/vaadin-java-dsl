package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.textArea;
import static org.vaadin.addons.dsl.Properties.wordwrap;

import org.junit.Test;

public class TextAreaTest {

    @Test
    public void testSpecificPropertySetters() {
        textArea(
            // FIXME conflicts w. GridLayout
            // rows(100),
            wordwrap(true));
    }
}

package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.richTextArea;
import static org.vaadin.addons.dsl.Properties.readOnly;

import org.junit.Test;

public class RichTextAreaTests {

    @Test
    public void testSpecificPropertySetters() {
        richTextArea(
            // FIXME conflicts w. AbstractTextField
            // nullRepresentation(""),
            // FIXME conflicts w. AbstractTextField
            // nullSettingAllowed(true),
            readOnly(true));
    }
}

package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.popupDateField;
import static org.vaadin.addons.dsl.Properties.assistiveText;
import static org.vaadin.addons.dsl.Properties.textFieldEnabled;

import org.junit.Test;

public class PopupDateFieldTest {

    @Test
    public void testSpecificPropertySetters() {
        popupDateField(
            assistiveText(""),
            // FIXME conflicts w. AbstractTextField
            // inputPrompt(""),
            textFieldEnabled(true));
    }
}

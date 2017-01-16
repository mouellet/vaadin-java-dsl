package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.textField;
import static org.vaadin.addons.dsl.Properties.columns;
import static org.vaadin.addons.dsl.Properties.cursorPosition;
import static org.vaadin.addons.dsl.Properties.inputPrompt;
import static org.vaadin.addons.dsl.Properties.maxLength;
import static org.vaadin.addons.dsl.Properties.nullRepresentation;
import static org.vaadin.addons.dsl.Properties.selectionRange;
import static org.vaadin.addons.dsl.Properties.textChangeEventMode;
import static org.vaadin.addons.dsl.Properties.textChangeTimeout;
import static org.vaadin.addons.dsl.Properties.value;

import org.junit.Test;

import com.vaadin.ui.AbstractTextField.TextChangeEventMode;

public class AbstractTextFieldTest {

    @Test
    public void testSpecificPropertySetters() {
        textField(
            columns(100),
            cursorPosition(0),
            inputPrompt(""),
            maxLength(100),
            nullRepresentation(""),
            // FIXME conflicts w. AbstractSelect
            // nullSelectionAllowed(true),
            selectionRange(0, 100),
            textChangeEventMode(TextChangeEventMode.EAGER),
            textChangeTimeout(1000),
            value(new String("")));
    }
}

package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.textField;
import static org.vaadin.addons.dsl.Properties.cursorPosition;
import static org.vaadin.addons.dsl.Properties.maxLength;
import static org.vaadin.addons.dsl.Properties.placeholder;
import static org.vaadin.addons.dsl.Properties.value;

import org.junit.Test;

import com.vaadin.ui.TextField;

public class AbstractTextFieldTests {

    private static final int CURSOR_POSITION = -1;
    private static final int MAX_LENGTH = 11;
    private static final String PLACE_HOLDER = "placeHolder";
    private static final String VALUE = "value";

    @Test
    public void testProperties() {
        TextField component = textField(
            cursorPosition(CURSOR_POSITION),
            maxLength(MAX_LENGTH),
            placeholder(PLACE_HOLDER),
            value(VALUE))
                .get();

        assertThat(component.getCursorPosition()).isEqualTo(CURSOR_POSITION);
        assertThat(component.getMaxLength()).isEqualTo(MAX_LENGTH);
        assertThat(component.getPlaceholder()).isEqualTo(PLACE_HOLDER);
        assertThat(component.getValue()).isEqualTo(VALUE);
    }
}

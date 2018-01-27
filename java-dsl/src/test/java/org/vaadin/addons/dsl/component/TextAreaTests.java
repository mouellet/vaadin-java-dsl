package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.textArea;
import static org.vaadin.addons.dsl.Properties.wordWrap;

import org.junit.Test;

import com.vaadin.ui.TextArea;

public class TextAreaTests {

    @Test
    public void testProperties() {
        TextArea component = textArea(
            wordWrap(true))
                .get();

        assertThat(component.isWordWrap()).isTrue();
    }
}

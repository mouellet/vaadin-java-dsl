package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.checkBox;
import static org.vaadin.addons.dsl.Listeners.onAttach;
import static org.vaadin.addons.dsl.Listeners.onBlur;
import static org.vaadin.addons.dsl.Listeners.onContextClick;
import static org.vaadin.addons.dsl.Listeners.onDetach;
import static org.vaadin.addons.dsl.Listeners.onFocus;
import static org.vaadin.addons.dsl.Properties.value;

import org.junit.Test;

import com.vaadin.event.ContextClickEvent;
import com.vaadin.event.FieldEvents;
import com.vaadin.server.ClientConnector;
import com.vaadin.ui.CheckBox;

public class CheckBoxTests {

    @Test
    public void testProperties() {
        CheckBox component = checkBox(
            value(true))
                .get();

        assertThat(component.getValue()).isTrue();
    }

    @Test
    public void testListeners() {
        CheckBox component = checkBox(
            onAttach(event -> event.getSource()),
            onDetach(event -> event.getSource()),
            onBlur(event -> event.getSource()),
            onFocus(event -> event.getSource()),
            onContextClick(event -> event.getSource()))
                .get();

        assertThat(component.getListeners(ClientConnector.AttachEvent.class)).isNotEmpty();
        assertThat(component.getListeners(ClientConnector.DetachEvent.class)).isNotEmpty();
        assertThat(component.getListeners(FieldEvents.BlurEvent.class)).isNotEmpty();
        assertThat(component.getListeners(FieldEvents.FocusEvent.class)).isNotEmpty();
        assertThat(component.getListeners(ContextClickEvent.class)).isNotEmpty();

    }

}

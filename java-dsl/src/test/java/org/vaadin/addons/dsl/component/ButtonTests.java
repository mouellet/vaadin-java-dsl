package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.button;
import static org.vaadin.addons.dsl.Listeners.onAttach;
import static org.vaadin.addons.dsl.Listeners.onBlur;
import static org.vaadin.addons.dsl.Listeners.onButtonClick;
import static org.vaadin.addons.dsl.Listeners.onContextClick;
import static org.vaadin.addons.dsl.Listeners.onDetach;
import static org.vaadin.addons.dsl.Listeners.onFocus;
import static org.vaadin.addons.dsl.Properties.clickShortcut;
import static org.vaadin.addons.dsl.Properties.disableOnClick;
import static org.vaadin.addons.dsl.Properties.icon;
import static org.vaadin.addons.dsl.Properties.iconAlternateText;

import org.junit.Test;

import com.vaadin.event.ContextClickEvent;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutAction.ModifierKey;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ClientConnector;
import com.vaadin.ui.Button;

public class ButtonTests {

    private static final VaadinIcons ICON = VaadinIcons.ADJUST;
    private static final String ICON_ALT_TEXT = "iconAltText";

    @Test
    public void testProperties() {

        Button component = button(
            clickShortcut(KeyCode.ENTER, ModifierKey.CTRL),
            disableOnClick(true),
            icon(ICON),
            iconAlternateText(ICON_ALT_TEXT))
                .get();

        assertThat(component.isDisableOnClick()).isTrue();
        assertThat(component.getIcon()).isEqualTo(ICON);
        assertThat(component.getIconAlternateText()).isEqualTo(ICON_ALT_TEXT);
    }

    @Test
    public void testListeners() {

        Button component = button(
            onAttach(event -> event.getSource()),
            onDetach(event -> event.getSource()),
            onBlur(event -> event.getSource()),
            onFocus(event -> event.getSource()),
            onContextClick(event -> event.getSource()),
            onButtonClick(event -> event.getButton()))
                .get();

        assertThat(component.getListeners(ClientConnector.AttachEvent.class)).isNotEmpty();
        assertThat(component.getListeners(ClientConnector.DetachEvent.class)).isNotEmpty();
        assertThat(component.getListeners(FieldEvents.BlurEvent.class)).isNotEmpty();
        assertThat(component.getListeners(FieldEvents.FocusEvent.class)).isNotEmpty();
        assertThat(component.getListeners(ContextClickEvent.class)).isNotEmpty();
        assertThat(component.getListeners(Button.ClickEvent.class)).isNotEmpty();
    }

}

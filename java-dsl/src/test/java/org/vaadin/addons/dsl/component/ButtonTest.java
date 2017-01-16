package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.button;
import static org.vaadin.addons.dsl.Properties.clickShortcut;
import static org.vaadin.addons.dsl.Properties.disableOnClick;
import static org.vaadin.addons.dsl.Properties.icon;
import static org.vaadin.addons.dsl.Properties.iconAlternateText;

import org.junit.Test;

import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutAction.ModifierKey;
import com.vaadin.server.FontAwesome;

public class ButtonTest {

    @Test
    public void testSpecificPropertySetters() {

        button(
            clickShortcut(KeyCode.ENTER, ModifierKey.CTRL),
            disableOnClick(true),
            // FIXME conflicts w. Tree
            // htmlContentAllowed(true),
            icon(FontAwesome.ADJUST, "iconAltText"),
            iconAlternateText("iconAltText"));
    }
}

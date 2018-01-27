package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.popupView;
import static org.vaadin.addons.dsl.Properties.content;
import static org.vaadin.addons.dsl.Properties.hideOnMouseOut;
import static org.vaadin.addons.dsl.Properties.popupVisible;

import org.junit.Test;

import com.vaadin.ui.Component;
import com.vaadin.ui.PopupView;

public class PopupViewTests {

    @Test
    public void testSpecificPropertySetters() {
        popupView(
            content(new PopupViewContent()),
            hideOnMouseOut(true),
            popupVisible(true));
    }

    static class PopupViewContent implements PopupView.Content {

        @Override
        public String getMinimizedValueAsHTML() {
            return null;
        }

        @Override
        public Component getPopupComponent() {
            return null;
        }
    }
}

package org.vaadin.addons.dsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.vaadin.addons.dsl.Attributes.disableOnClick;
import static org.vaadin.addons.dsl.Attributes.sizeFull;
import static org.vaadin.addons.dsl.Attributes.styleName;
import static org.vaadin.addons.dsl.Attributes.value;
import static org.vaadin.addons.dsl.ComponentContainers.cssLayout;
import static org.vaadin.addons.dsl.ComponentContainers.verticalLayout;
import static org.vaadin.addons.dsl.Components.button;
import static org.vaadin.addons.dsl.Components.textField;
import static org.vaadin.addons.dsl.Listeners.onBlur;
import static org.vaadin.addons.dsl.Listeners.onButtonClick;

import org.junit.Test;

import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class ComponentsTest {

    private CssLayout cssLayout;

    private TextField textField = new TextField();

    @Test
    public void test() {

        cssLayout = cssLayout(
            textField(textField,
                sizeFull(),
                value("Text"),
                onBlur(System.out::println)),
            verticalLayout(
                sizeFull(),
                textField(),
                button(
                    onButtonClick(System.out::println))),
            button(
                styleName("v-button"),
                disableOnClick(true))).get();

        assertNotNull(cssLayout);
        assertEquals(textField, cssLayout.getComponent(0));
        assertTrue(cssLayout.getComponent(1) instanceof VerticalLayout);
        assertTrue(cssLayout.getComponent(2) instanceof Button);
    }

}

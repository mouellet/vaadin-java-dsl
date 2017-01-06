package org.vaadin.addons.dsl.demo;

import static org.vaadin.addons.dsl.Properties.disableOnClick;
import static org.vaadin.addons.dsl.Properties.sizeFull;
import static org.vaadin.addons.dsl.Properties.styleName;
import static org.vaadin.addons.dsl.Properties.value;
import static org.vaadin.addons.dsl.ComponentContainers.cssLayout;
import static org.vaadin.addons.dsl.ComponentContainers.verticalLayout;
import static org.vaadin.addons.dsl.Components.button;
import static org.vaadin.addons.dsl.Components.textField;
import static org.vaadin.addons.dsl.Listeners.onBlur;
import static org.vaadin.addons.dsl.Listeners.onButtonClick;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@Theme("valo")
@Title("Java DSL Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {

        setContent(cssLayout(
            textField(
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
                disableOnClick(true))).get());
    }

}

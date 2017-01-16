package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.ComponentContainers.loginForm;
import static org.vaadin.addons.dsl.Properties.loginButtonCaption;
import static org.vaadin.addons.dsl.Properties.passwordCaption;
import static org.vaadin.addons.dsl.Properties.usernameCaption;

import org.junit.Test;

public class LoginFormTest {

    @Test
    public void testSpecificPropertySetters() {
        loginForm(
            passwordCaption("Password"),
            usernameCaption("Username"),
            loginButtonCaption("Login"));
    }
}

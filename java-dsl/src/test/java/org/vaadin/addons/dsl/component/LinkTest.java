package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.link;
import static org.vaadin.addons.dsl.Properties.resource;
import static org.vaadin.addons.dsl.Properties.targetBorder;
import static org.vaadin.addons.dsl.Properties.targetHeight;
import static org.vaadin.addons.dsl.Properties.targetName;
import static org.vaadin.addons.dsl.Properties.targetWidth;

import org.junit.Test;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.BorderStyle;

public class LinkTest {

    @Test
    public void testSpecificPropertySetters() {
        link(
            resource(FontAwesome.ADJUST),
            targetBorder(BorderStyle.NONE),
            targetHeight(10),
            targetName("targetName"),
            targetWidth(100));
    }
}

package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.video;
import static org.vaadin.addons.dsl.Properties.poster;

import org.junit.Test;

import com.vaadin.server.FontAwesome;

public class VideoTests {

    @Test
    public void testSpecificPropertySetters() {

        video(
            poster(FontAwesome.ADJUST));
    }
}

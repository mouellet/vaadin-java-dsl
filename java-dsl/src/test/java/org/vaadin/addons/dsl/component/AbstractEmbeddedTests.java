package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.image;
import static org.vaadin.addons.dsl.Properties.alternateText;
import static org.vaadin.addons.dsl.Properties.source;

import org.junit.Test;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Image;

public class AbstractEmbeddedTests {

    private static final String ALT_TEXT = "altText";
    private static final VaadinIcons SOURCE = VaadinIcons.ABACUS;

    @Test
    public void testProperties() {
        Image component = image(
            alternateText(ALT_TEXT),
            source(SOURCE))
                .get();

        assertThat(component.getAlternateText()).isEqualTo(ALT_TEXT);
        assertThat(component.getSource()).isEqualTo(SOURCE);
    }
}

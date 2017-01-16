package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.embedded;
import static org.vaadin.addons.dsl.Properties.classId;
import static org.vaadin.addons.dsl.Properties.mimeType;
import static org.vaadin.addons.dsl.Properties.type;

import org.junit.Test;

public class EmbeddedTest {

    @Test
    public void testSpecificPropertySetters() {
        embedded(
            // FIXME conflicts w. AbstractEmbedded
            // alternateText(""),
            // FIXME conflicts w. Flash
            // archive(""),
            classId(""),
            // FIXME conflicts w. Flash
            // codebase(""),
            // FIXME conflicts w. Flash
            // codetype(""),
            mimeType(""),
            // FIXME conflicts w. Flash
            // parameter("name", "value"),
            // FIXME conflicts w. AbstractEmbedded
            // source(FontAwesome.ADJUST),
            // FIXME conflicts w. Flash
            // standby(""),
            type(0));
    }
}

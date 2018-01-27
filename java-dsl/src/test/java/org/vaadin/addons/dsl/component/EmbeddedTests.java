package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.embedded;
import static org.vaadin.addons.dsl.Properties.classId;
import static org.vaadin.addons.dsl.Properties.mimeType;
import static org.vaadin.addons.dsl.Properties.type;

import org.junit.Test;

import com.vaadin.ui.Embedded;

public class EmbeddedTests {

    private static final String CLASS_ID = "classId";
    private static final String MIME_TYPE = "mimeType";
    private static final int TYPE_OBJECT = Embedded.TYPE_OBJECT;

    @Test
    public void testSpecificPropertySetters() {
        Embedded component = embedded(
            classId(CLASS_ID),
            mimeType(MIME_TYPE),
            type(TYPE_OBJECT))
                .get();

        assertThat(component.getClassId()).isEqualTo(CLASS_ID);
        assertThat(component.getMimeType()).isEqualTo(MIME_TYPE);
        assertThat(component.getType()).isEqualTo(TYPE_OBJECT);
    }
}

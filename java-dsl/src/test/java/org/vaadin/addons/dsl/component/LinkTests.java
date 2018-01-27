package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.link;
import static org.vaadin.addons.dsl.Properties.resource;
import static org.vaadin.addons.dsl.Properties.targetBorder;
import static org.vaadin.addons.dsl.Properties.targetHeight;
import static org.vaadin.addons.dsl.Properties.targetName;
import static org.vaadin.addons.dsl.Properties.targetWidth;

import org.junit.Test;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;

public class LinkTests {

    private static final VaadinIcons RESOURCE = VaadinIcons.ADJUST;
    private static final BorderStyle BORDER_STYLE = BorderStyle.NONE;
    private static final Integer TARGET_HEIGHT = 10;
    private static final String TARGET_NAME = "targetName";
    private static final Integer TARGET_WIDTH = 100;

    @Test
    public void testProperties() {
        Link component = link(
            resource(RESOURCE),
            targetBorder(BORDER_STYLE),
            targetHeight(TARGET_HEIGHT),
            targetName(TARGET_NAME),
            targetWidth(TARGET_WIDTH))
                .get();

        assertThat(component.getResource()).isEqualTo(RESOURCE);
        assertThat(component.getTargetBorder()).isEqualByComparingTo(BORDER_STYLE);
        assertThat(component.getTargetHeight()).isEqualByComparingTo(TARGET_HEIGHT);
        assertThat(component.getTargetName()).isEqualTo(TARGET_NAME);
        assertThat(component.getTargetWidth()).isEqualByComparingTo(TARGET_WIDTH);
    }
}

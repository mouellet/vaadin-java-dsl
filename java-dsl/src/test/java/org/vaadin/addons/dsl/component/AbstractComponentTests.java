package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.label;
import static org.vaadin.addons.dsl.Properties.captionAsHtml;
import static org.vaadin.addons.dsl.Properties.componentError;
import static org.vaadin.addons.dsl.Properties.data;
import static org.vaadin.addons.dsl.Properties.description;
import static org.vaadin.addons.dsl.Properties.locale;
import static org.vaadin.addons.dsl.Properties.responsive;
import static org.vaadin.addons.dsl.Properties.styleName;

import java.util.Locale;

import org.junit.Test;

import com.vaadin.server.UserError;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

public class AbstractComponentTests {

    private static final UserError COMPONENT_ERROR = new UserError("textErrorMassage");
    private static final Object DATA = new Object();
    private static final String DESCRIPTION = "description";
    private static final Locale LOCALE = Locale.ITALIAN;
    private static final String STYLE_NAME = "styleName";

    @Test
    public void testProperties() {
        Label component = label(
            captionAsHtml(true),
            componentError(COMPONENT_ERROR),
            data(DATA),
            description(DESCRIPTION),
            description(DESCRIPTION, ContentMode.TEXT),
            locale(LOCALE),
            responsive(true),
            styleName(STYLE_NAME, true))
                .get();

        assertThat(component.isCaptionAsHtml()).isTrue();
        assertThat(component.getComponentError()).isEqualTo(COMPONENT_ERROR);
        assertThat(component.getData()).isEqualTo(DATA);
        assertThat(component.getDescription()).isEqualTo(DESCRIPTION);
        assertThat(component.getLocale()).isEqualTo(LOCALE);
        assertThat(component.isResponsive()).isTrue();
        assertThat(component.getStyleName()).isEqualTo(STYLE_NAME);
    }

}

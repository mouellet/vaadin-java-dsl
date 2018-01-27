package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.comboBox;
import static org.vaadin.addons.dsl.Properties.emptySelectionAllowed;
import static org.vaadin.addons.dsl.Properties.emptySelectionCaption;
import static org.vaadin.addons.dsl.Properties.pageLength;
import static org.vaadin.addons.dsl.Properties.popupWidth;
import static org.vaadin.addons.dsl.Properties.scrollToSelectedItem;
import static org.vaadin.addons.dsl.Properties.textInputAllowed;

import org.junit.Test;

import com.vaadin.ui.ComboBox;

public class ComboBoxTests {

    private static final String EMPTY_SELECTION_CAPTION = "emptySelectionCaption";
    private static final int PAGE_LENGTH = 12;
    private static final String POPUP_WIDTH = "100%";

    @Test
    public void testProperties() {
        ComboBox<String> component = comboBox(
            emptySelectionAllowed(true),
            emptySelectionCaption(EMPTY_SELECTION_CAPTION),
            pageLength(PAGE_LENGTH),
            popupWidth(POPUP_WIDTH),
            scrollToSelectedItem(true),
            textInputAllowed(false))
                .get();

        assertThat(component.isEmptySelectionAllowed()).isTrue();
        assertThat(component.getEmptySelectionCaption()).isEqualTo(EMPTY_SELECTION_CAPTION);
        assertThat(component.getPageLength()).isEqualTo(PAGE_LENGTH);
        assertThat(component.getPopupWidth()).isEqualTo(POPUP_WIDTH);
        assertThat(component.isScrollToSelectedItem()).isTrue();
        assertThat(component.isTextInputAllowed()).isFalse();
    }
}

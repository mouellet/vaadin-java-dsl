package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.comboBox;
import static org.vaadin.addons.dsl.Properties.filteringMode;
import static org.vaadin.addons.dsl.Properties.itemStyleGenerator;
import static org.vaadin.addons.dsl.Properties.multiSelect;
import static org.vaadin.addons.dsl.Properties.popupWidth;
import static org.vaadin.addons.dsl.Properties.scrollToSelectedItem;
import static org.vaadin.addons.dsl.Properties.textInputAllowed;

import org.junit.Test;

import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.ui.ComboBox;

public class ComboBoxTest {

    @Test
    public void testSpecificPropertySetters() {
        comboBox(
            filteringMode(FilteringMode.STARTSWITH),
            // FIXME conflicts w. AbstractTextField
            // inputPrompt("inputPrompt")
            itemStyleGenerator(new ComboBoxItemStyleGenerator()),
            multiSelect(false),
            // FIXME conflicts w. Table
            // pageLength(10)
            popupWidth("100%"),
            scrollToSelectedItem(true),
            textInputAllowed(true));
    }

    static class ComboBoxItemStyleGenerator implements ComboBox.ItemStyleGenerator {

        @Override
        public String getStyle(ComboBox source, Object itemId) {
            return null;
        }
    }
}

package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.nativeSelect;
import static org.vaadin.addons.dsl.Properties.visibleItemCount;

import org.junit.Test;

import com.vaadin.ui.NativeSelect;

public class NativeSelectTests {

    private static final Integer VISIBLE_ITEM_COUNT = 12;

    @Test
    public void testSpecificPropertySetters() {
        NativeSelect<String> component = nativeSelect(
            visibleItemCount(VISIBLE_ITEM_COUNT))
                .get();

        assertThat(component.getVisibleItemCount()).isEqualByComparingTo(VISIBLE_ITEM_COUNT);
    }
}

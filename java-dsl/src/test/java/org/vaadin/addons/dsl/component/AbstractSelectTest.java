package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.comboBox;
import static org.vaadin.addons.dsl.Properties.containerDataSource;
import static org.vaadin.addons.dsl.Properties.itemCaption;
import static org.vaadin.addons.dsl.Properties.itemCaptionMode;
import static org.vaadin.addons.dsl.Properties.itemCaptionPropertyId;
import static org.vaadin.addons.dsl.Properties.itemIcon;
import static org.vaadin.addons.dsl.Properties.itemIconPropertyId;
import static org.vaadin.addons.dsl.Properties.multiSelect;
import static org.vaadin.addons.dsl.Properties.newItemHandler;
import static org.vaadin.addons.dsl.Properties.newItemsAllowed;
import static org.vaadin.addons.dsl.Properties.nullSelectionAllowed;
import static org.vaadin.addons.dsl.Properties.nullSelectionItemId;
import static org.vaadin.addons.dsl.Properties.value;

import org.junit.Test;
import org.vaadin.addons.dsl.test.Pojo;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;

public class AbstractSelectTest {

    @Test
    public void testSpecificPropertySetters() {

        Container container = new BeanItemContainer<>(Pojo.class);

        comboBox(
            containerDataSource(container),
            // TODO validate usability
            itemCaption(new Object(), ""),
            itemCaptionMode(ItemCaptionMode.EXPLICIT),
            itemCaptionPropertyId("propertyId"),
            // TODO validate usability
            itemIcon(new Object(), FontAwesome.ADJUST),
            itemIconPropertyId("propertyId"),
            multiSelect(true),
            newItemHandler(new AbstractSelectNewItemHandler()),
            newItemsAllowed(true),
            nullSelectionAllowed(true),
            nullSelectionItemId(new Object()),
            value(new Object()));
    }

    static class AbstractSelectNewItemHandler implements AbstractSelect.NewItemHandler {

        @Override
        public void addNewItem(String newItemCaption) {
        }
    }
}

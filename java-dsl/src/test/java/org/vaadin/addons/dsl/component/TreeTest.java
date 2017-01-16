package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.tree;
import static org.vaadin.addons.dsl.Properties.childrenAllowed;
import static org.vaadin.addons.dsl.Properties.containerDataSource;
import static org.vaadin.addons.dsl.Properties.dragMode;
import static org.vaadin.addons.dsl.Properties.htmlContentAllowed;
import static org.vaadin.addons.dsl.Properties.itemIcon;
import static org.vaadin.addons.dsl.Properties.itemIconAlternateText;
import static org.vaadin.addons.dsl.Properties.itemStyleGenerator;
import static org.vaadin.addons.dsl.Properties.multiselectMode;
import static org.vaadin.addons.dsl.Properties.newItemsAllowed;
import static org.vaadin.addons.dsl.Properties.nullSelectionItemId;
import static org.vaadin.addons.dsl.Properties.parent;

import org.junit.Test;
import org.vaadin.addons.dsl.test.Pojo;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.event.dd.acceptcriteria.AcceptCriterion;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.ui.AbstractSelect.ItemDescriptionGenerator;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Tree.TreeDragMode;

public class TreeTest {

    Container container = new BeanItemContainer<>(Pojo.class);

    @Test
    public void testSpecificPropertySetters() {
        tree(
            // TODO validate usability
            childrenAllowed(new Object(), true),
            containerDataSource(container),
            dragMode(TreeDragMode.NODE),
            // FIXME conflicts w. Table
            // dropHandler(new TreeDropHandler())
            htmlContentAllowed(true),
            // FIXME conflicts w. Table
            // itemDescriptionGenerator(new TreeItemDescriptionGenerator())
            // TODO validate usability
            itemIcon(new Object(), FontAwesome.ADJUST),
            // TODO validate usability
            itemIcon(new Object(), FontAwesome.ADJUST, ""),
            itemIconAlternateText(new Object(), ""),
            itemStyleGenerator(new TreeItemStyleGenerator()),
            // FIXME conflicts w. Table (naming convention)
            multiselectMode(MultiSelectMode.DEFAULT),
            newItemsAllowed(true),
            // TODO validate usability
            nullSelectionItemId(new Object()),
            // FIXME conflicts w. Table
            // selectable(true),
            // TODO validate usability
            parent(new Object(), new Object()));
    }

    static class TreeDropHandler implements DropHandler {

        @Override
        public void drop(DragAndDropEvent event) {
        }

        @Override
        public AcceptCriterion getAcceptCriterion() {
            return null;
        }
    }

    static class TreeItemDescriptionGenerator implements ItemDescriptionGenerator {

        @Override
        public String generateDescription(Component source, Object itemId, Object propertyId) {
            return null;
        }
    }

    static class TreeItemStyleGenerator implements Tree.ItemStyleGenerator {

        @Override
        public String getStyle(Tree source, Object itemId) {
            return null;
        }
    }
}

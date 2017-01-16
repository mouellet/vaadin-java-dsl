package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.treeTable;
import static org.vaadin.addons.dsl.Properties.animationsEnabled;
import static org.vaadin.addons.dsl.Properties.childrenAllowed;
import static org.vaadin.addons.dsl.Properties.collapsed;
import static org.vaadin.addons.dsl.Properties.containerDataSource;
import static org.vaadin.addons.dsl.Properties.hierarchyColumn;
import static org.vaadin.addons.dsl.Properties.parent;

import org.junit.Test;
import org.vaadin.addons.dsl.test.Pojo;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;

public class TreeTableTest {

    @Test
    public void testSpecificPropertySetters() {

        Container container = new BeanItemContainer<>(Pojo.class);

        treeTable(
            animationsEnabled(true),
            // TODO validate usability
            childrenAllowed(new Object(), true), // Container.Hierarchical
            // TODO validate usability
            collapsed(new Object(), true),
            containerDataSource(container), // Table
            // TODO validate usability
            hierarchyColumn(new Object()),
            // TODO validate usability
            parent(new Object(), new Object()));
    }
}

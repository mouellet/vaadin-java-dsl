package org.vaadin.addons.dsl;

import static org.vaadin.addons.dsl.Components.table;
import static org.vaadin.addons.dsl.Properties.cacheRate;
import static org.vaadin.addons.dsl.Properties.cellStyleGenerator;
import static org.vaadin.addons.dsl.Properties.collapseMenuContent;
import static org.vaadin.addons.dsl.Properties.columnAlignment;
import static org.vaadin.addons.dsl.Properties.columnAlignments;
import static org.vaadin.addons.dsl.Properties.columnCollapsed;
import static org.vaadin.addons.dsl.Properties.columnCollapsible;
import static org.vaadin.addons.dsl.Properties.columnCollapsingAllowed;
import static org.vaadin.addons.dsl.Properties.columnExpandRatio;
import static org.vaadin.addons.dsl.Properties.columnFooter;
import static org.vaadin.addons.dsl.Properties.columnHeader;
import static org.vaadin.addons.dsl.Properties.columnHeaderMode;
import static org.vaadin.addons.dsl.Properties.columnHeaders;
import static org.vaadin.addons.dsl.Properties.columnIcon;
import static org.vaadin.addons.dsl.Properties.columnIcons;
import static org.vaadin.addons.dsl.Properties.columnReorderingAllowed;
import static org.vaadin.addons.dsl.Properties.columnWidth;
import static org.vaadin.addons.dsl.Properties.containerDataSource;
import static org.vaadin.addons.dsl.Properties.converter;
import static org.vaadin.addons.dsl.Properties.currentPageFirstItemId;
import static org.vaadin.addons.dsl.Properties.currentPageFirstItemIndex;
import static org.vaadin.addons.dsl.Properties.dragMode;
import static org.vaadin.addons.dsl.Properties.dropHandler;
import static org.vaadin.addons.dsl.Properties.editable;
import static org.vaadin.addons.dsl.Properties.footerVisible;
import static org.vaadin.addons.dsl.Properties.itemDescriptionGenerator;
import static org.vaadin.addons.dsl.Properties.multiSelectMode;
import static org.vaadin.addons.dsl.Properties.pageLength;
import static org.vaadin.addons.dsl.Properties.rowGenerator;
import static org.vaadin.addons.dsl.Properties.rowHeaderMode;
import static org.vaadin.addons.dsl.Properties.selectable;
import static org.vaadin.addons.dsl.Properties.sortAscending;
import static org.vaadin.addons.dsl.Properties.sortContainerPropertyId;
import static org.vaadin.addons.dsl.Properties.sortEnabled;
import static org.vaadin.addons.dsl.Properties.tableFieldFactory;
import static org.vaadin.addons.dsl.Properties.visibleColumns;

import java.util.UUID;

import org.junit.Test;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.converter.StringToIntegerConverter;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.shared.ui.table.CollapseMenuContent;
import com.vaadin.ui.Table.Align;
import com.vaadin.ui.Table.ColumnHeaderMode;
import com.vaadin.ui.Table.RowHeaderMode;

public class PropertiesTest {

    @Test
    public void testTableSpecificProperties() {

        BeanItemContainer<Person> beanItemContainer = new BeanItemContainer<>(Person.class);

        table(
            containerDataSource(beanItemContainer),
            visibleColumns("id", "firstName", "lastName", "age"),
            columnAlignment("id", Align.CENTER),
            columnAlignments(Align.CENTER, Align.CENTER, Align.CENTER, Align.CENTER),
            columnCollapsingAllowed(true),
            columnCollapsed("id", false),
            columnCollapsible("lastName", false),
            columnHeaderMode(ColumnHeaderMode.ID),
            columnHeaders("ID", "First Name", "Last Name", "Age"),
            columnHeader("id", "ID"),
            columnIcons(FontAwesome.ADJUST, FontAwesome.ADJUST, FontAwesome.ADJUST, FontAwesome.ADJUST),
            columnIcon("id", FontAwesome.ADJUST),
            columnFooter("id", "id's"),
            converter("age", new StringToIntegerConverter()),
            cellStyleGenerator(null),
            collapseMenuContent(CollapseMenuContent.ALL_COLUMNS),
            cacheRate(0d),
            columnExpandRatio("id", 1f),
            columnReorderingAllowed(true),
            columnWidth("id", 100),
            currentPageFirstItemId(null),
            currentPageFirstItemIndex(0),
            dragMode(null),
            dropHandler(null),
            editable(true),
            footerVisible(false),
            itemDescriptionGenerator(null),
            multiSelectMode(MultiSelectMode.DEFAULT),
            pageLength(10),
            rowGenerator(null),
            rowHeaderMode(RowHeaderMode.ID),
            selectable(true),
            sortAscending(true),
            sortContainerPropertyId(null),
            sortEnabled(false),
            tableFieldFactory(null))
                    .get();
    }

    static class Person {

        private final UUID id = UUID.randomUUID();
        private final String firstName;
        private final String lastName;
        private final int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public UUID getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

    }

}

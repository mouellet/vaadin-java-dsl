package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.table;
import static org.vaadin.addons.dsl.Properties.cacheRate;
import static org.vaadin.addons.dsl.Properties.cellStyleGenerator;
import static org.vaadin.addons.dsl.Properties.childMeasurementHint;
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
import static org.vaadin.addons.dsl.Properties.enabled;
import static org.vaadin.addons.dsl.Properties.footerVisible;
import static org.vaadin.addons.dsl.Properties.itemDescriptionGenerator;
import static org.vaadin.addons.dsl.Properties.multiSelectMode;
import static org.vaadin.addons.dsl.Properties.newItemsAllowed;
import static org.vaadin.addons.dsl.Properties.pageLength;
import static org.vaadin.addons.dsl.Properties.rowGenerator;
import static org.vaadin.addons.dsl.Properties.rowHeaderMode;
import static org.vaadin.addons.dsl.Properties.selectable;
import static org.vaadin.addons.dsl.Properties.sortAscending;
import static org.vaadin.addons.dsl.Properties.sortContainerPropertyId;
import static org.vaadin.addons.dsl.Properties.sortEnabled;
import static org.vaadin.addons.dsl.Properties.tableFieldFactory;
import static org.vaadin.addons.dsl.Properties.visible;
import static org.vaadin.addons.dsl.Properties.visibleColumns;

import java.util.Collections;

import org.junit.Test;
import org.vaadin.addons.dsl.test.Pojo;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.converter.StringToIntegerConverter;
import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.event.dd.acceptcriteria.AcceptCriterion;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.shared.ui.table.CollapseMenuContent;
import com.vaadin.ui.AbstractSelect.ItemDescriptionGenerator;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.HasChildMeasurementHint;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.Align;
import com.vaadin.ui.Table.ColumnHeaderMode;
import com.vaadin.ui.Table.GeneratedRow;
import com.vaadin.ui.Table.RowHeaderMode;

public class TableTest {

    @Test
    public void testSpecificPropertySetters() {

        Container container = new BeanItemContainer<>(Pojo.class);

        table(
            cacheRate(0d),
            cellStyleGenerator(new TableCellStyleGenerator()),
            childMeasurementHint(HasChildMeasurementHint.ChildMeasurementHint.MEASURE_IF_NEEDED),
            collapseMenuContent(CollapseMenuContent.ALL_COLUMNS),
            columnAlignment("id", Align.CENTER),
            columnAlignments(Align.CENTER, Align.CENTER, Align.CENTER, Align.CENTER),
            columnCollapsed("id", false),
            columnCollapsible("lastName", false),
            columnCollapsingAllowed(true),
            columnExpandRatio("id", 1f),
            columnFooter("id", "id's"),
            columnHeader("id", "ID"),
            columnHeaderMode(ColumnHeaderMode.ID),
            columnHeaders("ID", "First Name", "Last Name", "Age"),
            columnIcon("id", FontAwesome.ADJUST),
            columnIcons(FontAwesome.ADJUST, FontAwesome.ADJUST, FontAwesome.ADJUST, FontAwesome.ADJUST),
            columnReorderingAllowed(true),
            columnWidth("id", 100),
            containerDataSource(container), // AbstractSelect
            containerDataSource(container, Collections.EMPTY_LIST),
            converter("age", new StringToIntegerConverter()),
            currentPageFirstItemId("id"),
            currentPageFirstItemIndex(0),
            dragMode(Table.TableDragMode.NONE),
            dropHandler(new TableDropHandler()),
            editable(true),
            enabled(true), // AbstractComponent
            footerVisible(false),
            itemDescriptionGenerator(new TableItemDescriptionGenerator()),
            multiSelectMode(MultiSelectMode.DEFAULT),
            newItemsAllowed(true), // AbstractSelect
            pageLength(10),
            rowGenerator(new TableRowGenerator()),
            rowHeaderMode(RowHeaderMode.ID),
            selectable(true),
            sortAscending(true),
            sortContainerPropertyId(new Object()),
            sortEnabled(false),
            tableFieldFactory(DefaultFieldFactory.get()),
            visible(true), // AbstractComponent
            visibleColumns("id", "firstName", "lastName", "age"));
    }

    static class TableCellStyleGenerator implements Table.CellStyleGenerator {

        @Override
        public String getStyle(Table source, Object itemId, Object propertyId) {
            return null;
        }
    }

    static class TableDropHandler implements DropHandler {

        @Override
        public void drop(DragAndDropEvent event) {
        }

        @Override
        public AcceptCriterion getAcceptCriterion() {
            return null;
        }
    }

    static class TableItemDescriptionGenerator implements ItemDescriptionGenerator {

        @Override
        public String generateDescription(Component source, Object itemId, Object propertyId) {
            return null;
        }
    }

    static class TableRowGenerator implements Table.RowGenerator {

        @Override
        public GeneratedRow generateRow(Table table, Object itemId) {
            return null;
        }
    }

}

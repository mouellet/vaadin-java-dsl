package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.grid;
import static org.vaadin.addons.dsl.Properties.cellDescriptionGenerator;
import static org.vaadin.addons.dsl.Properties.cellStyleGenerator;
import static org.vaadin.addons.dsl.Properties.columnOrder;
import static org.vaadin.addons.dsl.Properties.columnResizeMode;
import static org.vaadin.addons.dsl.Properties.columns;
import static org.vaadin.addons.dsl.Properties.defaultHeaderRow;
import static org.vaadin.addons.dsl.Properties.detailsGenerator;
import static org.vaadin.addons.dsl.Properties.detailsVisible;
import static org.vaadin.addons.dsl.Properties.editorBuffered;
import static org.vaadin.addons.dsl.Properties.editorCancelCaption;
import static org.vaadin.addons.dsl.Properties.editorEnabled;
import static org.vaadin.addons.dsl.Properties.editorErrorHandler;
import static org.vaadin.addons.dsl.Properties.editorFieldFactory;
import static org.vaadin.addons.dsl.Properties.editorFieldGroup;
import static org.vaadin.addons.dsl.Properties.editorSaveCaption;
import static org.vaadin.addons.dsl.Properties.frozenColumnCount;
import static org.vaadin.addons.dsl.Properties.headerVisible;
import static org.vaadin.addons.dsl.Properties.height;
import static org.vaadin.addons.dsl.Properties.heightByRows;
import static org.vaadin.addons.dsl.Properties.heightMode;
import static org.vaadin.addons.dsl.Properties.rowDescriptionGenerator;
import static org.vaadin.addons.dsl.Properties.rowStyleGenerator;
import static org.vaadin.addons.dsl.Properties.selectionMode;
import static org.vaadin.addons.dsl.Properties.selectionModel;
import static org.vaadin.addons.dsl.Properties.sortOrder;

import java.util.Collections;

import org.junit.Test;

import com.vaadin.data.fieldgroup.DefaultFieldGroupFieldFactory;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.grid.ColumnResizeMode;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.CellReference;
import com.vaadin.ui.Grid.CommitErrorEvent;
import com.vaadin.ui.Grid.DetailsGenerator;
import com.vaadin.ui.Grid.HeaderRow;
import com.vaadin.ui.Grid.RowReference;
import com.vaadin.ui.Grid.StaticSection;

public class GridTest {

    @Test
    public void testSpecificPropertySetters() {

        grid(
            cellDescriptionGenerator(new GridCellDescriptionGenerator()),
            cellStyleGenerator(new GridCellStyleGenerator()),
            columnOrder("1", "2"),
            // FIXME conflicts w. Table
            // columnReorderingAllowed(true),
            columnResizeMode(ColumnResizeMode.SIMPLE),
            columns("1", "2"),
            // FIXME conflicts w. Table
            // containerDataSource(indexedContainer)
            defaultHeaderRow(new GridHeaderRow()),
            detailsGenerator(DetailsGenerator.NULL), detailsVisible(new Object(), true),
            editorBuffered(true),
            editorCancelCaption("Cancel"),
            editorEnabled(true),
            editorErrorHandler(new GridEditorErrorHandler()),
            editorFieldFactory(DefaultFieldGroupFieldFactory.get()),
            editorFieldGroup(new GridEditorFieldGroup()),
            editorSaveCaption("Save"),
            // FIXME conflicts w. Table
            // footerVisible(true),
            frozenColumnCount(0),
            headerVisible(true),
            height(100f, Unit.PIXELS), // AbstractComponent
            heightByRows(10d),
            heightMode(HeightMode.CSS),
            rowDescriptionGenerator(new GridRowDescriptionGenerator()),
            rowStyleGenerator(new GridRowStyleGenerator()),
            selectionMode(Grid.SelectionMode.NONE),
            selectionModel(new Grid.NoSelectionModel()),
            sortOrder(Collections.EMPTY_LIST));
    }

    static class GridCellDescriptionGenerator implements Grid.CellDescriptionGenerator {

        @Override
        public String getDescription(CellReference cell) {
            return null;
        }
    }

    static class GridCellStyleGenerator implements Grid.CellStyleGenerator {

        @Override
        public String getStyle(CellReference cell) {
            return null;
        }
    }

    static class GridHeaderRow extends HeaderRow {

        public GridHeaderRow() {
            super(null);
        }

        protected GridHeaderRow(StaticSection<?> section) {
            super(section);
        }
    }

    static class GridEditorErrorHandler implements Grid.EditorErrorHandler {

        @Override
        public void commitError(CommitErrorEvent event) {
        }
    }

    static class GridEditorFieldGroup extends FieldGroup {
    }

    static class GridRowDescriptionGenerator implements Grid.RowDescriptionGenerator {

        @Override
        public String getDescription(RowReference row) {
            return null;
        }
    }

    static class GridRowStyleGenerator implements Grid.RowStyleGenerator {

        @Override
        public String getStyle(RowReference row) {
            return null;
        }
    }

}

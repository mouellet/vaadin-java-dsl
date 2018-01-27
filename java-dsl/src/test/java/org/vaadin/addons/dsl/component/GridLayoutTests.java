package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.ComponentContainers.gridLayout;
import static org.vaadin.addons.dsl.Properties.columnExpandRatio;
import static org.vaadin.addons.dsl.Properties.columns;
import static org.vaadin.addons.dsl.Properties.cursorX;
import static org.vaadin.addons.dsl.Properties.cursorY;
import static org.vaadin.addons.dsl.Properties.hideEmptyRowsAndColumns;
import static org.vaadin.addons.dsl.Properties.rowExpandRatio;
import static org.vaadin.addons.dsl.Properties.rows;

import org.junit.Test;

import com.vaadin.ui.GridLayout;

public class GridLayoutTests {

    private static final float EXPAND_RATION = 10f;
    private static final int FIRST_COLUMN = 0;
    private static final int COLUMN_COUNT = 4;
    private static final int CURSOR_X = 10;
    private static final int CURSOR_Y = 11;
    private static final int FIRST_ROW = 0;
    private static final int ROW_COUNT = 10;

    @Test
    public void testProperties() {

        GridLayout component = gridLayout(
            columnExpandRatio(FIRST_COLUMN, EXPAND_RATION),
            columns(COLUMN_COUNT),
            cursorX(CURSOR_X),
            cursorY(CURSOR_Y),
            hideEmptyRowsAndColumns(true),
            rowExpandRatio(FIRST_ROW, EXPAND_RATION),
            rows(ROW_COUNT))
                .get();

        assertThat(component.getColumnExpandRatio(FIRST_COLUMN)).isEqualTo(EXPAND_RATION);
        assertThat(component.getColumns()).isEqualTo(COLUMN_COUNT);
        assertThat(component.getCursorX()).isEqualTo(CURSOR_X);
        assertThat(component.getCursorY()).isEqualTo(CURSOR_Y);
        assertThat(component.isHideEmptyRowsAndColumns()).isTrue();
        assertThat(component.getRowExpandRatio(FIRST_ROW)).isEqualTo(EXPAND_RATION);
        assertThat(component.getRows()).isEqualTo(ROW_COUNT);
    }
}

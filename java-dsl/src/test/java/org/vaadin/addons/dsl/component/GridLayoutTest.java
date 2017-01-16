package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.ComponentContainers.gridLayout;
import static org.vaadin.addons.dsl.Properties.columnExpandRatio;
import static org.vaadin.addons.dsl.Properties.columns;
import static org.vaadin.addons.dsl.Properties.componentAlignment;
import static org.vaadin.addons.dsl.Properties.cursorX;
import static org.vaadin.addons.dsl.Properties.cursorY;
import static org.vaadin.addons.dsl.Properties.defaultComponentAlignment;
import static org.vaadin.addons.dsl.Properties.hideEmptyRowsAndColumns;
import static org.vaadin.addons.dsl.Properties.margin;
import static org.vaadin.addons.dsl.Properties.rowExpandRatio;
import static org.vaadin.addons.dsl.Properties.rows;
import static org.vaadin.addons.dsl.Properties.spacing;

import org.junit.Test;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;

public class GridLayoutTest {

    @Test
    public void testSpecificPropertySetters() {

        gridLayout(
            columnExpandRatio(0, 10f),
            columns(4),
            // TODO validate usability
            componentAlignment(new CssLayout(), Alignment.BOTTOM_CENTER),
            cursorX(0),
            cursorY(0),
            defaultComponentAlignment(Alignment.BOTTOM_CENTER),
            hideEmptyRowsAndColumns(true),
            margin(true), margin(new MarginInfo(true)),
            rowExpandRatio(0, 10f),
            rows(10),
            spacing(true));

    }
}

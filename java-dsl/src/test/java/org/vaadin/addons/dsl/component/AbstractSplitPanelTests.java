package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.horizontalSplitPanel;
import static org.vaadin.addons.dsl.Listeners.onSplitPositionChange;
import static org.vaadin.addons.dsl.Listeners.onSplitterClick;
import static org.vaadin.addons.dsl.Properties.firstComponent;
import static org.vaadin.addons.dsl.Properties.locked;
import static org.vaadin.addons.dsl.Properties.maxSplitPosition;
import static org.vaadin.addons.dsl.Properties.minSplitPosition;
import static org.vaadin.addons.dsl.Properties.secondComponent;
import static org.vaadin.addons.dsl.Properties.splitPosition;

import org.junit.Test;

import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;

public class AbstractSplitPanelTests {

    private static final Label FIRST_COMPONENT = new Label("1");
    private static final Label SECOND_COMPONENT = new Label("2");
    private static final float POSITION = 100f;
    private static final Unit UNIT = Unit.PIXELS;

    @Test
    public void testProperties() {
        HorizontalSplitPanel component = horizontalSplitPanel(
            firstComponent(FIRST_COMPONENT),
            secondComponent(SECOND_COMPONENT),
            locked(true),
            maxSplitPosition(POSITION, UNIT),
            minSplitPosition(POSITION, UNIT),
            splitPosition(POSITION, UNIT))
                .get();

        assertThat(component.getFirstComponent()).isEqualTo(FIRST_COMPONENT);
        assertThat(component.getSecondComponent()).isEqualTo(SECOND_COMPONENT);
        assertThat(component.isLocked()).isTrue();
        assertThat(component.getMaxSplitPosition()).isEqualTo(POSITION);
        assertThat(component.getMaxSplitPositionUnit()).isEqualTo(UNIT);
        assertThat(component.getMinSplitPosition()).isEqualTo(POSITION);
        assertThat(component.getMinSplitPositionUnit()).isEqualTo(UNIT);
        assertThat(component.getSplitPosition()).isEqualTo(POSITION);
        assertThat(component.getSplitPositionUnit()).isEqualTo(UNIT);
    }

    @Test
    public void testListeners() {
        HorizontalSplitPanel component = horizontalSplitPanel(
            onSplitPositionChange(event -> event.getSource()),
            onSplitterClick(event -> event.getSource()))
                .get();

        assertThat(component.getListeners(AbstractSplitPanel.SplitPositionChangeEvent.class)).isNotEmpty();
        assertThat(component.getListeners(AbstractSplitPanel.SplitterClickEvent.class)).isNotEmpty();
    }
}

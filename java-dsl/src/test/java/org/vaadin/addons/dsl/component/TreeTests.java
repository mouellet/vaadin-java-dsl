package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.tree;
import static org.vaadin.addons.dsl.Listeners.onCollapse;
import static org.vaadin.addons.dsl.Listeners.onExpand;
import static org.vaadin.addons.dsl.Listeners.onItemClick;
import static org.vaadin.addons.dsl.Listeners.onSelection;
import static org.vaadin.addons.dsl.Properties.autoRecalculateWidth;
import static org.vaadin.addons.dsl.Properties.contentMode;
import static org.vaadin.addons.dsl.Properties.selectionMode;

import org.junit.Test;

import com.vaadin.event.CollapseEvent;
import com.vaadin.event.ExpandEvent;
import com.vaadin.event.selection.SelectionListener;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Tree;

public class TreeTests {

    private static final ContentMode CONTENT_MODE = ContentMode.HTML;

    @Test
    public void testProperties() {
        Tree<String> component = tree(
            autoRecalculateWidth(true),
            contentMode(CONTENT_MODE),
            selectionMode(SelectionMode.SINGLE))
                .get();

        assertThat(component.isAutoRecalculateWidth()).isTrue();
        assertThat(component.getContentMode()).isEqualByComparingTo(CONTENT_MODE);
        assertThat(component.getSelectionModel()).isNotNull();
    }

    @Test
    public void testListeners() {
        Tree<String> component = tree(
            onCollapse(event -> event.getSource()),
            onExpand(event -> event.getSource()),
            onItemClick((Tree.ItemClickListener<String>) event -> event.getSource()),
            onSelection((SelectionListener<String>) event -> event.isUserOriginated()))
                .get();

        assertThat(component.getListeners(CollapseEvent.class)).isNotEmpty();
        assertThat(component.getListeners(ExpandEvent.class)).isNotEmpty();
        assertThat(component.getListeners(Tree.ItemClick.class)).isNotEmpty();

    }

}

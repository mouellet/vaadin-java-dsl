package org.vaadin.addons.dsl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.vaadin.addons.dsl.ComponentContainers.cssLayout;
import static org.vaadin.addons.dsl.Components.audio;
import static org.vaadin.addons.dsl.Components.browserFrame;
import static org.vaadin.addons.dsl.Components.button;
import static org.vaadin.addons.dsl.Components.calendar;
import static org.vaadin.addons.dsl.Components.checkBox;
import static org.vaadin.addons.dsl.Components.comboBox;
import static org.vaadin.addons.dsl.Components.customComponent;
import static org.vaadin.addons.dsl.Components.dateField;
import static org.vaadin.addons.dsl.Components.embedded;
import static org.vaadin.addons.dsl.Components.flash;
import static org.vaadin.addons.dsl.Components.grid;
import static org.vaadin.addons.dsl.Components.image;
import static org.vaadin.addons.dsl.Components.inlineDateField;
import static org.vaadin.addons.dsl.Components.label;
import static org.vaadin.addons.dsl.Components.link;
import static org.vaadin.addons.dsl.Components.listSelect;
import static org.vaadin.addons.dsl.Components.menuBar;
import static org.vaadin.addons.dsl.Components.nativeButton;
import static org.vaadin.addons.dsl.Components.nativeSelect;
import static org.vaadin.addons.dsl.Components.optionGroup;
import static org.vaadin.addons.dsl.Components.passwordField;
import static org.vaadin.addons.dsl.Components.popupDateField;
import static org.vaadin.addons.dsl.Components.popupView;
import static org.vaadin.addons.dsl.Components.progressBar;
import static org.vaadin.addons.dsl.Components.richTextArea;
import static org.vaadin.addons.dsl.Components.slider;
import static org.vaadin.addons.dsl.Components.table;
import static org.vaadin.addons.dsl.Components.textArea;
import static org.vaadin.addons.dsl.Components.textField;
import static org.vaadin.addons.dsl.Components.tree;
import static org.vaadin.addons.dsl.Components.treeTable;
import static org.vaadin.addons.dsl.Components.twinColSelect;
import static org.vaadin.addons.dsl.Components.upload;

import org.junit.Test;

import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;

public class ComponentsTest {

    @Test
    public void testComponentInstanciated() {

        CssLayout root = cssLayout(
            audio(),
            browserFrame(),
            button(),
            calendar(),
            checkBox(),
            comboBox(),
            customComponent(),
            dateField(),
            embedded(),
            flash(),
            grid(),
            image(),
            inlineDateField(),
            label(),
            link(),
            listSelect(),
            menuBar(),
            nativeButton(),
            nativeSelect(),
            optionGroup(), passwordField(),
            popupDateField(),
            popupView(),
            progressBar(),
            richTextArea(),
            slider(),
            table(),
            textArea(),
            textField(),
            tree(),
            treeTable(),
            twinColSelect(),
            upload())
                    .get();

        assertNotNull(root);
        assertTrue(root.getComponentCount() > 1);
    }

    @Test
    public void testComponentReferenceAssigned() {

        Button button = new Button();
        TextField textField = new TextField();

        CssLayout root = cssLayout(
            button(button),
            textField(textField))
                    .get();

        assertNotNull(root);
        assertTrue(root.getComponent(0).equals(button));
        assertTrue(root.getComponent(1).equals(textField));
    }

}

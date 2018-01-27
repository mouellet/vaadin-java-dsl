package org.vaadin.addons.dsl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.ComponentContainers.cssLayout;
import static org.vaadin.addons.dsl.Components.audio;
import static org.vaadin.addons.dsl.Components.browserFrame;
import static org.vaadin.addons.dsl.Components.button;
import static org.vaadin.addons.dsl.Components.checkBox;
import static org.vaadin.addons.dsl.Components.checkBoxGroup;
import static org.vaadin.addons.dsl.Components.comboBox;
import static org.vaadin.addons.dsl.Components.composite;
import static org.vaadin.addons.dsl.Components.customComponent;
import static org.vaadin.addons.dsl.Components.dateField;
import static org.vaadin.addons.dsl.Components.dateTimeField;
import static org.vaadin.addons.dsl.Components.embedded;
import static org.vaadin.addons.dsl.Components.flash;
import static org.vaadin.addons.dsl.Components.grid;
import static org.vaadin.addons.dsl.Components.image;
import static org.vaadin.addons.dsl.Components.inlineDateField;
import static org.vaadin.addons.dsl.Components.inlineDateTimeField;
import static org.vaadin.addons.dsl.Components.label;
import static org.vaadin.addons.dsl.Components.link;
import static org.vaadin.addons.dsl.Components.listSelect;
import static org.vaadin.addons.dsl.Components.menuBar;
import static org.vaadin.addons.dsl.Components.nativeButton;
import static org.vaadin.addons.dsl.Components.nativeSelect;
import static org.vaadin.addons.dsl.Components.passwordField;
import static org.vaadin.addons.dsl.Components.popupView;
import static org.vaadin.addons.dsl.Components.progressBar;
import static org.vaadin.addons.dsl.Components.radioButtonGroup;
import static org.vaadin.addons.dsl.Components.richTextArea;
import static org.vaadin.addons.dsl.Components.slider;
import static org.vaadin.addons.dsl.Components.textArea;
import static org.vaadin.addons.dsl.Components.textField;
import static org.vaadin.addons.dsl.Components.tree;
import static org.vaadin.addons.dsl.Components.treeGrid;
import static org.vaadin.addons.dsl.Components.twinColSelect;
import static org.vaadin.addons.dsl.Components.upload;
import static org.vaadin.addons.dsl.Components.video;

import org.junit.Test;

import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;

public class ComponentsTests {

    private static final TextField TEXT_FIELD = new TextField();
    private static final Button BUTTON = new Button();

    @Test
    public void testComponents() {
        CssLayout root = cssLayout(
            audio(),
            browserFrame(),
            button(),
            checkBox(),
            checkBoxGroup(),
            comboBox(),
            composite(),
            customComponent(),
            dateField(),
            dateTimeField(),
            embedded(),
            flash(),
            grid(),
            image(),
            inlineDateField(),
            inlineDateTimeField(),
            label(),
            link(),
            listSelect(),
            menuBar(),
            nativeButton(),
            nativeSelect(),
            passwordField(),
            popupView(),
            progressBar(),
            radioButtonGroup(),
            richTextArea(),
            slider(),
            textArea(),
            textField(),
            tree(),
            treeGrid(),
            twinColSelect(),
            upload(),
            video())
                .get();

        assertThat(root).isNotNull();
        assertThat(root.getComponentCount()).isEqualTo(35);
    }

    @Test
    public void testComponentInstances() {

        CssLayout root = cssLayout(
            button(BUTTON),
            textField(TEXT_FIELD))
                .get();

        assertThat(root).isNotNull();
        assertThat(root.iterator()).contains(BUTTON, TEXT_FIELD);
    }

}

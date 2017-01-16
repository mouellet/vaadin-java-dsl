package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.ComponentContainers.tabSheet;
import static org.vaadin.addons.dsl.Properties.closeHandler;
import static org.vaadin.addons.dsl.Properties.selectedTab;
import static org.vaadin.addons.dsl.Properties.tabCaptionsAsHtml;
import static org.vaadin.addons.dsl.Properties.tabIndex;
import static org.vaadin.addons.dsl.Properties.tabPosition;
import static org.vaadin.addons.dsl.Properties.tabsVisible;

import org.junit.Test;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.ui.Component;
import com.vaadin.ui.Component.Focusable;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TabSheet;

public class TabSheetTest {

    @Test
    public void testSpecificPropertySetters() {

        tabSheet(
            closeHandler(new TabSheetCloseHandler()),
            tabsVisible(true),
            selectedTab(new TabSheetTabComponent()),
            selectedTab(new TabSheetTab()),
            selectedTab(0),
            tabCaptionsAsHtml(true),
            tabIndex(0), // Component.Focusable
            tabPosition(new TabSheetTab(), 0), tabsVisible(true));
    }

    static class TabSheetCloseHandler implements TabSheet.CloseHandler {

        @Override
        public void onTabClose(TabSheet tabsheet, Component tabContent) {
        }
    }

    static class TabSheetTabComponent extends CssLayout implements Component {
    }

    static class TabSheetTab implements TabSheet.Tab {

        @Override
        public boolean isVisible() {
            return false;
        }

        @Override
        public void setVisible(boolean visible) {
        }

        @Override
        public boolean isClosable() {
            return false;
        }

        @Override
        public void setClosable(boolean closable) {
        }

        @Override
        public void setDefaultFocusComponent(Focusable component) {
        }

        @Override
        public Focusable getDefaultFocusComponent() {
            return null;
        }

        @Override
        public boolean isEnabled() {
            return false;
        }

        @Override
        public void setEnabled(boolean enabled) {
        }

        @Override
        public void setCaption(String caption) {
        }

        @Override
        public String getCaption() {
            return null;
        }

        @Override
        public Resource getIcon() {
            return null;
        }

        @Override
        public void setIcon(Resource icon) {
        }

        @Override
        public void setIcon(Resource icon, String iconAltText) {
        }

        @Override
        public String getIconAlternateText() {
            return null;
        }

        @Override
        public void setIconAlternateText(String iconAltText) {
        }

        @Override
        public String getDescription() {
            return null;
        }

        @Override
        public void setDescription(String description) {
        }

        @Override
        public void setComponentError(ErrorMessage componentError) {
        }

        @Override
        public ErrorMessage getComponentError() {
            return null;
        }

        @Override
        public Component getComponent() {
            return null;
        }

        @Override
        public void setStyleName(String styleName) {
        }

        @Override
        public String getStyleName() {
            return null;
        }

        @Override
        public void setId(String id) {
        }

        @Override
        public String getId() {
            return null;
        }
    }
}

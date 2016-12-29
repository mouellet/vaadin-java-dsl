package org.vaadin.addons.dsl;

import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Stream;

import org.vaadin.addons.dsl.core.PropertyNode;

import com.vaadin.data.Buffered;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.shared.ui.window.WindowRole;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractEmbedded;
import com.vaadin.ui.AbstractField;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Link;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.Slider;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Video;
import com.vaadin.ui.Window;

/**
 * Utility class with core API attributes.
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class Attributes {

    private Attributes() {
    }

    /**
     * Returns a compound attribute node. Helpful for common reusable definitions, e.g:
     * <pre>
     * public PropertyNode customTextField() {
     *   return attrs(
     *     styleName("custom-text-field"),
     *     width(120, Unit.PIXEL)
     *   );
     * }
     * ...
     * v(TextField.class,
     *   customTextField(),
     *   caption("Hello"));
     * </pre>
     *
     * @param nodes list of attribute nodes
     * @return a compound node for the given attributes list
     */
    public static <T extends Component> PropertyNode<T> attrs(final PropertyNode<T>... nodes) {
        return component -> Stream.of(nodes)
                .forEach(node -> node.apply(component));
    }

    /**
     *
     * @see com.vaadin.ui.AbstractEmbedded#setAlternateText(String)
     */
    public static PropertyNode<AbstractEmbedded> alternateText(final String arg1) {
        return c -> c.setAlternateText(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TreeTable#setAnimationsEnabled(boolean)
     */
    public static PropertyNode<TreeTable> animationsEnabled(final boolean arg1) {
        return c -> c.setAnimationsEnabled(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setAssistiveDescription(Component...)
     */
    public static PropertyNode<Window> assistiveDescription(final Component... arg1) {
        return c -> c.setAssistiveDescription(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setAssistivePostfix(String)
     */
    public static PropertyNode<Window> assistivePostfix(final String arg1) {
        return c -> c.setAssistivePostfix(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setAssistivePrefix(String)
     */
    public static PropertyNode<Window> assistivePrefix(final String arg1) {
        return c -> c.setAssistivePrefix(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setAssistiveRole(WindowRole)
     */
    public static PropertyNode<Window> assistiveRole(final WindowRole arg1) {
        return c -> c.setAssistiveRole(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setTabStopBottomAssistiveText(String)
     */
    public static PropertyNode<Window> assistiveTextTabStopBottom(final String arg1) {
        return c -> c.setTabStopBottomAssistiveText(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setTabStopTopAssistiveText(String)
     */
    public static PropertyNode<Window> assistiveTextTabStopTop(final String arg1) {
        return c -> c.setTabStopTopAssistiveText(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.PopupDateField#setAssistiveText(String)
     */
    public static PropertyNode<PopupDateField> assistiveText(final String arg1) {
        return c -> c.setAssistiveText(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.MenuBar#setAutoOpen(boolean)
     */
    public static PropertyNode<MenuBar> autoOpen(final boolean arg1) {
        return c -> c.setAutoOpen(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Buffered#setBuffered(boolean)
     */
    public static <S extends Buffered & Component> PropertyNode<S> buffered(final boolean arg1) {
        return c -> c.setBuffered(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#setButtonCaption(String)
     */
    public static PropertyNode<Upload> buttonCaption(final String arg1) {
        return c -> c.setButtonCaption(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setCacheRate(double)
     */
    public static PropertyNode<Table> cacheRate(final double arg1) {
        return c -> c.setCacheRate(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component#setCaption(String)
     */
    public static PropertyNode<Component> caption(final String arg1) {
        return c -> c.setCaption(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractComponent#setCaptionAsHtml(boolean)
     */
    public static PropertyNode<AbstractComponent> captionAsHtml(final boolean arg1) {
        return c -> c.setCaptionAsHtml(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setCellStyleGenerator(com.vaadin.ui.Table.CellStyleGenerator)
     */
    public static PropertyNode<Table> cellStyleGenerator(final Table.CellStyleGenerator arg1) {
        return c -> c.setCellStyleGenerator(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Container.Hierarchical#setChildrenAllowed(Object, boolean)
     */
    public static <S extends Container.Hierarchical & Component> PropertyNode<S> childrenAllowed(final Object arg1, final boolean arg2) {
        return c -> c.setChildrenAllowed(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Button#setClickShortcut(int, int...)
     */
    public static PropertyNode<Button> clickShortcut(final int arg1, final int... arg2) {
        return c -> c.setClickShortcut(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setClosable(boolean)
     */
    public static PropertyNode<Window> closable(final boolean arg1) {
        return c -> c.setClosable(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#setCloseHandler(com.vaadin.ui.TabSheet.CloseHandler)
     */
    public static PropertyNode<TabSheet> closeHandler(final TabSheet.CloseHandler arg1) {
        return c -> c.setCloseHandler(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setCloseShortcut(int, int...)
     */
    public static PropertyNode<Window> closeShortcut(final int arg1, final int... arg2) {
        return c -> c.addCloseShortcut(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.TreeTable#setCollapsed(Object, boolean)
     */
    public static PropertyNode<TreeTable> collapsed(final Object arg1, final boolean arg2) {
        return c -> c.setCollapsed(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnAlignment(Object, com.vaadin.ui.Table.Align)
     */
    public static PropertyNode<Table> columnAlignment(final Object arg1, final Table.Align arg2) {
        return c -> c.setColumnAlignment(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnAlignments(com.vaadin.ui.Table.Align...)
     */
    public static PropertyNode<Table> columnAlignments(final Table.Align... arg1) {
        return c -> c.setColumnAlignments(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnCollapsed(Object, boolean)
     */
    public static PropertyNode<Table> columnCollapsed(final Object arg1, final boolean arg2) {
        return c -> c.setColumnCollapsed(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnCollapsible(Object, boolean)
     */
    public static PropertyNode<Table> columnCollapsible(final Object arg1, final boolean arg2) {
        return c -> c.setColumnCollapsible(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnCollapsingAllowed(boolean)
     */
    public static PropertyNode<Table> columnCollapsingAllowed(final boolean arg1) {
        return c -> c.setColumnCollapsingAllowed(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.GridLayout#setColumnExpandRatio(int, float)
     */
    public static PropertyNode<GridLayout> columnExpandRatio(final int arg1, final float arg2) {
        return c -> c.setColumnExpandRatio(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnExpandRatio(Object, float)
     */
    public static PropertyNode<Table> columnExpandRatio(final Object arg1, final float arg2) {
        return c -> c.setColumnExpandRatio(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnFooter(Object, String)
     */
    public static PropertyNode<Table> columnFooter(final Object arg1, final String arg2) {
        return c -> c.setColumnFooter(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnHeader(Object, String)
     */
    public static PropertyNode<Table> columnHeader(final Object arg1, final String arg2) {
        return c -> c.setColumnHeader(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnHeaders(String...)
     */
    public static PropertyNode<Table> columnHeaders(final String... arg1) {
        return c -> c.setColumnHeaders(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnHeaderMode(com.vaadin.ui.Table.ColumnHeaderMode)
     */
    public static PropertyNode<Table> columnHeaderMode(final Table.ColumnHeaderMode arg1) {
        return c -> c.setColumnHeaderMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnIcon(Object, Resource)
     */
    public static PropertyNode<Table> columnIcon(final Object arg1, final Resource arg2) {
        return c -> c.setColumnIcon(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnIcons(Resource...)
     */
    public static PropertyNode<Table> columnIcons(final Resource... arg1) {
        return c -> c.setColumnIcons(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnReorderingAllowed(boolean)
     */
    public static PropertyNode<Table> columnReorderingAllowed(final boolean arg1) {
        return c -> c.setColumnReorderingAllowed(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setColumnWidth(Object, int)
     */
    public static PropertyNode<Table> columnWidth(final Object arg1, final int arg2) {
        return c -> c.setColumnWidth(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setColumns(int)
     * @see com.vaadin.ui.GridLayout#setColumns(int)
     */
    public static PropertyNode<AbstractComponent> columns(final int arg1) {
        return c -> {
            if (c instanceof AbstractTextField) {
                ((AbstractTextField) c).setColumns(arg1);
            }
            if (c instanceof GridLayout) {
                ((GridLayout) c).setColumns(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.Layout.AlignmentHandler#setComponentAlignment(Component, Alignment)
     */
    public static <S extends Layout.AlignmentHandler & Component> PropertyNode<S> componentAlignment(final Component arg1, final Alignment arg2) {
        return c -> c.setComponentAlignment(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.data.Container.Viewer#setContainerDataSource(Container)
     */
    public static <S extends Container.Viewer & Component> PropertyNode<S> containerDataSource(final Container arg1) {
        return c -> c.setContainerDataSource(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.SingleComponentContainer#setContent(Component)
     */
    public static PropertyNode<SingleComponentContainer> content(final Component arg1) {
        return c -> c.setContent(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.PopupView#setContent(com.vaadin.ui.PopupView.Content)
     */
    public static PropertyNode<PopupView> content(final PopupView.Content arg1) {
        return c -> c.setContent(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Label#setContentMode(ContentMode)
     */
    public static PropertyNode<Label> contentMode(final ContentMode arg1) {
        return c -> c.setContentMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setConversionError(String)
     */
    public static PropertyNode<AbstractField> conversionError(final String arg1) {
        return c -> c.setConversionError(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setConvertedValue(Object)
     */
    public static PropertyNode<AbstractField> convertedValue(final Object arg1) {
        return c -> c.setConvertedValue(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setConverter(Class)
     */
    public static PropertyNode<AbstractField> converter(final Class arg1) {
        return c -> c.setConverter(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setConverter(Converter)
     * @see com.vaadin.ui.Label#setConverter(Converter)
     */
    public static PropertyNode<AbstractComponent> converter(final Converter arg1) {
        return c -> {
            if (c instanceof AbstractField) {
                ((AbstractField) c).setConverter(arg1);
            }
            if (c instanceof Label) {
                ((Label) c).setConverter(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.Table#setConverter(Object, Converter)
     */
    public static PropertyNode<Table> converter(final Object arg1, final Converter arg2) {
        return c -> c.setConverter(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setCurrentBufferedSourceException(com.vaadin.data.Buffered.SourceException)
     */
    public static PropertyNode<AbstractField> currentBufferedSourceException(final Buffered.SourceException arg1) {
        return c -> c.setCurrentBufferedSourceException(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setCurrentPageFirstItemId(Object)
     */
    public static PropertyNode<Table> currentPageFirstItemId(final Object arg1) {
        return c -> c.setCurrentPageFirstItemId(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setCurrentPageFirstItemIndex(int)
     */
    public static PropertyNode<Table> currentPageFirstItemIndex(final int arg1) {
        return c -> c.setCurrentPageFirstItemIndex(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setCursorPosition(int)
     */
    public static PropertyNode<AbstractTextField> cursorPosition(final int arg1) {
        return c -> c.setCursorPosition(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.GridLayout#setCursorX(int)
     */
    public static PropertyNode<GridLayout> cursorX(final int arg1) {
        return c -> c.setCursorX(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.GridLayout#setCursorY(int)
     */
    public static PropertyNode<GridLayout> cursorY(final int arg1) {
        return c -> c.setCursorY(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractComponent#setData(Object)
     */
    public static PropertyNode<AbstractComponent> data(final Object arg1) {
        return c -> c.setData(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setDateFormat(String)
     */
    public static PropertyNode<DateField> dateFormat(final String arg1) {
        return c -> c.setDateFormat(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setDateOutOfRangeMessage(String)
     */
    public static PropertyNode<DateField> dateOutOfRangeMessage(final String arg1) {
        return c -> c.setDateOutOfRangeMessage(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Layout.AlignmentHandler#setDefaultComponentAlignment(Alignment)
     */
    public static <S extends Layout.AlignmentHandler & Component> PropertyNode<S> defaultComponentAlignment(final Alignment arg1) {
        return c -> c.setDefaultComponentAlignment(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractComponent#setDescription(String)
     */
    public static PropertyNode<AbstractComponent> description(final String arg1) {
        return c -> c.setDescription(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Button#setDisableOnClick(boolean)
     */
    public static PropertyNode<Button> disableOnClick(final boolean arg1) {
        return c -> c.setDisableOnClick(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setDragMode(com.vaadin.ui.Table.TableDragMode)
     */
    public static PropertyNode<Table> dragMode(final Table.TableDragMode arg1) {
        return c -> c.setDragMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Tree#setDragMode(com.vaadin.ui.Tree.TreeDragMode)
     */
    public static PropertyNode<Tree> dragMode(final Tree.TreeDragMode arg1) {
        return c -> c.setDragMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setDraggable(boolean)
     */
    public static PropertyNode<Window> draggable(final boolean arg1) {
        return c -> c.setDraggable(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setDropHandler(DropHandler)
     * @see com.vaadin.ui.Tree#setDropHandler(DropHandler)
     */
    public static PropertyNode<AbstractSelect> dropHandler(final DropHandler arg1) {
        return c -> {
            if (c instanceof Table) {
                ((Table) c).setDropHandler(arg1);
            }
            if (c instanceof Tree) {
                ((Tree) c).setDropHandler(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.Table#setEditable(boolean)
     */
    public static PropertyNode<Table> editable(final boolean arg1) {
        return c -> c.setEditable(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component#setEnabled(boolean)
     */
    public static PropertyNode<Component> enabled(final boolean arg1) {
        return c -> c.setEnabled(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractOrderedLayout#setExpandRatio(Component, float)
     */
    public static PropertyNode<AbstractOrderedLayout> expandRatio(final Component arg1, final float arg2) {
        return c -> c.setExpandRatio(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.ComboBox#setFilteringMode(FilteringMode)
     */
    public static PropertyNode<ComboBox> filteringMode(final FilteringMode arg1) {
        return c -> c.setFilteringMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setFirstComponent(Component)
     */
    public static PropertyNode<AbstractSplitPanel> firstComponent(final Component arg1) {
        return c -> c.setFirstComponent(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setFooterVisible(boolean)
     */
    public static PropertyNode<Table> footerVisible(final boolean arg1) {
        return c -> c.setFooterVisible(arg1);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setHeight(String)
     */
    public static <S extends Sizeable & Component> PropertyNode<S> height(final String arg1) {
        return c -> c.setHeight(arg1);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setHeight(float, com.vaadin.server.Sizeable.Unit)
     */
    public static <S extends Sizeable & Component> PropertyNode<S> height(final float arg1, final Sizeable.Unit arg2) {
        return c -> c.setHeight(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setHeightUndefined()
     */
    public static <S extends Sizeable & Component> PropertyNode<S> heightUndefined() {
        return c -> c.setHeightUndefined();
    }

    /**
     *
     * @see com.vaadin.ui.GridLayout#setHideEmptyRowsAndColumns(boolean)
     */
    public static PropertyNode<GridLayout> hideEmptyRowsAndColumns(final boolean arg1) {
        return c -> c.setHideEmptyRowsAndColumns(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.PopupView#setHideOnMouseOut(boolean)
     */
    public static PropertyNode<PopupView> hideOnMouseOut(final boolean arg1) {
        return c -> c.setHideOnMouseOut(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TreeTable#setHierarchyColumn(Object)
     */
    public static PropertyNode<TreeTable> hierarchyColumn(final Object arg1) {
        return c -> c.setHierarchyColumn(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Button#setHtmlContentAllowed(boolean)
     * @see com.vaadin.ui.MenuBar#setHtmlContentAllowed(boolean)
     * @see com.vaadin.ui.OptionGroup#setHtmlContentAllowed(boolean)
     */
    public static PropertyNode<AbstractComponent> htmlContentAllowed(final boolean arg1) {
        return c -> {
            if (c instanceof Button) {
                ((Button) c).setHtmlContentAllowed(arg1);
            }
            if (c instanceof MenuBar) {
                ((MenuBar) c).setHtmlContentAllowed(arg1);
            }
            if (c instanceof OptionGroup) {
                ((OptionGroup) c).setHtmlContentAllowed(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.Component#setIcon(Resource)
     */
    public static PropertyNode<Component> icon(final Resource arg1) {
        return c -> c.setIcon(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Button#setIcon(Resource, String)
     */
    public static PropertyNode<Button> icon(final Resource arg1, final String arg2) {
        return c -> c.setIcon(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Button#setIconAlternateText(String)
     */
    public static PropertyNode<Button> iconAlternateText(final String arg1) {
        return c -> c.setIconAlternateText(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component#setId(String)
     */
    public static PropertyNode<Component> id(final String arg1) {
        return c -> c.setId(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractComponent#setImmediate(boolean)
     */
    public static PropertyNode<AbstractComponent> immediate(final boolean arg1) {
        return c -> c.setImmediate(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.ProgressBar#setIndeterminate(boolean)
     */
    public static PropertyNode<ProgressBar> indeterminate(final boolean arg1) {
        return c -> c.setIndeterminate(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setInputPrompt(String)
     * @see com.vaadin.ui.ComboBox#setInputPrompt(String)
     * @see com.vaadin.ui.PopupDateField#setInputPrompt(String)
     */
    public static PropertyNode<AbstractField> inputPrompt(final String arg1) {
        return c -> {
            if (c instanceof AbstractTextField) {
                ((AbstractTextField) c).setInputPrompt(arg1);
            }
            if (c instanceof ComboBox) {
                ((ComboBox) c).setInputPrompt(arg1);
            }
            if (c instanceof PopupDateField) {
                ((PopupDateField) c).setInputPrompt(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setInvalidAllowed(boolean)
     */
    public static PropertyNode<AbstractField> invalidAllowed(final boolean arg1) {
        return c -> c.setInvalidAllowed(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setInvalidCommitted(boolean)
     */
    public static PropertyNode<AbstractField> invalidCommitted(final boolean arg1) {
        return c -> c.setInvalidCommitted(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setItemCaption(Object, String)
     */
    public static PropertyNode<AbstractSelect> itemCaption(final Object arg1, final String arg2) {
        return c -> c.setItemCaption(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setItemCaptionMode(com.vaadin.ui.AbstractSelect.ItemCaptionMode)
     */
    public static PropertyNode<AbstractSelect> itemCaptionMode(final AbstractSelect.ItemCaptionMode arg1) {
        return c -> c.setItemCaptionMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setItemCaptionPropertyId(Object)
     */
    public static PropertyNode<AbstractSelect> itemCaptionPropertyId(final Object arg1) {
        return c -> c.setItemCaptionPropertyId(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setItemDescriptionGenerator(com.vaadin.ui.AbstractSelect.ItemDescriptionGenerator)
     * @see com.vaadin.ui.Tree#setItemDescriptionGenerator(com.vaadin.ui.AbstractSelect.ItemDescriptionGenerator)
     */
    public static PropertyNode<AbstractSelect> itemDescriptionGenerator(final AbstractSelect.ItemDescriptionGenerator arg1) {
        return c -> {
            if (c instanceof Table) {
                ((Table) c).setItemDescriptionGenerator(arg1);
            }
            if (c instanceof Tree) {
                ((Tree) c).setItemDescriptionGenerator(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.OptionGroup#setItemEnabled(Object, boolean)
     */
    public static PropertyNode<OptionGroup> itemEnabled(final Object arg1, final boolean arg2) {
        return c -> c.setItemEnabled(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setItemIcon(Object, Resource)
     */
    public static PropertyNode<AbstractSelect> itemIcon(final Object arg1, final Resource arg2) {
        return c -> c.setItemIcon(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Tree#setItemIcon(Object, Resource, String)
     */
    public static PropertyNode<Tree> itemIcon(final Object arg1, final Resource arg2, final String arg3) {
        return c -> c.setItemIcon(arg1, arg2, arg3);
    }

    /**
     *
     * @see com.vaadin.ui.Tree#setItemIconAlternateText(Object, String)
     */
    public static PropertyNode<Tree> itemIconAlternateText(final Object arg1, final String arg2) {
        return c -> c.setItemIconAlternateText(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setItemIconPropertyId(Object)
     */
    public static PropertyNode<AbstractSelect> itemIconPropertyId(final Object arg1) {
        return c -> c.setItemIconPropertyId(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Tree#setItemStyleGenerator(com.vaadin.ui.Tree.ItemStyleGenerator)
     */
    public static PropertyNode<Tree> itemStyleGenerator(final Tree.ItemStyleGenerator arg1) {
        return c -> c.setItemStyleGenerator(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TwinColSelect#setLeftColumnCaption(String)
     */
    public static PropertyNode<TwinColSelect> leftColumnCaption(final String arg1) {
        return c -> c.setLeftColumnCaption(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setLenient(boolean)
     */
    public static PropertyNode<DateField> lenient(final boolean arg1) {
        return c -> c.setLenient(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setLocked(boolean)
     */
    public static PropertyNode<AbstractSplitPanel> locked(final boolean arg1) {
        return c -> c.setLocked(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Layout.MarginHandler#setMargin(boolean)
     */
    public static <S extends Layout.MarginHandler & Component> PropertyNode<S> margin(final boolean arg1) {
        return c -> c.setMargin(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Layout.MarginHandler#setMargin(MarginInfo)
     */
    public static <S extends Layout.MarginHandler & Component> PropertyNode<S> margin(final MarginInfo arg1) {
        return c -> c.setMargin(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Slider#setMax(double)
     */
    public static PropertyNode<Slider> max(final double arg1) {
        return c -> c.setMax(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Slider#setMin(double)
     */
    public static PropertyNode<Slider> min(final double arg1) {
        return c -> c.setMin(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setMaxLength(int)
     */
    public static PropertyNode<AbstractTextField> maxLength(final int arg1) {
        return c -> c.setMaxLength(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setMaxSplitPosition(float, com.vaadin.server.Sizeable.Unit)
     */
    public static PropertyNode<AbstractSplitPanel> maxSplitPosition(final float arg1, final Sizeable.Unit arg2) {
        return c -> c.setMaxSplitPosition(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setMinSplitPosition(float, com.vaadin.server.Sizeable.Unit)
     */
    public static PropertyNode<AbstractSplitPanel> minSplitPosition(final float arg1, final Sizeable.Unit arg2) {
        return c -> c.setMinSplitPosition(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setModal(boolean)
     */
    public static PropertyNode<Window> modal(final boolean arg1) {
        return c -> c.setModal(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.MenuBar#setMoreMenuItem(com.vaadin.ui.MenuBar.MenuItem)
     */
    public static PropertyNode<MenuBar> moreMenuItem(final MenuBar.MenuItem arg1) {
        return c -> c.setMoreMenuItem(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setMultiSelect(boolean)
     */
    public static PropertyNode<AbstractSelect> multiSelect(final boolean arg1) {
        return c -> c.setMultiSelect(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setMultiSelectMode(MultiSelectMode)
     * @see com.vaadin.ui.Tree#setMultiSelectMode(MultiSelectMode)
     */
    public static PropertyNode<AbstractSelect> multiSelectMode(final MultiSelectMode arg1) {
        return c -> {
            if (c instanceof Table) {
                ((Table) c).setMultiSelectMode(arg1);
            }
            if (c instanceof Tree) {
                ((Tree) c).setMultiselectMode(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setNewItemHandler(com.vaadin.ui.AbstractSelect.NewItemHandler)
     */
    public static PropertyNode<AbstractSelect> newItemHandler(final AbstractSelect.NewItemHandler arg1) {
        return c -> c.setNewItemHandler(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setNewItemsAllowed(boolean)
     */
    public static PropertyNode<AbstractSelect> newItemsAllowed(final boolean arg1) {
        return c -> c.setNewItemsAllowed(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setNullRepresentation(String)
     * @see com.vaadin.ui.RichTextArea#setNullRepresentation(String)
     */
    public static PropertyNode<AbstractField> nullRepresentation(final String arg1) {
        return c -> {
            if (c instanceof AbstractTextField) {
                ((AbstractTextField) c).setNullRepresentation(arg1);
            }
            if (c instanceof RichTextArea) {
                ((RichTextArea) c).setNullRepresentation(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setNullSelectionAllowed(boolean)
     */
    public static PropertyNode<AbstractSelect> nullSelectionAllowed(final boolean arg1) {
        return c -> c.setNullSelectionAllowed(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSelect#setNullSelectionItemId(Object)
     */
    public static PropertyNode<AbstractSelect> nullSelectionItemId(final Object arg1) {
        return c -> c.setNullSelectionItemId(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setNullSettingAllowed(boolean)
     * @see com.vaadin.ui.RichTextArea#setNullSettingAllowed(boolean)
     */
    public static PropertyNode<AbstractField> nullSettingAllowed(final boolean arg1) {
        return c -> {
            if (c instanceof AbstractTextField) {
                ((AbstractTextField) c).setNullSettingAllowed(arg1);
            }
            if (c instanceof RichTextArea) {
                ((RichTextArea) c).setNullSettingAllowed(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.Slider#setOrientation(SliderOrientation)
     */
    public static PropertyNode<Slider> orientation(final SliderOrientation arg1) {
        return c -> c.setOrientation(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.ComboBox#setPageLength(int)
     * @see com.vaadin.ui.Table#setPageLength(int)
     */
    public static PropertyNode<AbstractSelect> pageLength(final int arg1) {
        return c -> {
            if (c instanceof ComboBox) {
                ((ComboBox) c).setPageLength(arg1);
            }
            if (c instanceof Table) {
                ((Table) c).setPageLength(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setParseErrorMessage(String)
     */
    public static PropertyNode<DateField> parseErrorMessage(final String arg1) {
        return c -> c.setParseErrorMessage(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.PopupView#setPopupVisible(boolean)
     */
    public static PropertyNode<PopupView> popupVisible(final boolean arg1) {
        return c -> c.setPopupVisible(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbsoluteLayout#setPosition(Component, com.vaadin.ui.AbsoluteLayout.ComponentPosition)
     */
    public static PropertyNode<AbsoluteLayout> position(final Component arg1, final AbsoluteLayout.ComponentPosition arg2) {
        return c -> c.setPosition(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setPositionX(int)
     */
    public static PropertyNode<Window> positionX(final int arg1) {
        return c -> c.setPositionX(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setPositionY(int)
     */
    public static PropertyNode<Window> positionY(final int arg1) {
        return c -> c.setPositionY(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Video#setPoster(Resource)
     */
    public static PropertyNode<Video> poster(final Resource arg1) {
        return c -> c.setPoster(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component#setPrimaryStyleName(String)
     */
    public static PropertyNode<Component> primaryStyleName(final String arg1) {
        return c -> c.setPrimaryStyleName(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Property.Viewer#setPropertyDataSource(Property)
     */
    public static <S extends Property.Viewer & Component> PropertyNode<S> propertyDataSource(final Property arg1) {
        return c -> c.setPropertyDataSource(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setRangeEnd(Date)
     */
    public static PropertyNode<DateField> rangeEnd(final Date arg1) {
        return c -> c.setRangeEnd(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setRangeStart(Date)
     */
    public static PropertyNode<DateField> rangeStart(final Date arg1) {
        return c -> c.setRangeStart(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component#setReadOnly(boolean)
     */
    public static PropertyNode<Component> readOnly(final boolean arg1) {
        return c -> c.setReadOnly(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#setReceiver(com.vaadin.ui.Upload.Receiver)
     */
    public static PropertyNode<Upload> receiver(final Upload.Receiver arg1) {
        return c -> c.setReceiver(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Field#setRequired(boolean)
     */
    public static PropertyNode<Field> required(final boolean arg1) {
        return c -> c.setRequired(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Field#setRequiredError(String)
     */
    public static PropertyNode<Field> requiredError(final String arg1) {
        return c -> c.setRequiredError(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setResizable(boolean)
     */
    public static PropertyNode<Window> resizable(final boolean arg1) {
        return c -> c.setResizable(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setResizeLazy(boolean)
     */
    public static PropertyNode<Window> resizeLazy(final boolean arg1) {
        return c -> c.setResizeLazy(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setResolution(Resolution)
     */
    public static PropertyNode<DateField> resolution(final Resolution arg1) {
        return c -> c.setResolution(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Slider#setResolution(int)
     */
    public static PropertyNode<Slider> resolution(final int arg1) {
        return c -> c.setResolution(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Link#setResource(Resource)
     */
    public static PropertyNode<Link> resource(final Resource arg1) {
        return c -> c.setResource(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TwinColSelect#setRightColumnCaption(String)
     */
    public static PropertyNode<TwinColSelect> rightColumnCaption(final String arg1) {
        return c -> c.setRightColumnCaption(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.GridLayout#setRowExpandRatio(int, float)
     */
    public static PropertyNode<GridLayout> rowExpandRatio(final int arg1, final float arg2) {
        return c -> c.setRowExpandRatio(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setRowGenerator(com.vaadin.ui.Table.RowGenerator)
     */
    public static PropertyNode<Table> rowGenerator(final Table.RowGenerator arg1) {
        return c -> c.setRowGenerator(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setRowHeaderMode(com.vaadin.ui.Table.RowHeaderMode)
     */
    public static PropertyNode<Table> rowHeaderMode(final Table.RowHeaderMode arg1) {
        return c -> c.setRowHeaderMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.GridLayout#setRows(int)
     * @see com.vaadin.ui.ListSelect#setRows(int)
     * @see com.vaadin.ui.TextArea#setRows(int)
     * @see com.vaadin.ui.TwinColSelect#setRows(int)
     */
    public static PropertyNode<AbstractComponent> rows(final int arg1) {
        return c -> {
            if (c instanceof GridLayout) {
                ((GridLayout) c).setRows(arg1);
            }
            if (c instanceof ListSelect) {
                ((ListSelect) c).setRows(arg1);
            }
            if (c instanceof TextArea) {
                ((TextArea) c).setRows(arg1);
            }
            if (c instanceof TwinColSelect) {
                ((TwinColSelect) c).setRows(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.Panel#setScrollLeft(int)
     */
    public static PropertyNode<Panel> scrollLeft(final int arg1) {
        return c -> c.setScrollLeft(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.ComboBox#setScrollToSelectedItem(boolean)
     */
    public static PropertyNode<ComboBox> scrollToSelectedItem(final boolean arg1) {
        return c -> c.setScrollToSelectedItem(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Panel#setScrollTop(int)
     */
    public static PropertyNode<Panel> scrollTop(final int arg1) {
        return c -> c.setScrollTop(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setSecondComponent(Component)
     */
    public static PropertyNode<AbstractSplitPanel> secondComponent(final Component arg1) {
        return c -> c.setSecondComponent(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setSelectable(boolean)
     * @see com.vaadin.ui.Tree#setSelectable(boolean)
     */
    public static PropertyNode<AbstractSelect> selectable(final boolean arg1) {
        return c -> {
            if (c instanceof Table) {
                ((Table) c).setSelectable(arg1);
            }
            if (c instanceof Tree) {
                ((Tree) c).setSelectable(arg1);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#setSelectedTab(int)
     */
    public static PropertyNode<TabSheet> selectedTab(final int arg1) {
        return c -> c.setSelectedTab(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#setSelectedTab(Component)
     */
    public static PropertyNode<TabSheet> selectedTab(final Component arg1) {
        return c -> c.setSelectedTab(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#setSelectedTab(com.vaadin.ui.TabSheet.Tab)
     */
    public static PropertyNode<TabSheet> selectedTab(final TabSheet.Tab arg1) {
        return c -> c.setSelectedTab(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setSelectionRange(int, int)
     */
    public static PropertyNode<AbstractTextField> selectionRange(final int arg1, final int arg2) {
        return c -> c.setSelectionRange(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setShowISOWeekNumbers(boolean)
     */
    public static PropertyNode<DateField> showISOWeekNumbers(final boolean arg1) {
        return c -> c.setShowISOWeekNumbers(arg1);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setSizeFull()
     */
    public static <S extends Sizeable & Component> PropertyNode<S> sizeFull() {
        return c -> c.setSizeFull();
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setSizeUndefined()
     */
    public static <S extends Sizeable & Component> PropertyNode<S> sizeUndefined() {
        return c -> c.setSizeUndefined();
    }

    /**
     *
     * @see com.vaadin.ui.Table#setSortAscending(boolean)
     */
    public static PropertyNode<Table> sortAscending(final boolean arg1) {
        return c -> c.setSortAscending(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setSortContainerPropertyId(Object)
     */
    public static PropertyNode<Table> sortContainerPropertyId(final Object arg1) {
        return c -> c.setSortContainerPropertyId(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setSortEnabled(boolean)
     */
    public static PropertyNode<Table> sortEnabled(final boolean arg1) {
        return c -> c.setSortEnabled(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractEmbedded#setSource(Resource)
     */
    public static PropertyNode<AbstractEmbedded> source(final Resource arg1) {
        return c -> c.setSource(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Layout.SpacingHandler#setSpacing(boolean)
     */
    public static <S extends Layout.SpacingHandler & Component> PropertyNode<S> spacing(final boolean arg1) {
        return c -> c.setSpacing(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setSplitPosition(float)
     */
    public static PropertyNode<AbstractSplitPanel> splitPosition(final float arg1) {
        return c -> c.setSplitPosition(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setSplitPosition(float, boolean)
     */
    public static PropertyNode<AbstractSplitPanel> splitPosition(final float arg1, final boolean arg2) {
        return c -> c.setSplitPosition(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setSplitPosition(float, com.vaadin.server.Sizeable.Unit)
     */
    public static PropertyNode<AbstractSplitPanel> splitPosition(final float arg1, final Sizeable.Unit arg2) {
        return c -> c.setSplitPosition(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#setSplitPosition(float, com.vaadin.server.Sizeable.Unit, boolean)
     */
    public static PropertyNode<AbstractSplitPanel> splitPosition(final float arg1, final Sizeable.Unit arg2, final boolean arg3) {
        return c -> c.setSplitPosition(arg1, arg2, arg3);
    }

    // TODO addStyleName vs. setStyleName
    /**
     *
     * @see com.vaadin.ui.Component#setStyleName(String)
     */
    public static PropertyNode<Component> styleName(final String... arg1) {
        return c -> {
            for (String arg : arg1) {
                c.addStyleName(arg);
            }
        };
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#setTabCaptionsAsHtml(boolean)
     */
    public static PropertyNode<TabSheet> tabCaptionsAsHtml(final boolean arg1) {
        return c -> c.setTabCaptionsAsHtml(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component.Focusable#setTabIndex(int)
     */
    public static PropertyNode<Component.Focusable> tabIndex(final int arg1) {
        return c -> c.setTabIndex(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#setTabPosition(com.vaadin.ui.TabSheet.Tab, int)
     */
    public static PropertyNode<TabSheet> tabPosition(final TabSheet.Tab arg1, final int arg2) {
        return c -> c.setTabPosition(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.ui.Window#setTabStopEnabled(boolean)
     */
    public static PropertyNode<Window> tabStopEnabled(final boolean arg1) {
        return c -> c.setTabStopEnabled(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setTableFieldFactory(TableFieldFactory)
     */
    public static PropertyNode<Table> tableFieldFactory(final TableFieldFactory arg1) {
        return c -> c.setTableFieldFactory(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Link#setTargetBorder(BorderStyle)
     */
    public static PropertyNode<Link> targetBorder(final BorderStyle arg1) {
        return c -> c.setTargetBorder(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Link#setTargetHeight(int)
     */
    public static PropertyNode<Link> targetHeight(final int arg1) {
        return c -> c.setTargetHeight(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Link#setTargetName(String)
     */
    public static PropertyNode<Link> targetName(final String arg1) {
        return c -> c.setTargetName(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Link#setTargetWidth(int)
     */
    public static PropertyNode<Link> targetWidth(final int arg1) {
        return c -> c.setTargetWidth(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.CustomLayout#setTemplateContents(String)
     */
    public static PropertyNode<CustomLayout> templateContents(final String arg1) {
        return c -> c.setTemplateContents(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.CustomLayout#setTemplateName(String)
     */
    public static PropertyNode<CustomLayout> templateName(final String arg1) {
        return c -> c.setTemplateName(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setTextChangeEventMode(com.vaadin.ui.AbstractTextField.TextChangeEventMode)
     */
    public static PropertyNode<AbstractTextField> textChangeEventMode(final AbstractTextField.TextChangeEventMode arg1) {
        return c -> c.setTextChangeEventMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractTextField#setTextChangeTimeout(int)
     */
    public static PropertyNode<AbstractTextField> textChangeTimeout(final int arg1) {
        return c -> c.setTextChangeTimeout(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.PopupDateField#setTextFieldEnabled(boolean)
     */
    public static PropertyNode<PopupDateField> textFieldEnabled(final boolean arg1) {
        return c -> c.setTextFieldEnabled(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.ComboBox#setTextInputAllowed(boolean)
     */
    public static PropertyNode<ComboBox> textInputAllowed(final boolean arg1) {
        return c -> c.setTextInputAllowed(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.DateField#setTimeZone(TimeZone)
     */
    public static PropertyNode<DateField> timeZone(final TimeZone arg1) {
        return c -> c.setTimeZone(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractField#setValidationVisible(boolean)
     */
    public static PropertyNode<AbstractField> validationVisible(final boolean arg1) {
        return c -> c.setValidationVisible(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Property#setValue(Object)
     */
    public static <S extends Property & Component> PropertyNode<S> value(final Object arg1) {
        return c -> c.setValue(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Component#setVisible(boolean)
     */
    public static PropertyNode<Component> visible(final boolean arg1) {
        return c -> c.setVisible(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#setVisibleColumns(Object...)
     */
    public static PropertyNode<Table> visibleColumns(final Object... arg1) {
        return c -> c.setVisibleColumns(arg1);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setWidth(String)
     */
    public static <S extends Sizeable & Component> PropertyNode<S> width(final String arg1) {
        return c -> c.setWidth(arg1);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setWidth(float, com.vaadin.server.Sizeable.Unit)
     */
    public static <S extends Sizeable & Component> PropertyNode<S> width(final float arg1, final Sizeable.Unit arg2) {
        return c -> c.setWidth(arg1, arg2);
    }

    /**
     *
     * @see com.vaadin.server.Sizeable#setWidthUndefined()
     */
    public static <S extends Sizeable & Component> PropertyNode<S> widthUndefined() {
        return c -> c.setWidthUndefined();
    }

    /**
     *
     * @see com.vaadin.ui.Window#setWindowMode(WindowMode)
     */
    public static PropertyNode<Window> windowMode(final WindowMode arg1) {
        return c -> c.setWindowMode(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TextArea#setWordwrap(boolean)
     */
    public static PropertyNode<TextArea> wordWrap(final boolean arg1) {
        return c -> c.setWordwrap(arg1);
    }
}

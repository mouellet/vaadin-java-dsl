package org.vaadin.addons.dsl;

import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;

import org.vaadin.addons.dsl.core.PropertyNode;

import com.vaadin.data.HasDataProvider;
import com.vaadin.data.HasFilterableDataProvider;
import com.vaadin.data.HasItems;
import com.vaadin.data.HasValue;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.GridSortOrderBuilder;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.server.ClientConnector;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Scrollable;
import com.vaadin.server.SerializableFunction;
import com.vaadin.server.SerializableSupplier;
import com.vaadin.server.SerializableToIntFunction;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.PreloadMode;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.shared.ui.grid.ColumnResizeMode;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.shared.ui.window.WindowRole;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractDateField;
import com.vaadin.ui.AbstractEmbedded;
import com.vaadin.ui.AbstractMedia;
import com.vaadin.ui.AbstractMultiSelect;
import com.vaadin.ui.AbstractSingleSelect;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CheckBoxGroup;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.DateTimeField;
import com.vaadin.ui.DescriptionGenerator;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Flash;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.HasValueChangeMode;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.ItemCollapseAllowedProvider;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Link;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.Slider;
import com.vaadin.ui.StyleGenerator;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeGrid;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Video;
import com.vaadin.ui.Window;
import com.vaadin.ui.components.grid.DetailsGenerator;
import com.vaadin.ui.components.grid.HeaderRow;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Properties {

    private Properties() {
    }

    public static <T extends AbstractMedia> PropertyNode<T> altText(final String arg0) {
        return c -> c.setAltText(arg0);
    }

    public static <T extends AbstractEmbedded> PropertyNode<T> alternateText(final String arg0) {
        return c -> c.setAlternateText(arg0);
    }

    public static <T extends Flash> PropertyNode<T> archive(final String arg0) {
        return c -> c.setArchive(arg0);
    }

    public static <T extends Window> PropertyNode<T> assistiveDescription(final Component... arg0) {
        return c -> c.setAssistiveDescription(arg0);
    }

    public static <T extends Window> PropertyNode<T> assistivePostfix(final String arg0) {
        return c -> c.setAssistivePostfix(arg0);
    }

    public static <T extends Window> PropertyNode<T> assistivePrefix(final String arg0) {
        return c -> c.setAssistivePrefix(arg0);
    }

    public static <T extends Window> PropertyNode<T> assistiveRole(final WindowRole arg0) {
        return c -> c.setAssistiveRole(arg0);
    }

    public static <T extends DateTimeField> PropertyNode<T> assistiveText(final String arg0) {
        return c -> c.setAssistiveText(arg0);
    }

    public static <T extends MenuBar> PropertyNode<T> autoOpen(final boolean arg0) {
        return c -> c.setAutoOpen(arg0);
    }

    public static <T extends Tree> PropertyNode<T> autoRecalculateWidth(final boolean arg0) {
        return c -> c.setAutoRecalculateWidth(arg0);
    }

    public static <T extends AbstractMedia> PropertyNode<T> autoplay(final boolean arg0) {
        return c -> c.setAutoplay(arg0);
    }

    public static <T extends Grid> PropertyNode<T> bodyRowHeight(final double arg0) {
        return c -> c.setBodyRowHeight(arg0);
    }

    public static <T extends Upload> PropertyNode<T> buttonCaption(final String arg0) {
        return c -> c.setButtonCaption(arg0);
    }

    public static <T extends Upload> PropertyNode<T> buttonStyleName(final String arg0) {
        return c -> c.setButtonStyleName(arg0);
    }

    public static <T extends Component> PropertyNode<T> caption(final String arg0) {
        return c -> c.setCaption(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> captionAsHtml(final boolean arg0) {
        return c -> c.setCaptionAsHtml(arg0);
    }

    public static <T extends Embedded> PropertyNode<T> classId(final String arg0) {
        return c -> c.setClassId(arg0);
    }

    public static <T extends Button> PropertyNode<T> clickShortcut(final int arg0, final int... arg1) {
        return c -> c.setClickShortcut(arg0, arg1);
    }

    public static <T extends Window> PropertyNode<T> closable(final boolean arg0) {
        return c -> c.setClosable(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> closeHandler(final TabSheet.CloseHandler arg0) {
        return c -> c.setCloseHandler(arg0);
    }

    public static <T extends Flash> PropertyNode<T> codebase(final String arg0) {
        return c -> c.setCodebase(arg0);
    }

    public static <T extends Flash> PropertyNode<T> codetype(final String arg0) {
        return c -> c.setCodetype(arg0);
    }

    public static <T extends GridLayout> PropertyNode<T> columnExpandRatio(final int arg0, final float arg1) {
        return c -> c.setColumnExpandRatio(arg0, arg1);
    }

    public static <T extends Grid> PropertyNode<T> columnOrder(final Grid.Column... arg0) {
        return c -> c.setColumnOrder(arg0);
    }

    public static <T extends Grid> PropertyNode<T> columnOrder(final String... arg0) {
        return c -> c.setColumnOrder(arg0);
    }

    public static <T extends Grid> PropertyNode<T> columnReorderingAllowed(final boolean arg0) {
        return c -> c.setColumnReorderingAllowed(arg0);
    }

    public static <T extends Grid> PropertyNode<T> columnResizeMode(final ColumnResizeMode arg0) {
        return c -> c.setColumnResizeMode(arg0);
    }

    public static <T extends Grid> PropertyNode<T> columns(final String... arg0) {
        return c -> c.setColumns(arg0);
    }

    public static <T extends GridLayout> PropertyNode<T> columns(final int arg0) {
        return c -> c.setColumns(arg0);
    }

    public static <T extends Layout.AlignmentHandler & Component> PropertyNode<T> componentAlignment(final Component arg0, final Alignment arg1) {
        return c -> c.setComponentAlignment(arg0, arg1);
    }

    public static <T extends AbstractComponent> PropertyNode<T> componentError(final ErrorMessage arg0) {
        return c -> c.setComponentError(arg0);
    }

    public static <T extends SingleComponentContainer> PropertyNode<T> content(final Component arg0) {
        return c -> c.setContent(arg0);
    }

    public static <T extends PopupView> PropertyNode<T> content(final PopupView.Content arg0) {
        return c -> c.setContent(arg0);
    }

    public static <T extends Tree> PropertyNode<T> contentMode(final ContentMode arg0) {
        return c -> c.setContentMode(arg0);
    }

    public static <T extends AbstractTextField> PropertyNode<T> cursorPosition(final int arg0) {
        return c -> c.setCursorPosition(arg0);
    }

    public static <T extends GridLayout> PropertyNode<T> cursorX(final int arg0) {
        return c -> c.setCursorX(arg0);
    }

    public static <T extends GridLayout> PropertyNode<T> cursorY(final int arg0) {
        return c -> c.setCursorY(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> data(final Object arg0) {
        return c -> c.setData(arg0);
    }

    public static <T extends HasDataProvider> PropertyNode<T> dataProvider(final DataProvider arg0) {
        return c -> c.setDataProvider(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> dataProvider(final ListDataProvider arg0) {
        return c -> c.setDataProvider(arg0);
    }

    public static <T extends HasFilterableDataProvider> PropertyNode<T> dataProvider(final DataProvider arg0, final SerializableFunction arg1) {
        return c -> c.setDataProvider(arg0, arg1);
    }

    public static <T extends ComboBox> PropertyNode<T> dataProvider(final ComboBox.CaptionFilter arg0, final ListDataProvider arg1) {
        return c -> c.setDataProvider(arg0, arg1);
    }

    public static <T extends ComboBox> PropertyNode<T> dataProvider(final ComboBox.FetchItemsCallback arg0, final SerializableToIntFunction arg1) {
        return c -> c.setDataProvider(arg0, arg1);
    }

    public static <T extends Grid> PropertyNode<T> dataProvider(final Grid.FetchItemsCallback arg0, final SerializableSupplier arg1) {
        return c -> c.setDataProvider(arg0, arg1);
    }

    public static <T extends AbstractDateField> PropertyNode<T> dateFormat(final String arg0) {
        return c -> c.setDateFormat(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> dateOutOfRangeMessage(final String arg0) {
        return c -> c.setDateOutOfRangeMessage(arg0);
    }

    public static <T extends Layout.AlignmentHandler & Component> PropertyNode<T> defaultComponentAlignment(final Alignment arg0) {
        return c -> c.setDefaultComponentAlignment(arg0);
    }

    public static <T extends Grid> PropertyNode<T> defaultHeaderRow(final HeaderRow arg0) {
        return c -> c.setDefaultHeaderRow(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> defaultValue(final Temporal arg0) {
        return c -> c.setDefaultValue(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> description(final String arg0) {
        return c -> c.setDescription(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> description(final String arg0, final ContentMode arg1) {
        return c -> c.setDescription(arg0, arg1);
    }

    public static <T extends Grid> PropertyNode<T> descriptionGenerator(final DescriptionGenerator arg0) {
        return c -> c.setDescriptionGenerator(arg0);
    }

    public static <T extends Grid> PropertyNode<T> descriptionGenerator(final DescriptionGenerator arg0, final ContentMode arg1) {
        return c -> c.setDescriptionGenerator(arg0, arg1);
    }

    public static <T extends Grid> PropertyNode<T> detailsGenerator(final DetailsGenerator arg0) {
        return c -> c.setDetailsGenerator(arg0);
    }

    public static <T extends Grid> PropertyNode<T> detailsVisible(final Object arg0, final boolean arg1) {
        return c -> c.setDetailsVisible(arg0, arg1);
    }

    public static <T extends Button> PropertyNode<T> disableOnClick(final boolean arg0) {
        return c -> c.setDisableOnClick(arg0);
    }

    public static <T extends Window> PropertyNode<T> draggable(final boolean arg0) {
        return c -> c.setDraggable(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> emptySelectionAllowed(final boolean arg0) {
        return c -> c.setEmptySelectionAllowed(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> emptySelectionCaption(final String arg0) {
        return c -> c.setEmptySelectionCaption(arg0);
    }

    public static <T extends Component> PropertyNode<T> enabled(final boolean arg0) {
        return c -> c.setEnabled(arg0);
    }

    public static <T extends ClientConnector & Component> PropertyNode<T> errorHandler(final ErrorHandler arg0) {
        return c -> c.setErrorHandler(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> firstComponent(final Component arg0) {
        return c -> c.setFirstComponent(arg0);
    }

    public static <T extends Grid> PropertyNode<T> footerRowHeight(final double arg0) {
        return c -> c.setFooterRowHeight(arg0);
    }

    public static <T extends Grid> PropertyNode<T> footerVisible(final boolean arg0) {
        return c -> c.setFooterVisible(arg0);
    }

    public static <T extends Grid> PropertyNode<T> frozenColumnCount(final int arg0) {
        return c -> c.setFrozenColumnCount(arg0);
    }

    public static <T extends Grid> PropertyNode<T> headerRowHeight(final double arg0) {
        return c -> c.setHeaderRowHeight(arg0);
    }

    public static <T extends Grid> PropertyNode<T> headerVisible(final boolean arg0) {
        return c -> c.setHeaderVisible(arg0);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> height(final String arg0) {
        return c -> c.setHeight(arg0);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> height(final float arg0, final Sizeable.Unit arg1) {
        return c -> c.setHeight(arg0, arg1);
    }

    public static <T extends Grid> PropertyNode<T> heightByRows(final double arg0) {
        return c -> c.setHeightByRows(arg0);
    }

    public static <T extends Grid> PropertyNode<T> heightMode(final HeightMode arg0) {
        return c -> c.setHeightMode(arg0);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> heightUndefined() {
        return c -> c.setHeightUndefined();
    }

    public static <T extends GridLayout> PropertyNode<T> hideEmptyRowsAndColumns(final boolean arg0) {
        return c -> c.setHideEmptyRowsAndColumns(arg0);
    }

    public static <T extends PopupView> PropertyNode<T> hideOnMouseOut(final boolean arg0) {
        return c -> c.setHideOnMouseOut(arg0);
    }

    public static <T extends TreeGrid> PropertyNode<T> hierarchyColumn(final Grid.Column arg0) {
        return c -> c.setHierarchyColumn(arg0);
    }

    public static <T extends TreeGrid> PropertyNode<T> hierarchyColumn(final String arg0) {
        return c -> c.setHierarchyColumn(arg0);
    }

    public static <T extends CheckBoxGroup> PropertyNode<T> htmlContentAllowed(final boolean arg0) {
        return c -> c.setHtmlContentAllowed(arg0);
    }

    public static <T extends Component> PropertyNode<T> icon(final Resource arg0) {
        return c -> c.setIcon(arg0);
    }

    public static <T extends Button> PropertyNode<T> icon(final Resource arg0, final String arg1) {
        return c -> c.setIcon(arg0, arg1);
    }

    public static <T extends Button> PropertyNode<T> iconAlternateText(final String arg0) {
        return c -> c.setIconAlternateText(arg0);
    }

    public static <T extends Component> PropertyNode<T> id(final String arg0) {
        return c -> c.setId(arg0);
    }

    public static <T extends Upload> PropertyNode<T> immediateMode(final boolean arg0) {
        return c -> c.setImmediateMode(arg0);
    }

    public static <T extends ProgressBar> PropertyNode<T> indeterminate(final boolean arg0) {
        return c -> c.setIndeterminate(arg0);
    }

    public static <T extends Tree> PropertyNode<T> itemCaptionGenerator(final ItemCaptionGenerator arg0) {
        return c -> c.setItemCaptionGenerator(arg0);
    }

    public static <T extends Tree> PropertyNode<T> itemCollapseAllowedProvider(final ItemCollapseAllowedProvider arg0) {
        return c -> c.setItemCollapseAllowedProvider(arg0);
    }

    public static <T extends Tree> PropertyNode<T> itemDescriptionGenerator(final DescriptionGenerator arg0) {
        return c -> c.setItemDescriptionGenerator(arg0);
    }

    public static <T extends Tree> PropertyNode<T> itemIconGenerator(final IconGenerator arg0) {
        return c -> c.setItemIconGenerator(arg0);
    }

    public static <T extends HasItems> PropertyNode<T> items(final Object... arg0) {
        return c -> c.setItems(arg0);
    }

    public static <T extends HasItems> PropertyNode<T> items(final Collection arg0) {
        return c -> c.setItems(arg0);
    }

    public static <T extends HasItems> PropertyNode<T> items(final Stream arg0) {
        return c -> c.setItems(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> items(final ComboBox.CaptionFilter arg0, final Object... arg1) {
        return c -> c.setItems(arg0, arg1);
    }

    public static <T extends ComboBox> PropertyNode<T> items(final ComboBox.CaptionFilter arg0, final Collection arg1) {
        return c -> c.setItems(arg0, arg1);
    }

    public static <T extends TwinColSelect> PropertyNode<T> leftColumnCaption(final String arg0) {
        return c -> c.setLeftColumnCaption(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> lenient(final boolean arg0) {
        return c -> c.setLenient(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> locale(final Locale arg0) {
        return c -> c.setLocale(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> locked(final boolean arg0) {
        return c -> c.setLocked(arg0);
    }

    public static <T extends LoginForm> PropertyNode<T> loginButtonCaption(final String arg0) {
        return c -> c.setLoginButtonCaption(arg0);
    }

    public static <T extends AbstractMedia> PropertyNode<T> loop(final boolean arg0) {
        return c -> c.setLoop(arg0);
    }

    public static <T extends Layout.MarginHandler & Component> PropertyNode<T> margin(final boolean arg0) {
        return c -> c.setMargin(arg0);
    }

    public static <T extends Layout.MarginHandler & Component> PropertyNode<T> margin(final MarginInfo arg0) {
        return c -> c.setMargin(arg0);
    }

    public static <T extends Slider> PropertyNode<T> max(final double arg0) {
        return c -> c.setMax(arg0);
    }

    public static <T extends AbstractTextField> PropertyNode<T> maxLength(final int arg0) {
        return c -> c.setMaxLength(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> maxSplitPosition(final float arg0, final Sizeable.Unit arg1) {
        return c -> c.setMaxSplitPosition(arg0, arg1);
    }

    public static <T extends Embedded> PropertyNode<T> mimeType(final String arg0) {
        return c -> c.setMimeType(arg0);
    }

    public static <T extends Slider> PropertyNode<T> min(final double arg0) {
        return c -> c.setMin(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> minSplitPosition(final float arg0, final Sizeable.Unit arg1) {
        return c -> c.setMinSplitPosition(arg0, arg1);
    }

    public static <T extends Window> PropertyNode<T> modal(final boolean arg0) {
        return c -> c.setModal(arg0);
    }

    public static <T extends MenuBar> PropertyNode<T> moreMenuItem(final MenuBar.MenuItem arg0) {
        return c -> c.setMoreMenuItem(arg0);
    }

    public static <T extends AbstractMedia> PropertyNode<T> muted(final boolean arg0) {
        return c -> c.setMuted(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> newItemHandler(final ComboBox.NewItemHandler arg0) {
        return c -> c.setNewItemHandler(arg0);
    }

    public static <T extends Slider> PropertyNode<T> orientation(final SliderOrientation arg0) {
        return c -> c.setOrientation(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> pageLength(final int arg0) {
        return c -> c.setPageLength(arg0);
    }

    public static <T extends Flash> PropertyNode<T> parameter(final String arg0, final String arg1) {
        return c -> c.setParameter(arg0, arg1);
    }

    public static <T extends Component> PropertyNode<T> parent(final HasComponents arg0) {
        return c -> c.setParent(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> parseErrorMessage(final String arg0) {
        return c -> c.setParseErrorMessage(arg0);
    }

    public static <T extends LoginForm> PropertyNode<T> passwordCaption(final String arg0) {
        return c -> c.setPasswordCaption(arg0);
    }

    public static <T extends AbstractTextField> PropertyNode<T> placeholder(final String arg0) {
        return c -> c.setPlaceholder(arg0);
    }

    public static <T extends PopupView> PropertyNode<T> popupVisible(final boolean arg0) {
        return c -> c.setPopupVisible(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> popupWidth(final String arg0) {
        return c -> c.setPopupWidth(arg0);
    }

    public static <T extends Window> PropertyNode<T> position(final int arg0, final int arg1) {
        return c -> c.setPosition(arg0, arg1);
    }

    public static <T extends Window> PropertyNode<T> positionX(final int arg0) {
        return c -> c.setPositionX(arg0);
    }

    public static <T extends Window> PropertyNode<T> positionY(final int arg0) {
        return c -> c.setPositionY(arg0);
    }

    public static <T extends Video> PropertyNode<T> poster(final Resource arg0) {
        return c -> c.setPoster(arg0);
    }

    public static <T extends AbstractMedia> PropertyNode<T> preload(final PreloadMode arg0) {
        return c -> c.setPreload(arg0);
    }

    public static <T extends Component> PropertyNode<T> primaryStyleName(final String arg0) {
        return c -> c.setPrimaryStyleName(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> rangeEnd(final Temporal arg0) {
        return c -> c.setRangeEnd(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> rangeStart(final Temporal arg0) {
        return c -> c.setRangeStart(arg0);
    }

    public static <T extends HasValue & Component> PropertyNode<T> readOnly(final boolean arg0) {
        return c -> c.setReadOnly(arg0);
    }

    public static <T extends Upload> PropertyNode<T> receiver(final Upload.Receiver arg0) {
        return c -> c.setReceiver(arg0);
    }

    public static <T extends Window> PropertyNode<T> resizable(final boolean arg0) {
        return c -> c.setResizable(arg0);
    }

    public static <T extends Window> PropertyNode<T> resizeLazy(final boolean arg0) {
        return c -> c.setResizeLazy(arg0);
    }

    public static <T extends Slider> PropertyNode<T> resolution(final int arg0) {
        return c -> c.setResolution(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> resolution(final Enum arg0) {
        return c -> c.setResolution(arg0);
    }

    public static <T extends Link> PropertyNode<T> resource(final Resource arg0) {
        return c -> c.setResource(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> responsive(final boolean arg0) {
        return c -> c.setResponsive(arg0);
    }

    public static <T extends TwinColSelect> PropertyNode<T> rightColumnCaption(final String arg0) {
        return c -> c.setRightColumnCaption(arg0);
    }

    public static <T extends GridLayout> PropertyNode<T> rowExpandRatio(final int arg0, final float arg1) {
        return c -> c.setRowExpandRatio(arg0, arg1);
    }

    public static <T extends Tree> PropertyNode<T> rowHeight(final double arg0) {
        return c -> c.setRowHeight(arg0);
    }

    public static <T extends GridLayout> PropertyNode<T> rows(final int arg0) {
        return c -> c.setRows(arg0);
    }

    public static <T extends Scrollable & Component> PropertyNode<T> scrollLeft(final int arg0) {
        return c -> c.setScrollLeft(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> scrollToSelectedItem(final boolean arg0) {
        return c -> c.setScrollToSelectedItem(arg0);
    }

    public static <T extends Scrollable & Component> PropertyNode<T> scrollTop(final int arg0) {
        return c -> c.setScrollTop(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> secondComponent(final Component arg0) {
        return c -> c.setSecondComponent(arg0);
    }

    public static <T extends AbstractSingleSelect> PropertyNode<T> selectedItem(final Object arg0) {
        return c -> c.setSelectedItem(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> selectedTab(final Component arg0) {
        return c -> c.setSelectedTab(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> selectedTab(final TabSheet.Tab arg0) {
        return c -> c.setSelectedTab(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> selectedTab(final int arg0) {
        return c -> c.setSelectedTab(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> selectedTab(final Component arg0, final boolean arg1) {
        return c -> c.setSelectedTab(arg0, arg1);
    }

    public static <T extends AbstractTextField> PropertyNode<T> selection(final int arg0, final int arg1) {
        return c -> c.setSelection(arg0, arg1);
    }

    public static <T extends Tree> PropertyNode<T> selectionMode(final Grid.SelectionMode arg0) {
        return c -> c.setSelectionMode(arg0);
    }

    public static <T extends AbstractMedia> PropertyNode<T> showControls(final boolean arg0) {
        return c -> c.setShowControls(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> showISOWeekNumbers(final boolean arg0) {
        return c -> c.setShowISOWeekNumbers(arg0);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> sizeFull() {
        return c -> c.setSizeFull();
    }

    public static <T extends Sizeable & Component> PropertyNode<T> sizeUndefined() {
        return c -> c.setSizeUndefined();
    }

    public static <T extends Grid> PropertyNode<T> sortOrder(final GridSortOrderBuilder arg0) {
        return c -> c.setSortOrder(arg0);
    }

    public static <T extends Grid> PropertyNode<T> sortOrder(final List arg0) {
        return c -> c.setSortOrder(arg0);
    }

    public static <T extends AbstractEmbedded> PropertyNode<T> source(final Resource arg0) {
        return c -> c.setSource(arg0);
    }

    public static <T extends AbstractMedia> PropertyNode<T> sources(final Resource... arg0) {
        return c -> c.setSources(arg0);
    }

    public static <T extends Layout.SpacingHandler & Component> PropertyNode<T> spacing(final boolean arg0) {
        return c -> c.setSpacing(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0) {
        return c -> c.setSplitPosition(arg0);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0, final boolean arg1) {
        return c -> c.setSplitPosition(arg0, arg1);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0, final Sizeable.Unit arg1) {
        return c -> c.setSplitPosition(arg0, arg1);
    }

    public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0, final Sizeable.Unit arg1, final boolean arg2) {
        return c -> c.setSplitPosition(arg0, arg1, arg2);
    }

    public static <T extends Flash> PropertyNode<T> standby(final String arg0) {
        return c -> c.setStandby(arg0);
    }

    public static <T extends Tree> PropertyNode<T> styleGenerator(final StyleGenerator arg0) {
        return c -> c.setStyleGenerator(arg0);
    }

    public static <T extends Component> PropertyNode<T> styleName(final String arg0) {
        return c -> c.setStyleName(arg0);
    }

    public static <T extends AbstractComponent> PropertyNode<T> styleName(final String arg0, final boolean arg1) {
        return c -> c.setStyleName(arg0, arg1);
    }

    public static <T extends TabSheet> PropertyNode<T> tabCaptionsAsHtml(final boolean arg0) {
        return c -> c.setTabCaptionsAsHtml(arg0);
    }

    public static <T extends Component.Focusable> PropertyNode<T> tabIndex(final int arg0) {
        return c -> c.setTabIndex(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> tabPosition(final TabSheet.Tab arg0, final int arg1) {
        return c -> c.setTabPosition(arg0, arg1);
    }

    public static <T extends Window> PropertyNode<T> tabStopBottomAssistiveText(final String arg0) {
        return c -> c.setTabStopBottomAssistiveText(arg0);
    }

    public static <T extends Window> PropertyNode<T> tabStopEnabled(final boolean arg0) {
        return c -> c.setTabStopEnabled(arg0);
    }

    public static <T extends Window> PropertyNode<T> tabStopTopAssistiveText(final String arg0) {
        return c -> c.setTabStopTopAssistiveText(arg0);
    }

    public static <T extends TabSheet> PropertyNode<T> tabsVisible(final boolean arg0) {
        return c -> c.setTabsVisible(arg0);
    }

    public static <T extends Link> PropertyNode<T> targetBorder(final BorderStyle arg0) {
        return c -> c.setTargetBorder(arg0);
    }

    public static <T extends Link> PropertyNode<T> targetHeight(final int arg0) {
        return c -> c.setTargetHeight(arg0);
    }

    public static <T extends Link> PropertyNode<T> targetName(final String arg0) {
        return c -> c.setTargetName(arg0);
    }

    public static <T extends Link> PropertyNode<T> targetWidth(final int arg0) {
        return c -> c.setTargetWidth(arg0);
    }

    public static <T extends CustomLayout> PropertyNode<T> templateContents(final String arg0) {
        return c -> c.setTemplateContents(arg0);
    }

    public static <T extends CustomLayout> PropertyNode<T> templateName(final String arg0) {
        return c -> c.setTemplateName(arg0);
    }

    public static <T extends DateTimeField> PropertyNode<T> textFieldEnabled(final boolean arg0) {
        return c -> c.setTextFieldEnabled(arg0);
    }

    public static <T extends ComboBox> PropertyNode<T> textInputAllowed(final boolean arg0) {
        return c -> c.setTextInputAllowed(arg0);
    }

    public static <T extends Embedded> PropertyNode<T> type(final int arg0) {
        return c -> c.setType(arg0);
    }

    public static <T extends LoginForm> PropertyNode<T> usernameCaption(final String arg0) {
        return c -> c.setUsernameCaption(arg0);
    }

    public static <T extends ProgressBar> PropertyNode<T> value(final float arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends CheckBox> PropertyNode<T> value(final Boolean arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends Slider> PropertyNode<T> value(final Double arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends HasValue & Component> PropertyNode<T> value(final Object arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends AbstractTextField> PropertyNode<T> value(final String arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> value(final Temporal arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends AbstractMultiSelect> PropertyNode<T> value(final Set arg0) {
        return c -> c.setValue(arg0);
    }

    public static <T extends HasValueChangeMode> PropertyNode<T> valueChangeMode(final ValueChangeMode arg0) {
        return c -> c.setValueChangeMode(arg0);
    }

    public static <T extends HasValueChangeMode> PropertyNode<T> valueChangeTimeout(final int arg0) {
        return c -> c.setValueChangeTimeout(arg0);
    }

    public static <T extends Component> PropertyNode<T> visible(final boolean arg0) {
        return c -> c.setVisible(arg0);
    }

    public static <T extends NativeSelect> PropertyNode<T> visibleItemCount(final int arg0) {
        return c -> c.setVisibleItemCount(arg0);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> width(final String arg0) {
        return c -> c.setWidth(arg0);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> width(final float arg0, final Sizeable.Unit arg1) {
        return c -> c.setWidth(arg0, arg1);
    }

    public static <T extends Sizeable & Component> PropertyNode<T> widthUndefined() {
        return c -> c.setWidthUndefined();
    }

    public static <T extends Window> PropertyNode<T> windowMode(final WindowMode arg0) {
        return c -> c.setWindowMode(arg0);
    }

    public static <T extends TextArea> PropertyNode<T> wordWrap(final boolean arg0) {
        return c -> c.setWordWrap(arg0);
    }

    public static <T extends AbstractDateField> PropertyNode<T> zoneId(final ZoneId arg0) {
        return c -> c.setZoneId(arg0);
    }
}

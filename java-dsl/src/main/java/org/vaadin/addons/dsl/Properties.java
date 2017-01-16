package org.vaadin.addons.dsl;

import com.vaadin.data.Buffered;
import com.vaadin.data.BufferedValidatable;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.Validatable;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroupFieldFactory;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.server.ClientConnector;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Scrollable;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.grid.ColumnResizeMode;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.shared.ui.table.CollapseMenuContent;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.shared.ui.window.WindowRole;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractEmbedded;
import com.vaadin.ui.AbstractField;
import com.vaadin.ui.AbstractMedia;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Field;
import com.vaadin.ui.Flash;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HasChildMeasurementHint;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Link;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
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
import com.vaadin.ui.components.calendar.CalendarComponentEvents;
import com.vaadin.ui.components.calendar.event.CalendarEventProvider;
import java.lang.Class;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.vaadin.addons.dsl.core.PropertyNode;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Properties {
  private Properties() {
  }

  public static <T extends AbstractMedia> PropertyNode<T> altText(final String arg0) {
    return c -> c.setAltText(arg0);
  }

  public static <T extends AbstractEmbedded> PropertyNode<T> alternateText(final String arg0) {
    return c -> c.setAlternateText(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> animationsEnabled(final boolean arg0) {
    return c -> c.setAnimationsEnabled(arg0);
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

  public static <T extends PopupDateField> PropertyNode<T> assistiveText(final String arg0) {
    return c -> c.setAssistiveText(arg0);
  }

  public static <T extends MenuBar> PropertyNode<T> autoOpen(final boolean arg0) {
    return c -> c.setAutoOpen(arg0);
  }

  public static <T extends AbstractMedia> PropertyNode<T> autoplay(final boolean arg0) {
    return c -> c.setAutoplay(arg0);
  }

  public static <T extends Buffered & Component> PropertyNode<T> buffered(final boolean arg0) {
    return c -> c.setBuffered(arg0);
  }

  public static <T extends Upload> PropertyNode<T> buttonCaption(final String arg0) {
    return c -> c.setButtonCaption(arg0);
  }

  public static <T extends Table> PropertyNode<T> cacheRate(final double arg0) {
    return c -> c.setCacheRate(arg0);
  }

  public static <T extends Component> PropertyNode<T> caption(final String arg0) {
    return c -> c.setCaption(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> captionAsHtml(final boolean arg0) {
    return c -> c.setCaptionAsHtml(arg0);
  }

  public static <T extends Grid> PropertyNode<T> cellDescriptionGenerator(final Grid.CellDescriptionGenerator arg0) {
    return c -> c.setCellDescriptionGenerator(arg0);
  }

  public static <T extends Grid> PropertyNode<T> cellStyleGenerator(final Grid.CellStyleGenerator arg0) {
    return c -> c.setCellStyleGenerator(arg0);
  }

  public static <T extends Table> PropertyNode<T> cellStyleGenerator(final Table.CellStyleGenerator arg0) {
    return c -> c.setCellStyleGenerator(arg0);
  }

  public static <T extends HasChildMeasurementHint> PropertyNode<T> childMeasurementHint(final HasChildMeasurementHint.ChildMeasurementHint arg0) {
    return c -> c.setChildMeasurementHint(arg0);
  }

  public static <T extends Container.Hierarchical & Component> PropertyNode<T> childrenAllowed(final Object arg0,
      final boolean arg1) {
    return c -> c.setChildrenAllowed(arg0, arg1);
  }

  public static <T extends Embedded> PropertyNode<T> classId(final String arg0) {
    return c -> c.setClassId(arg0);
  }

  public static <T extends Button> PropertyNode<T> clickShortcut(final int arg0,
      final int... arg1) {
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

  public static <T extends Table> PropertyNode<T> collapseMenuContent(final CollapseMenuContent arg0) {
    return c -> c.setCollapseMenuContent(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> collapsed(final Object arg0,
      final boolean arg1) {
    return c -> c.setCollapsed(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnAlignment(final Object arg0,
      final Table.Align arg1) {
    return c -> c.setColumnAlignment(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnAlignments(final Table.Align... arg0) {
    return c -> c.setColumnAlignments(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnCollapsed(final Object arg0,
      final boolean arg1) {
    return c -> c.setColumnCollapsed(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnCollapsible(final Object arg0,
      final boolean arg1) {
    return c -> c.setColumnCollapsible(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnCollapsingAllowed(final boolean arg0) {
    return c -> c.setColumnCollapsingAllowed(arg0);
  }

  public static <T extends GridLayout> PropertyNode<T> columnExpandRatio(final int arg0,
      final float arg1) {
    return c -> c.setColumnExpandRatio(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnExpandRatio(final Object arg0,
      final float arg1) {
    return c -> c.setColumnExpandRatio(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnFooter(final Object arg0,
      final String arg1) {
    return c -> c.setColumnFooter(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnHeader(final Object arg0,
      final String arg1) {
    return c -> c.setColumnHeader(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnHeaderMode(final Table.ColumnHeaderMode arg0) {
    return c -> c.setColumnHeaderMode(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnHeaders(final String... arg0) {
    return c -> c.setColumnHeaders(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnIcon(final Object arg0,
      final Resource arg1) {
    return c -> c.setColumnIcon(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnIcons(final Resource... arg0) {
    return c -> c.setColumnIcons(arg0);
  }

  public static <T extends Grid> PropertyNode<T> columnOrder(final Object... arg0) {
    return c -> c.setColumnOrder(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnReorderingAllowed(final boolean arg0) {
    return c -> c.setColumnReorderingAllowed(arg0);
  }

  public static <T extends Grid> PropertyNode<T> columnResizeMode(final ColumnResizeMode arg0) {
    return c -> c.setColumnResizeMode(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnWidth(final Object arg0, final int arg1) {
    return c -> c.setColumnWidth(arg0, arg1);
  }

  public static <T extends Grid> PropertyNode<T> columns(final Object... arg0) {
    return c -> c.setColumns(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> columns(final int arg0) {
    return c -> c.setColumns(arg0);
  }

  public static <T extends Layout.AlignmentHandler & Component> PropertyNode<T> componentAlignment(final Component arg0,
      final Alignment arg1) {
    return c -> c.setComponentAlignment(arg0, arg1);
  }

  public static <T extends AbstractComponent> PropertyNode<T> componentError(final ErrorMessage arg0) {
    return c -> c.setComponentError(arg0);
  }

  public static <T extends Container.Viewer & Component> PropertyNode<T> containerDataSource(final Container arg0) {
    return c -> c.setContainerDataSource(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> containerDataSource(final Container.Indexed arg0) {
    return c -> c.setContainerDataSource(arg0);
  }

  public static <T extends Table> PropertyNode<T> containerDataSource(final Container arg0,
      final Collection arg1) {
    return c -> c.setContainerDataSource(arg0, arg1);
  }

  public static <T extends Calendar> PropertyNode<T> containerDataSource(final Container.Indexed arg0,
      final Object arg1, final Object arg2, final Object arg3, final Object arg4,
      final Object arg5) {
    return c -> c.setContainerDataSource(arg0, arg1, arg2, arg3, arg4, arg5);
  }

  public static <T extends SingleComponentContainer> PropertyNode<T> content(final Component arg0) {
    return c -> c.setContent(arg0);
  }

  public static <T extends PopupView> PropertyNode<T> content(final PopupView.Content arg0) {
    return c -> c.setContent(arg0);
  }

  public static <T extends Label> PropertyNode<T> contentMode(final ContentMode arg0) {
    return c -> c.setContentMode(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> conversionError(final String arg0) {
    return c -> c.setConversionError(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> convertedValue(final Object arg0) {
    return c -> c.setConvertedValue(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> converter(final Converter arg0) {
    return c -> c.setConverter(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> converter(final Class arg0) {
    return c -> c.setConverter(arg0);
  }

  public static <T extends Table> PropertyNode<T> converter(final Object arg0,
      final Converter arg1) {
    return c -> c.setConverter(arg0, arg1);
  }

  public static <T extends AbstractField> PropertyNode<T> currentBufferedSourceException(final Buffered.SourceException arg0) {
    return c -> c.setCurrentBufferedSourceException(arg0);
  }

  public static <T extends Table> PropertyNode<T> currentPageFirstItemId(final Object arg0) {
    return c -> c.setCurrentPageFirstItemId(arg0);
  }

  public static <T extends Table> PropertyNode<T> currentPageFirstItemIndex(final int arg0) {
    return c -> c.setCurrentPageFirstItemIndex(arg0);
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

  public static <T extends DateField> PropertyNode<T> dateFormat(final String arg0) {
    return c -> c.setDateFormat(arg0);
  }

  public static <T extends DateField> PropertyNode<T> dateOutOfRangeMessage(final String arg0) {
    return c -> c.setDateOutOfRangeMessage(arg0);
  }

  public static <T extends Layout.AlignmentHandler & Component> PropertyNode<T> defaultComponentAlignment(final Alignment arg0) {
    return c -> c.setDefaultComponentAlignment(arg0);
  }

  public static <T extends Grid> PropertyNode<T> defaultHeaderRow(final Grid.HeaderRow arg0) {
    return c -> c.setDefaultHeaderRow(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> description(final String arg0) {
    return c -> c.setDescription(arg0);
  }

  public static <T extends Grid> PropertyNode<T> detailsGenerator(final Grid.DetailsGenerator arg0) {
    return c -> c.setDetailsGenerator(arg0);
  }

  public static <T extends Grid> PropertyNode<T> detailsVisible(final Object arg0,
      final boolean arg1) {
    return c -> c.setDetailsVisible(arg0, arg1);
  }

  public static <T extends Button> PropertyNode<T> disableOnClick(final boolean arg0) {
    return c -> c.setDisableOnClick(arg0);
  }

  public static <T extends Table> PropertyNode<T> dragMode(final Table.TableDragMode arg0) {
    return c -> c.setDragMode(arg0);
  }

  public static <T extends Tree> PropertyNode<T> dragMode(final Tree.TreeDragMode arg0) {
    return c -> c.setDragMode(arg0);
  }

  public static <T extends Window> PropertyNode<T> draggable(final boolean arg0) {
    return c -> c.setDraggable(arg0);
  }

  public static <T extends Table> PropertyNode<T> dropHandler(final DropHandler arg0) {
    return c -> c.setDropHandler(arg0);
  }

  public static <T extends Table> PropertyNode<T> editable(final boolean arg0) {
    return c -> c.setEditable(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorBuffered(final boolean arg0) {
    return c -> c.setEditorBuffered(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorCancelCaption(final String arg0) {
    return c -> c.setEditorCancelCaption(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorEnabled(final boolean arg0) {
    return c -> c.setEditorEnabled(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorErrorHandler(final Grid.EditorErrorHandler arg0) {
    return c -> c.setEditorErrorHandler(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorFieldFactory(final FieldGroupFieldFactory arg0) {
    return c -> c.setEditorFieldFactory(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorFieldGroup(final FieldGroup arg0) {
    return c -> c.setEditorFieldGroup(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorSaveCaption(final String arg0) {
    return c -> c.setEditorSaveCaption(arg0);
  }

  public static <T extends Component> PropertyNode<T> enabled(final boolean arg0) {
    return c -> c.setEnabled(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> endDate(final Date arg0) {
    return c -> c.setEndDate(arg0);
  }

  public static <T extends ClientConnector & Component> PropertyNode<T> errorHandler(final ErrorHandler arg0) {
    return c -> c.setErrorHandler(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> eventCaptionAsHtml(final boolean arg0) {
    return c -> c.setEventCaptionAsHtml(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> eventProvider(final CalendarEventProvider arg0) {
    return c -> c.setEventProvider(arg0);
  }

  public static <T extends AbstractOrderedLayout> PropertyNode<T> expandRatio(final Component arg0,
      final float arg1) {
    return c -> c.setExpandRatio(arg0, arg1);
  }

  public static <T extends AbstractSelect.Filtering & Component> PropertyNode<T> filteringMode(final FilteringMode arg0) {
    return c -> c.setFilteringMode(arg0);
  }

  public static <T extends AbstractSplitPanel> PropertyNode<T> firstComponent(final Component arg0) {
    return c -> c.setFirstComponent(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> firstDayOfWeek(final Integer arg0) {
    return c -> c.setFirstDayOfWeek(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> firstVisibleDayOfWeek(final int arg0) {
    return c -> c.setFirstVisibleDayOfWeek(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> firstVisibleHourOfDay(final int arg0) {
    return c -> c.setFirstVisibleHourOfDay(arg0);
  }

  public static <T extends Table> PropertyNode<T> footerVisible(final boolean arg0) {
    return c -> c.setFooterVisible(arg0);
  }

  public static <T extends Grid> PropertyNode<T> frozenColumnCount(final int arg0) {
    return c -> c.setFrozenColumnCount(arg0);
  }

  public static <T extends CalendarComponentEvents.NavigationNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.BackwardHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.NavigationNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.DateClickHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.NavigationNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.EventClickHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.EventMoveNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.EventMoveHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.EventResizeNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.EventResizeHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.NavigationNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.ForwardHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.RangeSelectNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.RangeSelectHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends CalendarComponentEvents.NavigationNotifier & Component> PropertyNode<T> handler(final CalendarComponentEvents.WeekClickHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends Grid> PropertyNode<T> headerVisible(final boolean arg0) {
    return c -> c.setHeaderVisible(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> height(final String arg0) {
    return c -> c.setHeight(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> height(final float arg0,
      final Sizeable.Unit arg1) {
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

  public static <T extends TreeTable> PropertyNode<T> hierarchyColumn(final Object arg0) {
    return c -> c.setHierarchyColumn(arg0);
  }

  public static <T extends Tree> PropertyNode<T> htmlContentAllowed(final boolean arg0) {
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

  public static <T extends AbstractComponent> PropertyNode<T> immediate(final boolean arg0) {
    return c -> c.setImmediate(arg0);
  }

  public static <T extends ProgressBar> PropertyNode<T> indeterminate(final boolean arg0) {
    return c -> c.setIndeterminate(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> inputPrompt(final String arg0) {
    return c -> c.setInputPrompt(arg0);
  }

  public static <T extends Validatable & Component> PropertyNode<T> invalidAllowed(final boolean arg0) {
    return c -> c.setInvalidAllowed(arg0);
  }

  public static <T extends BufferedValidatable & Component> PropertyNode<T> invalidCommitted(final boolean arg0) {
    return c -> c.setInvalidCommitted(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemCaption(final Object arg0,
      final String arg1) {
    return c -> c.setItemCaption(arg0, arg1);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemCaptionMode(final AbstractSelect.ItemCaptionMode arg0) {
    return c -> c.setItemCaptionMode(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemCaptionPropertyId(final Object arg0) {
    return c -> c.setItemCaptionPropertyId(arg0);
  }

  public static <T extends Table> PropertyNode<T> itemDescriptionGenerator(final AbstractSelect.ItemDescriptionGenerator arg0) {
    return c -> c.setItemDescriptionGenerator(arg0);
  }

  public static <T extends OptionGroup> PropertyNode<T> itemEnabled(final Object arg0,
      final boolean arg1) {
    return c -> c.setItemEnabled(arg0, arg1);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemIcon(final Object arg0,
      final Resource arg1) {
    return c -> c.setItemIcon(arg0, arg1);
  }

  public static <T extends Tree> PropertyNode<T> itemIcon(final Object arg0, final Resource arg1,
      final String arg2) {
    return c -> c.setItemIcon(arg0, arg1, arg2);
  }

  public static <T extends Tree> PropertyNode<T> itemIconAlternateText(final Object arg0,
      final String arg1) {
    return c -> c.setItemIconAlternateText(arg0, arg1);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemIconPropertyId(final Object arg0) {
    return c -> c.setItemIconPropertyId(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> itemStyleGenerator(final ComboBox.ItemStyleGenerator arg0) {
    return c -> c.setItemStyleGenerator(arg0);
  }

  public static <T extends Tree> PropertyNode<T> itemStyleGenerator(final Tree.ItemStyleGenerator arg0) {
    return c -> c.setItemStyleGenerator(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> lastVisibleDayOfWeek(final int arg0) {
    return c -> c.setLastVisibleDayOfWeek(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> lastVisibleHourOfDay(final int arg0) {
    return c -> c.setLastVisibleHourOfDay(arg0);
  }

  public static <T extends TwinColSelect> PropertyNode<T> leftColumnCaption(final String arg0) {
    return c -> c.setLeftColumnCaption(arg0);
  }

  public static <T extends DateField> PropertyNode<T> lenient(final boolean arg0) {
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

  public static <T extends AbstractSplitPanel> PropertyNode<T> maxSplitPosition(final float arg0,
      final Sizeable.Unit arg1) {
    return c -> c.setMaxSplitPosition(arg0, arg1);
  }

  public static <T extends Embedded> PropertyNode<T> mimeType(final String arg0) {
    return c -> c.setMimeType(arg0);
  }

  public static <T extends Slider> PropertyNode<T> min(final double arg0) {
    return c -> c.setMin(arg0);
  }

  public static <T extends AbstractSplitPanel> PropertyNode<T> minSplitPosition(final float arg0,
      final Sizeable.Unit arg1) {
    return c -> c.setMinSplitPosition(arg0, arg1);
  }

  public static <T extends Window> PropertyNode<T> modal(final boolean arg0) {
    return c -> c.setModal(arg0);
  }

  public static <T extends MenuBar> PropertyNode<T> moreMenuItem(final MenuBar.MenuItem arg0) {
    return c -> c.setMoreMenuItem(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> multiSelect(final boolean arg0) {
    return c -> c.setMultiSelect(arg0);
  }

  public static <T extends Table> PropertyNode<T> multiSelectMode(final MultiSelectMode arg0) {
    return c -> c.setMultiSelectMode(arg0);
  }

  public static <T extends Tree> PropertyNode<T> multiselectMode(final MultiSelectMode arg0) {
    return c -> c.setMultiselectMode(arg0);
  }

  public static <T extends AbstractMedia> PropertyNode<T> muted(final boolean arg0) {
    return c -> c.setMuted(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> newItemHandler(final AbstractSelect.NewItemHandler arg0) {
    return c -> c.setNewItemHandler(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> newItemsAllowed(final boolean arg0) {
    return c -> c.setNewItemsAllowed(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> nullRepresentation(final String arg0) {
    return c -> c.setNullRepresentation(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> nullSelectionAllowed(final boolean arg0) {
    return c -> c.setNullSelectionAllowed(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> nullSelectionItemId(final Object arg0) {
    return c -> c.setNullSelectionItemId(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> nullSettingAllowed(final boolean arg0) {
    return c -> c.setNullSettingAllowed(arg0);
  }

  public static <T extends Slider> PropertyNode<T> orientation(final SliderOrientation arg0) {
    return c -> c.setOrientation(arg0);
  }

  public static <T extends Table> PropertyNode<T> pageLength(final int arg0) {
    return c -> c.setPageLength(arg0);
  }

  public static <T extends Flash> PropertyNode<T> parameter(final String arg0, final String arg1) {
    return c -> c.setParameter(arg0, arg1);
  }

  public static <T extends Component> PropertyNode<T> parent(final HasComponents arg0) {
    return c -> c.setParent(arg0);
  }

  public static <T extends Container.Hierarchical & Component> PropertyNode<T> parent(final Object arg0,
      final Object arg1) {
    return c -> c.setParent(arg0, arg1);
  }

  public static <T extends DateField> PropertyNode<T> parseErrorMessage(final String arg0) {
    return c -> c.setParseErrorMessage(arg0);
  }

  public static <T extends LoginForm> PropertyNode<T> passwordCaption(final String arg0) {
    return c -> c.setPasswordCaption(arg0);
  }

  public static <T extends PopupView> PropertyNode<T> popupVisible(final boolean arg0) {
    return c -> c.setPopupVisible(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> popupWidth(final String arg0) {
    return c -> c.setPopupWidth(arg0);
  }

  public static <T extends AbsoluteLayout> PropertyNode<T> position(final Component arg0,
      final AbsoluteLayout.ComponentPosition arg1) {
    return c -> c.setPosition(arg0, arg1);
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

  public static <T extends Component> PropertyNode<T> primaryStyleName(final String arg0) {
    return c -> c.setPrimaryStyleName(arg0);
  }

  public static <T extends Property.Viewer & Component> PropertyNode<T> propertyDataSource(final Property arg0) {
    return c -> c.setPropertyDataSource(arg0);
  }

  public static <T extends DateField> PropertyNode<T> rangeEnd(final Date arg0) {
    return c -> c.setRangeEnd(arg0);
  }

  public static <T extends DateField> PropertyNode<T> rangeStart(final Date arg0) {
    return c -> c.setRangeStart(arg0);
  }

  public static <T extends Component> PropertyNode<T> readOnly(final boolean arg0) {
    return c -> c.setReadOnly(arg0);
  }

  public static <T extends Upload> PropertyNode<T> receiver(final Upload.Receiver arg0) {
    return c -> c.setReceiver(arg0);
  }

  public static <T extends Field> PropertyNode<T> required(final boolean arg0) {
    return c -> c.setRequired(arg0);
  }

  public static <T extends Field> PropertyNode<T> requiredError(final String arg0) {
    return c -> c.setRequiredError(arg0);
  }

  public static <T extends Window> PropertyNode<T> resizable(final boolean arg0) {
    return c -> c.setResizable(arg0);
  }

  public static <T extends Window> PropertyNode<T> resizeLazy(final boolean arg0) {
    return c -> c.setResizeLazy(arg0);
  }

  public static <T extends DateField> PropertyNode<T> resolution(final Resolution arg0) {
    return c -> c.setResolution(arg0);
  }

  public static <T extends Slider> PropertyNode<T> resolution(final int arg0) {
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

  public static <T extends Grid> PropertyNode<T> rowDescriptionGenerator(final Grid.RowDescriptionGenerator arg0) {
    return c -> c.setRowDescriptionGenerator(arg0);
  }

  public static <T extends GridLayout> PropertyNode<T> rowExpandRatio(final int arg0,
      final float arg1) {
    return c -> c.setRowExpandRatio(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> rowGenerator(final Table.RowGenerator arg0) {
    return c -> c.setRowGenerator(arg0);
  }

  public static <T extends Table> PropertyNode<T> rowHeaderMode(final Table.RowHeaderMode arg0) {
    return c -> c.setRowHeaderMode(arg0);
  }

  public static <T extends Grid> PropertyNode<T> rowStyleGenerator(final Grid.RowStyleGenerator arg0) {
    return c -> c.setRowStyleGenerator(arg0);
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

  public static <T extends Table> PropertyNode<T> selectable(final boolean arg0) {
    return c -> c.setSelectable(arg0);
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

  public static <T extends Grid> PropertyNode<T> selectionMode(final Grid.SelectionMode arg0) {
    return c -> c.setSelectionMode(arg0);
  }

  public static <T extends Grid> PropertyNode<T> selectionModel(final Grid.SelectionModel arg0) {
    return c -> c.setSelectionModel(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> selectionRange(final int arg0,
      final int arg1) {
    return c -> c.setSelectionRange(arg0, arg1);
  }

  public static <T extends AbstractMedia> PropertyNode<T> showControls(final boolean arg0) {
    return c -> c.setShowControls(arg0);
  }

  public static <T extends DateField> PropertyNode<T> showISOWeekNumbers(final boolean arg0) {
    return c -> c.setShowISOWeekNumbers(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> sizeFull() {
    return c -> c.setSizeFull();
  }

  public static <T extends Sizeable & Component> PropertyNode<T> sizeUndefined() {
    return c -> c.setSizeUndefined();
  }

  public static <T extends Table> PropertyNode<T> sortAscending(final boolean arg0) {
    return c -> c.setSortAscending(arg0);
  }

  public static <T extends Table> PropertyNode<T> sortContainerPropertyId(final Object arg0) {
    return c -> c.setSortContainerPropertyId(arg0);
  }

  public static <T extends Table> PropertyNode<T> sortEnabled(final boolean arg0) {
    return c -> c.setSortEnabled(arg0);
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

  public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0,
      final boolean arg1) {
    return c -> c.setSplitPosition(arg0, arg1);
  }

  public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0,
      final Sizeable.Unit arg1) {
    return c -> c.setSplitPosition(arg0, arg1);
  }

  public static <T extends AbstractSplitPanel> PropertyNode<T> splitPosition(final float arg0,
      final Sizeable.Unit arg1, final boolean arg2) {
    return c -> c.setSplitPosition(arg0, arg1, arg2);
  }

  public static <T extends Flash> PropertyNode<T> standby(final String arg0) {
    return c -> c.setStandby(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> startDate(final Date arg0) {
    return c -> c.setStartDate(arg0);
  }

  public static <T extends Component> PropertyNode<T> styleName(final String arg0) {
    return c -> c.setStyleName(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> styleName(final String arg0,
      final boolean arg1) {
    return c -> c.setStyleName(arg0, arg1);
  }

  public static <T extends TabSheet> PropertyNode<T> tabCaptionsAsHtml(final boolean arg0) {
    return c -> c.setTabCaptionsAsHtml(arg0);
  }

  public static <T extends Component.Focusable> PropertyNode<T> tabIndex(final int arg0) {
    return c -> c.setTabIndex(arg0);
  }

  public static <T extends TabSheet> PropertyNode<T> tabPosition(final TabSheet.Tab arg0,
      final int arg1) {
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

  public static <T extends Table> PropertyNode<T> tableFieldFactory(final TableFieldFactory arg0) {
    return c -> c.setTableFieldFactory(arg0);
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

  public static <T extends AbstractTextField> PropertyNode<T> textChangeEventMode(final AbstractTextField.TextChangeEventMode arg0) {
    return c -> c.setTextChangeEventMode(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> textChangeTimeout(final int arg0) {
    return c -> c.setTextChangeTimeout(arg0);
  }

  public static <T extends PopupDateField> PropertyNode<T> textFieldEnabled(final boolean arg0) {
    return c -> c.setTextFieldEnabled(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> textInputAllowed(final boolean arg0) {
    return c -> c.setTextInputAllowed(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> timeFormat(final Calendar.TimeFormat arg0) {
    return c -> c.setTimeFormat(arg0);
  }

  public static <T extends DateField> PropertyNode<T> timeZone(final TimeZone arg0) {
    return c -> c.setTimeZone(arg0);
  }

  public static <T extends Embedded> PropertyNode<T> type(final int arg0) {
    return c -> c.setType(arg0);
  }

  public static <T extends LoginForm> PropertyNode<T> usernameCaption(final String arg0) {
    return c -> c.setUsernameCaption(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> validationVisible(final boolean arg0) {
    return c -> c.setValidationVisible(arg0);
  }

  public static <T extends Slider> PropertyNode<T> value(final Double arg0) {
    return c -> c.setValue(arg0);
  }

  public static <T extends ProgressBar> PropertyNode<T> value(final Float arg0) {
    return c -> c.setValue(arg0);
  }

  public static <T extends Property & Component> PropertyNode<T> value(final Object arg0) {
    return c -> c.setValue(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> value(final String arg0) {
    return c -> c.setValue(arg0);
  }

  public static <T extends Component> PropertyNode<T> visible(final boolean arg0) {
    return c -> c.setVisible(arg0);
  }

  public static <T extends Table> PropertyNode<T> visibleColumns(final Object... arg0) {
    return c -> c.setVisibleColumns(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> weeklyCaptionFormat(final String arg0) {
    return c -> c.setWeeklyCaptionFormat(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> width(final String arg0) {
    return c -> c.setWidth(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> width(final float arg0,
      final Sizeable.Unit arg1) {
    return c -> c.setWidth(arg0, arg1);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> widthUndefined() {
    return c -> c.setWidthUndefined();
  }

  public static <T extends Window> PropertyNode<T> windowMode(final WindowMode arg0) {
    return c -> c.setWindowMode(arg0);
  }

  public static <T extends TextArea> PropertyNode<T> wordwrap(final boolean arg0) {
    return c -> c.setWordwrap(arg0);
  }
}

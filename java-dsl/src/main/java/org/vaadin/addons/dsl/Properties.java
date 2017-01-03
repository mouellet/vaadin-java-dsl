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
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.grid.ColumnResizeMode;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.shared.ui.table.CollapseMenuContent;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractEmbedded;
import com.vaadin.ui.AbstractField;
import com.vaadin.ui.AbstractMedia;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.Button;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Field;
import com.vaadin.ui.Flash;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HasChildMeasurementHint;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.Slider;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Video;
import com.vaadin.ui.components.calendar.CalendarComponentEvents;
import com.vaadin.ui.components.calendar.event.CalendarEventProvider;
import java.lang.Class;
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

  public static <T extends AbstractMedia> PropertyNode<T> altText(String arg0) {
    return c -> c.setAltText(arg0);
  }

  public static <T extends AbstractEmbedded> PropertyNode<T> alternateText(String arg0) {
    return c -> c.setAlternateText(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> animationsEnabled(boolean arg0) {
    return c -> c.setAnimationsEnabled(arg0);
  }

  public static <T extends Flash> PropertyNode<T> archive(String arg0) {
    return c -> c.setArchive(arg0);
  }

  public static <T extends PopupDateField> PropertyNode<T> assistiveText(String arg0) {
    return c -> c.setAssistiveText(arg0);
  }

  public static <T extends MenuBar> PropertyNode<T> autoOpen(boolean arg0) {
    return c -> c.setAutoOpen(arg0);
  }

  public static <T extends AbstractMedia> PropertyNode<T> autoplay(boolean arg0) {
    return c -> c.setAutoplay(arg0);
  }

  public static <T extends Buffered & Component> PropertyNode<T> buffered(boolean arg0) {
    return c -> c.setBuffered(arg0);
  }

  public static <T extends Upload> PropertyNode<T> buttonCaption(String arg0) {
    return c -> c.setButtonCaption(arg0);
  }

  public static <T extends Table> PropertyNode<T> cacheRate(double arg0) {
    return c -> c.setCacheRate(arg0);
  }

  public static <T extends Component> PropertyNode<T> caption(String arg0) {
    return c -> c.setCaption(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> captionAsHtml(boolean arg0) {
    return c -> c.setCaptionAsHtml(arg0);
  }

  public static <T extends Grid> PropertyNode<T> cellDescriptionGenerator(Grid.CellDescriptionGenerator arg0) {
    return c -> c.setCellDescriptionGenerator(arg0);
  }

  public static <T extends Table> PropertyNode<T> cellStyleGenerator(Table.CellStyleGenerator arg0) {
    return c -> c.setCellStyleGenerator(arg0);
  }

  public static <T extends HasChildMeasurementHint> PropertyNode<T> childMeasurementHint(HasChildMeasurementHint.ChildMeasurementHint arg0) {
    return c -> c.setChildMeasurementHint(arg0);
  }

  public static <T extends Container.Hierarchical & Component> PropertyNode<T> childrenAllowed(Object arg0,
      boolean arg1) {
    return c -> c.setChildrenAllowed(arg0, arg1);
  }

  public static <T extends Embedded> PropertyNode<T> classId(String arg0) {
    return c -> c.setClassId(arg0);
  }

  public static <T extends Button> PropertyNode<T> clickShortcut(int arg0, int... arg1) {
    return c -> c.setClickShortcut(arg0, arg1);
  }

  public static <T extends Flash> PropertyNode<T> codebase(String arg0) {
    return c -> c.setCodebase(arg0);
  }

  public static <T extends Flash> PropertyNode<T> codetype(String arg0) {
    return c -> c.setCodetype(arg0);
  }

  public static <T extends Table> PropertyNode<T> collapseMenuContent(CollapseMenuContent arg0) {
    return c -> c.setCollapseMenuContent(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> collapsed(Object arg0, boolean arg1) {
    return c -> c.setCollapsed(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnAlignment(Object arg0, Table.Align arg1) {
    return c -> c.setColumnAlignment(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnAlignments(Table.Align... arg0) {
    return c -> c.setColumnAlignments(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnCollapsed(Object arg0, boolean arg1) {
    return c -> c.setColumnCollapsed(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnCollapsible(Object arg0, boolean arg1) {
    return c -> c.setColumnCollapsible(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnCollapsingAllowed(boolean arg0) {
    return c -> c.setColumnCollapsingAllowed(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnExpandRatio(Object arg0, float arg1) {
    return c -> c.setColumnExpandRatio(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnFooter(Object arg0, String arg1) {
    return c -> c.setColumnFooter(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnHeader(Object arg0, String arg1) {
    return c -> c.setColumnHeader(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnHeaderMode(Table.ColumnHeaderMode arg0) {
    return c -> c.setColumnHeaderMode(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnHeaders(String... arg0) {
    return c -> c.setColumnHeaders(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnIcon(Object arg0, Resource arg1) {
    return c -> c.setColumnIcon(arg0, arg1);
  }

  public static <T extends Table> PropertyNode<T> columnIcons(Resource... arg0) {
    return c -> c.setColumnIcons(arg0);
  }

  public static <T extends Grid> PropertyNode<T> columnOrder(Object... arg0) {
    return c -> c.setColumnOrder(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnReorderingAllowed(boolean arg0) {
    return c -> c.setColumnReorderingAllowed(arg0);
  }

  public static <T extends Grid> PropertyNode<T> columnResizeMode(ColumnResizeMode arg0) {
    return c -> c.setColumnResizeMode(arg0);
  }

  public static <T extends Table> PropertyNode<T> columnWidth(Object arg0, int arg1) {
    return c -> c.setColumnWidth(arg0, arg1);
  }

  public static <T extends AbstractTextField> PropertyNode<T> columns(int arg0) {
    return c -> c.setColumns(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> componentError(ErrorMessage arg0) {
    return c -> c.setComponentError(arg0);
  }

  public static <T extends Container.Viewer & Component> PropertyNode<T> containerDataSource(Container arg0) {
    return c -> c.setContainerDataSource(arg0);
  }

  public static <T extends Table> PropertyNode<T> containerDataSource(Container arg0,
      Collection arg1) {
    return c -> c.setContainerDataSource(arg0, arg1);
  }

  public static <T extends Calendar> PropertyNode<T> containerDataSource(Container.Indexed arg0,
      Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
    return c -> c.setContainerDataSource(arg0, arg1, arg2, arg3, arg4, arg5);
  }

  public static <T extends PopupView> PropertyNode<T> content(PopupView.Content arg0) {
    return c -> c.setContent(arg0);
  }

  public static <T extends Label> PropertyNode<T> contentMode(ContentMode arg0) {
    return c -> c.setContentMode(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> conversionError(String arg0) {
    return c -> c.setConversionError(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> convertedValue(Object arg0) {
    return c -> c.setConvertedValue(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> converter(Class arg0) {
    return c -> c.setConverter(arg0);
  }

  public static <T extends Table> PropertyNode<T> converter(Object arg0, Converter arg1) {
    return c -> c.setConverter(arg0, arg1);
  }

  public static <T extends AbstractField> PropertyNode<T> currentBufferedSourceException(Buffered.SourceException arg0) {
    return c -> c.setCurrentBufferedSourceException(arg0);
  }

  public static <T extends Table> PropertyNode<T> currentPageFirstItemId(Object arg0) {
    return c -> c.setCurrentPageFirstItemId(arg0);
  }

  public static <T extends Table> PropertyNode<T> currentPageFirstItemIndex(int arg0) {
    return c -> c.setCurrentPageFirstItemIndex(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> cursorPosition(int arg0) {
    return c -> c.setCursorPosition(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> data(Object arg0) {
    return c -> c.setData(arg0);
  }

  public static <T extends DateField> PropertyNode<T> dateFormat(String arg0) {
    return c -> c.setDateFormat(arg0);
  }

  public static <T extends DateField> PropertyNode<T> dateOutOfRangeMessage(String arg0) {
    return c -> c.setDateOutOfRangeMessage(arg0);
  }

  public static <T extends Grid> PropertyNode<T> defaultHeaderRow(Grid.HeaderRow arg0) {
    return c -> c.setDefaultHeaderRow(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> description(String arg0) {
    return c -> c.setDescription(arg0);
  }

  public static <T extends Grid> PropertyNode<T> detailsGenerator(Grid.DetailsGenerator arg0) {
    return c -> c.setDetailsGenerator(arg0);
  }

  public static <T extends Grid> PropertyNode<T> detailsVisible(Object arg0, boolean arg1) {
    return c -> c.setDetailsVisible(arg0, arg1);
  }

  public static <T extends Button> PropertyNode<T> disableOnClick(boolean arg0) {
    return c -> c.setDisableOnClick(arg0);
  }

  public static <T extends Table> PropertyNode<T> dragMode(Table.TableDragMode arg0) {
    return c -> c.setDragMode(arg0);
  }

  public static <T extends Table> PropertyNode<T> dropHandler(DropHandler arg0) {
    return c -> c.setDropHandler(arg0);
  }

  public static <T extends Table> PropertyNode<T> editable(boolean arg0) {
    return c -> c.setEditable(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorBuffered(boolean arg0) {
    return c -> c.setEditorBuffered(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorCancelCaption(String arg0) {
    return c -> c.setEditorCancelCaption(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorEnabled(boolean arg0) {
    return c -> c.setEditorEnabled(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorErrorHandler(Grid.EditorErrorHandler arg0) {
    return c -> c.setEditorErrorHandler(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorFieldFactory(FieldGroupFieldFactory arg0) {
    return c -> c.setEditorFieldFactory(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorFieldGroup(FieldGroup arg0) {
    return c -> c.setEditorFieldGroup(arg0);
  }

  public static <T extends Grid> PropertyNode<T> editorSaveCaption(String arg0) {
    return c -> c.setEditorSaveCaption(arg0);
  }

  public static <T extends Component> PropertyNode<T> enabled(boolean arg0) {
    return c -> c.setEnabled(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> endDate(Date arg0) {
    return c -> c.setEndDate(arg0);
  }

  public static <T extends ClientConnector & Component> PropertyNode<T> errorHandler(ErrorHandler arg0) {
    return c -> c.setErrorHandler(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> eventCaptionAsHtml(boolean arg0) {
    return c -> c.setEventCaptionAsHtml(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> eventProvider(CalendarEventProvider arg0) {
    return c -> c.setEventProvider(arg0);
  }

  public static <T extends AbstractSelect.Filtering & Component> PropertyNode<T> filteringMode(FilteringMode arg0) {
    return c -> c.setFilteringMode(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> firstDayOfWeek(Integer arg0) {
    return c -> c.setFirstDayOfWeek(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> firstVisibleDayOfWeek(int arg0) {
    return c -> c.setFirstVisibleDayOfWeek(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> firstVisibleHourOfDay(int arg0) {
    return c -> c.setFirstVisibleHourOfDay(arg0);
  }

  public static <T extends Table> PropertyNode<T> footerVisible(boolean arg0) {
    return c -> c.setFooterVisible(arg0);
  }

  public static <T extends Grid> PropertyNode<T> frozenColumnCount(int arg0) {
    return c -> c.setFrozenColumnCount(arg0);
  }

  public static <T extends CalendarComponentEvents.EventResizeNotifier & Component> PropertyNode<T> handler(CalendarComponentEvents.EventResizeHandler arg0) {
    return c -> c.setHandler(arg0);
  }

  public static <T extends Grid> PropertyNode<T> headerVisible(boolean arg0) {
    return c -> c.setHeaderVisible(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> height(String arg0) {
    return c -> c.setHeight(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> height(float arg0,
      Sizeable.Unit arg1) {
    return c -> c.setHeight(arg0, arg1);
  }

  public static <T extends Grid> PropertyNode<T> heightByRows(double arg0) {
    return c -> c.setHeightByRows(arg0);
  }

  public static <T extends Grid> PropertyNode<T> heightMode(HeightMode arg0) {
    return c -> c.setHeightMode(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> heightUndefined() {
    return c -> c.setHeightUndefined();
  }

  public static <T extends PopupView> PropertyNode<T> hideOnMouseOut(boolean arg0) {
    return c -> c.setHideOnMouseOut(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> hierarchyColumn(Object arg0) {
    return c -> c.setHierarchyColumn(arg0);
  }

  public static <T extends Button> PropertyNode<T> htmlContentAllowed(boolean arg0) {
    return c -> c.setHtmlContentAllowed(arg0);
  }

  public static <T extends Component> PropertyNode<T> icon(Resource arg0) {
    return c -> c.setIcon(arg0);
  }

  public static <T extends Button> PropertyNode<T> icon(Resource arg0, String arg1) {
    return c -> c.setIcon(arg0, arg1);
  }

  public static <T extends Button> PropertyNode<T> iconAlternateText(String arg0) {
    return c -> c.setIconAlternateText(arg0);
  }

  public static <T extends Component> PropertyNode<T> id(String arg0) {
    return c -> c.setId(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> immediate(boolean arg0) {
    return c -> c.setImmediate(arg0);
  }

  public static <T extends ProgressBar> PropertyNode<T> indeterminate(boolean arg0) {
    return c -> c.setIndeterminate(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> inputPrompt(String arg0) {
    return c -> c.setInputPrompt(arg0);
  }

  public static <T extends Validatable & Component> PropertyNode<T> invalidAllowed(boolean arg0) {
    return c -> c.setInvalidAllowed(arg0);
  }

  public static <T extends BufferedValidatable & Component> PropertyNode<T> invalidCommitted(boolean arg0) {
    return c -> c.setInvalidCommitted(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemCaption(Object arg0, String arg1) {
    return c -> c.setItemCaption(arg0, arg1);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemCaptionMode(AbstractSelect.ItemCaptionMode arg0) {
    return c -> c.setItemCaptionMode(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemCaptionPropertyId(Object arg0) {
    return c -> c.setItemCaptionPropertyId(arg0);
  }

  public static <T extends Table> PropertyNode<T> itemDescriptionGenerator(AbstractSelect.ItemDescriptionGenerator arg0) {
    return c -> c.setItemDescriptionGenerator(arg0);
  }

  public static <T extends OptionGroup> PropertyNode<T> itemEnabled(Object arg0, boolean arg1) {
    return c -> c.setItemEnabled(arg0, arg1);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemIcon(Object arg0, Resource arg1) {
    return c -> c.setItemIcon(arg0, arg1);
  }

  public static <T extends Tree> PropertyNode<T> itemIcon(Object arg0, Resource arg1, String arg2) {
    return c -> c.setItemIcon(arg0, arg1, arg2);
  }

  public static <T extends Tree> PropertyNode<T> itemIconAlternateText(Object arg0, String arg1) {
    return c -> c.setItemIconAlternateText(arg0, arg1);
  }

  public static <T extends AbstractSelect> PropertyNode<T> itemIconPropertyId(Object arg0) {
    return c -> c.setItemIconPropertyId(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> itemStyleGenerator(ComboBox.ItemStyleGenerator arg0) {
    return c -> c.setItemStyleGenerator(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> lastVisibleDayOfWeek(int arg0) {
    return c -> c.setLastVisibleDayOfWeek(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> lastVisibleHourOfDay(int arg0) {
    return c -> c.setLastVisibleHourOfDay(arg0);
  }

  public static <T extends TwinColSelect> PropertyNode<T> leftColumnCaption(String arg0) {
    return c -> c.setLeftColumnCaption(arg0);
  }

  public static <T extends DateField> PropertyNode<T> lenient(boolean arg0) {
    return c -> c.setLenient(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> locale(Locale arg0) {
    return c -> c.setLocale(arg0);
  }

  public static <T extends Slider> PropertyNode<T> max(double arg0) {
    return c -> c.setMax(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> maxLength(int arg0) {
    return c -> c.setMaxLength(arg0);
  }

  public static <T extends Embedded> PropertyNode<T> mimeType(String arg0) {
    return c -> c.setMimeType(arg0);
  }

  public static <T extends Slider> PropertyNode<T> min(double arg0) {
    return c -> c.setMin(arg0);
  }

  public static <T extends MenuBar> PropertyNode<T> moreMenuItem(MenuBar.MenuItem arg0) {
    return c -> c.setMoreMenuItem(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> multiSelect(boolean arg0) {
    return c -> c.setMultiSelect(arg0);
  }

  public static <T extends Table> PropertyNode<T> multiSelectMode(MultiSelectMode arg0) {
    return c -> c.setMultiSelectMode(arg0);
  }

  public static <T extends Tree> PropertyNode<T> multiselectMode(MultiSelectMode arg0) {
    return c -> c.setMultiselectMode(arg0);
  }

  public static <T extends AbstractMedia> PropertyNode<T> muted(boolean arg0) {
    return c -> c.setMuted(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> newItemHandler(AbstractSelect.NewItemHandler arg0) {
    return c -> c.setNewItemHandler(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> newItemsAllowed(boolean arg0) {
    return c -> c.setNewItemsAllowed(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> nullRepresentation(String arg0) {
    return c -> c.setNullRepresentation(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> nullSelectionAllowed(boolean arg0) {
    return c -> c.setNullSelectionAllowed(arg0);
  }

  public static <T extends AbstractSelect> PropertyNode<T> nullSelectionItemId(Object arg0) {
    return c -> c.setNullSelectionItemId(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> nullSettingAllowed(boolean arg0) {
    return c -> c.setNullSettingAllowed(arg0);
  }

  public static <T extends Slider> PropertyNode<T> orientation(SliderOrientation arg0) {
    return c -> c.setOrientation(arg0);
  }

  public static <T extends Table> PropertyNode<T> pageLength(int arg0) {
    return c -> c.setPageLength(arg0);
  }

  public static <T extends Flash> PropertyNode<T> parameter(String arg0, String arg1) {
    return c -> c.setParameter(arg0, arg1);
  }

  public static <T extends Component> PropertyNode<T> parent(HasComponents arg0) {
    return c -> c.setParent(arg0);
  }

  public static <T extends Container.Hierarchical & Component> PropertyNode<T> parent(Object arg0,
      Object arg1) {
    return c -> c.setParent(arg0, arg1);
  }

  public static <T extends DateField> PropertyNode<T> parseErrorMessage(String arg0) {
    return c -> c.setParseErrorMessage(arg0);
  }

  public static <T extends PopupView> PropertyNode<T> popupVisible(boolean arg0) {
    return c -> c.setPopupVisible(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> popupWidth(String arg0) {
    return c -> c.setPopupWidth(arg0);
  }

  public static <T extends Video> PropertyNode<T> poster(Resource arg0) {
    return c -> c.setPoster(arg0);
  }

  public static <T extends Component> PropertyNode<T> primaryStyleName(String arg0) {
    return c -> c.setPrimaryStyleName(arg0);
  }

  public static <T extends Property.Viewer & Component> PropertyNode<T> propertyDataSource(Property arg0) {
    return c -> c.setPropertyDataSource(arg0);
  }

  public static <T extends DateField> PropertyNode<T> rangeEnd(Date arg0) {
    return c -> c.setRangeEnd(arg0);
  }

  public static <T extends DateField> PropertyNode<T> rangeStart(Date arg0) {
    return c -> c.setRangeStart(arg0);
  }

  public static <T extends Component> PropertyNode<T> readOnly(boolean arg0) {
    return c -> c.setReadOnly(arg0);
  }

  public static <T extends Upload> PropertyNode<T> receiver(Upload.Receiver arg0) {
    return c -> c.setReceiver(arg0);
  }

  public static <T extends Field> PropertyNode<T> required(boolean arg0) {
    return c -> c.setRequired(arg0);
  }

  public static <T extends Field> PropertyNode<T> requiredError(String arg0) {
    return c -> c.setRequiredError(arg0);
  }

  public static <T extends DateField> PropertyNode<T> resolution(Resolution arg0) {
    return c -> c.setResolution(arg0);
  }

  public static <T extends Link> PropertyNode<T> resource(Resource arg0) {
    return c -> c.setResource(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> responsive(boolean arg0) {
    return c -> c.setResponsive(arg0);
  }

  public static <T extends TwinColSelect> PropertyNode<T> rightColumnCaption(String arg0) {
    return c -> c.setRightColumnCaption(arg0);
  }

  public static <T extends Grid> PropertyNode<T> rowDescriptionGenerator(Grid.RowDescriptionGenerator arg0) {
    return c -> c.setRowDescriptionGenerator(arg0);
  }

  public static <T extends Table> PropertyNode<T> rowGenerator(Table.RowGenerator arg0) {
    return c -> c.setRowGenerator(arg0);
  }

  public static <T extends Table> PropertyNode<T> rowHeaderMode(Table.RowHeaderMode arg0) {
    return c -> c.setRowHeaderMode(arg0);
  }

  public static <T extends Grid> PropertyNode<T> rowStyleGenerator(Grid.RowStyleGenerator arg0) {
    return c -> c.setRowStyleGenerator(arg0);
  }

  public static <T extends ListSelect> PropertyNode<T> rows(int arg0) {
    return c -> c.setRows(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> scrollToSelectedItem(boolean arg0) {
    return c -> c.setScrollToSelectedItem(arg0);
  }

  public static <T extends Table> PropertyNode<T> selectable(boolean arg0) {
    return c -> c.setSelectable(arg0);
  }

  public static <T extends Grid> PropertyNode<T> selectionMode(Grid.SelectionMode arg0) {
    return c -> c.setSelectionMode(arg0);
  }

  public static <T extends Grid> PropertyNode<T> selectionModel(Grid.SelectionModel arg0) {
    return c -> c.setSelectionModel(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> selectionRange(int arg0, int arg1) {
    return c -> c.setSelectionRange(arg0, arg1);
  }

  public static <T extends AbstractMedia> PropertyNode<T> showControls(boolean arg0) {
    return c -> c.setShowControls(arg0);
  }

  public static <T extends DateField> PropertyNode<T> showISOWeekNumbers(boolean arg0) {
    return c -> c.setShowISOWeekNumbers(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> sizeFull() {
    return c -> c.setSizeFull();
  }

  public static <T extends Sizeable & Component> PropertyNode<T> sizeUndefined() {
    return c -> c.setSizeUndefined();
  }

  public static <T extends Table> PropertyNode<T> sortAscending(boolean arg0) {
    return c -> c.setSortAscending(arg0);
  }

  public static <T extends Table> PropertyNode<T> sortContainerPropertyId(Object arg0) {
    return c -> c.setSortContainerPropertyId(arg0);
  }

  public static <T extends Table> PropertyNode<T> sortEnabled(boolean arg0) {
    return c -> c.setSortEnabled(arg0);
  }

  public static <T extends Grid> PropertyNode<T> sortOrder(List arg0) {
    return c -> c.setSortOrder(arg0);
  }

  public static <T extends AbstractEmbedded> PropertyNode<T> source(Resource arg0) {
    return c -> c.setSource(arg0);
  }

  public static <T extends AbstractMedia> PropertyNode<T> sources(Resource... arg0) {
    return c -> c.setSources(arg0);
  }

  public static <T extends Flash> PropertyNode<T> standby(String arg0) {
    return c -> c.setStandby(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> startDate(Date arg0) {
    return c -> c.setStartDate(arg0);
  }

  public static <T extends Component> PropertyNode<T> styleName(String arg0) {
    return c -> c.setStyleName(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> styleName(String arg0, boolean arg1) {
    return c -> c.setStyleName(arg0, arg1);
  }

  public static <T extends Component.Focusable> PropertyNode<T> tabIndex(int arg0) {
    return c -> c.setTabIndex(arg0);
  }

  public static <T extends Table> PropertyNode<T> tableFieldFactory(TableFieldFactory arg0) {
    return c -> c.setTableFieldFactory(arg0);
  }

  public static <T extends Link> PropertyNode<T> targetBorder(BorderStyle arg0) {
    return c -> c.setTargetBorder(arg0);
  }

  public static <T extends Link> PropertyNode<T> targetHeight(int arg0) {
    return c -> c.setTargetHeight(arg0);
  }

  public static <T extends Link> PropertyNode<T> targetName(String arg0) {
    return c -> c.setTargetName(arg0);
  }

  public static <T extends Link> PropertyNode<T> targetWidth(int arg0) {
    return c -> c.setTargetWidth(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> textChangeEventMode(AbstractTextField.TextChangeEventMode arg0) {
    return c -> c.setTextChangeEventMode(arg0);
  }

  public static <T extends AbstractTextField> PropertyNode<T> textChangeTimeout(int arg0) {
    return c -> c.setTextChangeTimeout(arg0);
  }

  public static <T extends PopupDateField> PropertyNode<T> textFieldEnabled(boolean arg0) {
    return c -> c.setTextFieldEnabled(arg0);
  }

  public static <T extends ComboBox> PropertyNode<T> textInputAllowed(boolean arg0) {
    return c -> c.setTextInputAllowed(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> timeFormat(Calendar.TimeFormat arg0) {
    return c -> c.setTimeFormat(arg0);
  }

  public static <T extends DateField> PropertyNode<T> timeZone(TimeZone arg0) {
    return c -> c.setTimeZone(arg0);
  }

  public static <T extends Embedded> PropertyNode<T> type(int arg0) {
    return c -> c.setType(arg0);
  }

  public static <T extends AbstractField> PropertyNode<T> validationVisible(boolean arg0) {
    return c -> c.setValidationVisible(arg0);
  }

  public static <T extends Property & Component> PropertyNode<T> value(Object arg0) {
    return c -> c.setValue(arg0);
  }

  public static <T extends Component> PropertyNode<T> visible(boolean arg0) {
    return c -> c.setVisible(arg0);
  }

  public static <T extends Table> PropertyNode<T> visibleColumns(Object... arg0) {
    return c -> c.setVisibleColumns(arg0);
  }

  public static <T extends Calendar> PropertyNode<T> weeklyCaptionFormat(String arg0) {
    return c -> c.setWeeklyCaptionFormat(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> width(String arg0) {
    return c -> c.setWidth(arg0);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> width(float arg0,
      Sizeable.Unit arg1) {
    return c -> c.setWidth(arg0, arg1);
  }

  public static <T extends Sizeable & Component> PropertyNode<T> widthUndefined() {
    return c -> c.setWidthUndefined();
  }

  public static <T extends TextArea> PropertyNode<T> wordwrap(boolean arg0) {
    return c -> c.setWordwrap(arg0);
  }
}

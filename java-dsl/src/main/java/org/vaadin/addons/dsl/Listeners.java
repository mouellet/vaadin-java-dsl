package org.vaadin.addons.dsl;

import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.event.ContextClickEvent;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.LayoutEvents;
import com.vaadin.event.MouseEvents;
import com.vaadin.event.SelectionEvent;
import com.vaadin.event.ShortcutListener;
import com.vaadin.event.SortEvent;
import com.vaadin.server.ClientConnector;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Window;
import org.vaadin.addons.dsl.core.PropertyNode;

public class Listeners {
  private Listeners() {
  }

  public static <T extends ClientConnector & Component> PropertyNode<T> onAttach(ClientConnector.AttachListener arg0) {
    return c -> c.addAttachListener(arg0);
  }

  public static <T extends FieldEvents.BlurNotifier & Component> PropertyNode<T> onBlur(FieldEvents.BlurListener arg0) {
    return c -> c.addBlurListener(arg0);
  }

  public static <T extends Button> PropertyNode<T> onButtonClick(Button.ClickListener arg0) {
    return c -> c.addClickListener(arg0);
  }

  public static <T extends Upload> PropertyNode<T> onChange(Upload.ChangeListener arg0) {
    return c -> c.addChangeListener(arg0);
  }

  public static <T extends Window> PropertyNode<T> onClose(Window.CloseListener arg0) {
    return c -> c.addCloseListener(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> onCollapse(Tree.CollapseListener arg0) {
    return c -> c.addCollapseListener(arg0);
  }

  public static <T extends HasComponents.ComponentAttachDetachNotifier & Component> PropertyNode<T> onComponentAttach(HasComponents.ComponentAttachListener arg0) {
    return c -> c.addComponentAttachListener(arg0);
  }

  public static <T extends HasComponents.ComponentAttachDetachNotifier & Component> PropertyNode<T> onComponentDetach(HasComponents.ComponentDetachListener arg0) {
    return c -> c.addComponentDetachListener(arg0);
  }

  public static <T extends ContextClickEvent.ContextClickNotifier & Component> PropertyNode<T> onContextClick(ContextClickEvent.ContextClickListener arg0) {
    return c -> c.addContextClickListener(arg0);
  }

  public static <T extends ClientConnector & Component> PropertyNode<T> onDetach(ClientConnector.DetachListener arg0) {
    return c -> c.addDetachListener(arg0);
  }

  public static <T extends TreeTable> PropertyNode<T> onExpand(Tree.ExpandListener arg0) {
    return c -> c.addExpandListener(arg0);
  }

  public static <T extends Upload> PropertyNode<T> onFailed(Upload.FailedListener arg0) {
    return c -> c.addFailedListener(arg0);
  }

  public static <T extends Upload> PropertyNode<T> onFinished(Upload.FinishedListener arg0) {
    return c -> c.addFinishedListener(arg0);
  }

  public static <T extends FieldEvents.FocusNotifier & Component> PropertyNode<T> onFocus(FieldEvents.FocusListener arg0) {
    return c -> c.addFocusListener(arg0);
  }

  public static <T extends Grid> PropertyNode<T> onGridColumnReorder(Grid.ColumnReorderListener arg0) {
    return c -> c.addColumnReorderListener(arg0);
  }

  public static <T extends Grid> PropertyNode<T> onGridColumnResize(Grid.ColumnResizeListener arg0) {
    return c -> c.addColumnResizeListener(arg0);
  }

  public static <T extends Grid> PropertyNode<T> onGridColumnVisibilityChange(Grid.ColumnVisibilityChangeListener arg0) {
    return c -> c.addColumnVisibilityChangeListener(arg0);
  }

  public static <T extends ItemClickEvent.ItemClickNotifier & Component> PropertyNode<T> onItemClick(ItemClickEvent.ItemClickListener arg0) {
    return c -> c.addItemClickListener(arg0);
  }

  public static <T extends Container.ItemSetChangeNotifier & Component> PropertyNode<T> onItemSetChange(Container.ItemSetChangeListener arg0) {
    return c -> c.addItemSetChangeListener(arg0);
  }

  public static <T extends LayoutEvents.LayoutClickNotifier & Component> PropertyNode<T> onLayoutClick(LayoutEvents.LayoutClickListener arg0) {
    return c -> c.addLayoutClickListener(arg0);
  }

  public static <T extends LoginForm> PropertyNode<T> onLogin(LoginForm.LoginListener arg0) {
    return c -> c.addLoginListener(arg0);
  }

  public static <T extends Panel> PropertyNode<T> onMouseClick(MouseEvents.ClickListener arg0) {
    return c -> c.addClickListener(arg0);
  }

  public static <T extends PopupView> PropertyNode<T> onPopupVisibility(PopupView.PopupVisibilityListener arg0) {
    return c -> c.addPopupVisibilityListener(arg0);
  }

  public static <T extends Upload> PropertyNode<T> onProgress(Upload.ProgressListener arg0) {
    return c -> c.addProgressListener(arg0);
  }

  public static <T extends Container.PropertySetChangeNotifier & Component> PropertyNode<T> onPropertySetChange(Container.PropertySetChangeListener arg0) {
    return c -> c.addPropertySetChangeListener(arg0);
  }

  public static <T extends Property.ReadOnlyStatusChangeNotifier & Component> PropertyNode<T> onReadOnlyStatusChange(Property.ReadOnlyStatusChangeListener arg0) {
    return c -> c.addReadOnlyStatusChangeListener(arg0);
  }

  public static <T extends Window> PropertyNode<T> onResize(Window.ResizeListener arg0) {
    return c -> c.addResizeListener(arg0);
  }

  public static <T extends TabSheet> PropertyNode<T> onSelectedTabChange(TabSheet.SelectedTabChangeListener arg0) {
    return c -> c.addSelectedTabChangeListener(arg0);
  }

  public static <T extends SelectionEvent.SelectionNotifier & Component> PropertyNode<T> onSelection(SelectionEvent.SelectionListener arg0) {
    return c -> c.addSelectionListener(arg0);
  }

  public static <T extends AbstractComponent> PropertyNode<T> onShortcut(ShortcutListener arg0) {
    return c -> c.addShortcutListener(arg0);
  }

  public static <T extends SortEvent.SortNotifier & Component> PropertyNode<T> onSort(SortEvent.SortListener arg0) {
    return c -> c.addSortListener(arg0);
  }

  public static <T extends AbstractSplitPanel> PropertyNode<T> onSplitPositionChange(AbstractSplitPanel.SplitPositionChangeListener arg0) {
    return c -> c.addSplitPositionChangeListener(arg0);
  }

  public static <T extends AbstractSplitPanel> PropertyNode<T> onSplitterClick(AbstractSplitPanel.SplitterClickListener arg0) {
    return c -> c.addSplitterClickListener(arg0);
  }

  public static <T extends Upload> PropertyNode<T> onStarted(Upload.StartedListener arg0) {
    return c -> c.addStartedListener(arg0);
  }

  public static <T extends Upload> PropertyNode<T> onSucceeded(Upload.SucceededListener arg0) {
    return c -> c.addSucceededListener(arg0);
  }

  public static <T extends Table> PropertyNode<T> onTableColumnCollapse(Table.ColumnCollapseListener arg0) {
    return c -> c.addColumnCollapseListener(arg0);
  }

  public static <T extends Table> PropertyNode<T> onTableColumnReorder(Table.ColumnReorderListener arg0) {
    return c -> c.addColumnReorderListener(arg0);
  }

  public static <T extends Table> PropertyNode<T> onTableColumnResize(Table.ColumnResizeListener arg0) {
    return c -> c.addColumnResizeListener(arg0);
  }

  public static <T extends Table> PropertyNode<T> onTableFooterClick(Table.FooterClickListener arg0) {
    return c -> c.addFooterClickListener(arg0);
  }

  public static <T extends Table> PropertyNode<T> onTableHeaderClick(Table.HeaderClickListener arg0) {
    return c -> c.addHeaderClickListener(arg0);
  }

  public static <T extends FieldEvents.TextChangeNotifier & Component> PropertyNode<T> onTextChange(FieldEvents.TextChangeListener arg0) {
    return c -> c.addTextChangeListener(arg0);
  }

  public static <T extends Property.ValueChangeNotifier & Component> PropertyNode<T> onValueChange(Property.ValueChangeListener arg0) {
    return c -> c.addValueChangeListener(arg0);
  }

  public static <T extends Window> PropertyNode<T> onWindowModeChange(Window.WindowModeChangeListener arg0) {
    return c -> c.addWindowModeChangeListener(arg0);
  }
}

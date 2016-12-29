package org.vaadin.addons.dsl;

import org.vaadin.addons.dsl.core.PropertyNode;

import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.event.Action.ShortcutNotifier;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.LayoutEvents;
import com.vaadin.event.SelectionEvent;
import com.vaadin.event.ShortcutListener;
import com.vaadin.event.SortEvent;
import com.vaadin.server.AbstractClientConnector;
import com.vaadin.server.ClientConnector.AttachListener;
import com.vaadin.server.ClientConnector.DetachListener;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Window;

public class Listeners {

    private Listeners() {
    }

    /**
     *
     * @see com.vaadin.ui.Component#addListener(com.vaadin.ui.Component.Listener)
     */
    public static PropertyNode<Component> on(final Component.Listener arg1) {
        return c -> c.addListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.Action.ShortcutNotifier#addShortcutListener(ShortcutListener)
     */
    public static <S extends ShortcutNotifier & Component> PropertyNode<S> onShortcut(final ShortcutListener arg1) {
        return c -> c.addShortcutListener(arg1);
    }

    /**
     *
     * @see com.vaadin.server.AbstractClientConnector#addAttachListener(AttachListener)
     */
    public static <S extends AbstractClientConnector & Component> PropertyNode<S> onAttach(final AttachListener arg1) {
        return c -> c.addAttachListener(arg1);
    }

    /**
     *
     * @see com.vaadin.server.AbstractClientConnector#addDetachListener(DetachListener)
     */
    public static <S extends AbstractClientConnector & Component> PropertyNode<S> onDetach(final DetachListener arg1) {
        return c -> c.addDetachListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.HasComponents.ComponentAttachDetachNotifier#addComponentAttachListener(com.vaadin.ui.HasComponents.ComponentAttachListener)
     */
    public static <S extends HasComponents.ComponentAttachDetachNotifier & Component> PropertyNode<S> onComponentAttach(
            final HasComponents.ComponentAttachListener arg1) {
        return c -> c.addComponentAttachListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.HasComponents.ComponentAttachDetachNotifier#addComponentDetachListener(com.vaadin.ui.HasComponents.ComponentDetachListener)
     */
    public static <S extends HasComponents.ComponentAttachDetachNotifier & Component> PropertyNode<S> onComponentDetach(
            final HasComponents.ComponentDetachListener arg1) {
        return c -> c.addComponentDetachListener(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Property.ReadOnlyStatusChangeNotifier#addReadOnlyStatusChangeListener(com.vaadin.data.Property.ReadOnlyStatusChangeListener)
     */
    public static <S extends Property.ReadOnlyStatusChangeNotifier & Component> PropertyNode<S> onReadOnlyStatusChange(
            final Property.ReadOnlyStatusChangeListener arg1) {
        return c -> c.addReadOnlyStatusChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Property.ValueChangeNotifier#addValueChangeListener(com.vaadin.data.Property.ValueChangeListener)
     */
    public static <S extends Property.ValueChangeNotifier & Component> PropertyNode<S> onValueChange(final Property.ValueChangeListener arg1) {
        return c -> c.addValueChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.LayoutEvents.LayoutClickNotifier#addLayoutClickListener(com.vaadin.event.LayoutEvents.LayoutClickListener)
     */
    public static <S extends LayoutEvents.LayoutClickNotifier & Component> PropertyNode<S> onLayoutClick(final LayoutEvents.LayoutClickListener arg1) {
        return c -> c.addLayoutClickListener(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Container.ItemSetChangeNotifier#addItemSetChangeListener(com.vaadin.data.Container.ItemSetChangeListener)
     */
    public static <S extends Container.ItemSetChangeNotifier & Component> PropertyNode<S> onItemSetChange(final Container.ItemSetChangeListener arg1) {
        return c -> c.addItemSetChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.data.Container.PropertySetChangeNotifier#addPropertySetChangeListener(com.vaadin.data.Container.PropertySetChangeListener)
     */
    public static <S extends Container.PropertySetChangeNotifier & Component> PropertyNode<S> onPropertySetChange(
            final Container.PropertySetChangeListener arg1) {
        return c -> c.addPropertySetChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.AbstractSplitPanel#addSplitterClickListener(com.vaadin.ui.AbstractSplitPanel.SplitterClickListener)
     */
    public static PropertyNode<AbstractSplitPanel> onSplitterClick(final AbstractSplitPanel.SplitterClickListener arg1) {
        return c -> c.addSplitterClickListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.FieldEvents.BlurNotifier#addBlurListener(com.vaadin.event.FieldEvents.BlurListener)
     */
    public static <S extends FieldEvents.BlurNotifier & Component> PropertyNode<S> onBlur(final FieldEvents.BlurListener arg1) {
        return c -> c.addBlurListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.FieldEvents.FocusNotifier#addFocusListener(com.vaadin.event.FieldEvents.FocusListener)
     */
    public static <S extends FieldEvents.FocusNotifier & Component> PropertyNode<S> onFocus(final FieldEvents.FocusListener arg1) {
        return c -> c.addFocusListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.FieldEvents.TextChangeNotifier#addTextChangeListener(com.vaadin.event.FieldEvents.TextChangeListener)
     */
    public static <S extends FieldEvents.TextChangeNotifier & Component> PropertyNode<S> onTextChange(final FieldEvents.TextChangeListener arg1) {
        return c -> c.addTextChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Button#addClickListener(com.vaadin.ui.Button.ClickListener)
     */
    public static <T extends Button> PropertyNode<T> onButtonClick(final Button.ClickListener arg1) {
        return c -> c.addClickListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.ItemClickEvent.ItemClickNotifier#addItemClickListener(com.vaadin.event.ItemClickEvent.ItemClickListener)
     */
    public static <S extends ItemClickEvent.ItemClickNotifier & Component> PropertyNode<S> onItemClick(final ItemClickEvent.ItemClickListener arg1) {
        return c -> c.addItemClickListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.SelectionEvent.SelectionNotifier#addSelectionListener(com.vaadin.event.SelectionEvent.SelectionListener)
     */
    public static <S extends SelectionEvent.SelectionNotifier & Component> PropertyNode<S> onSelection(final SelectionEvent.SelectionListener arg1) {
        return c -> c.addSelectionListener(arg1);
    }

    /**
     *
     * @see com.vaadin.event.SortEvent.SortNotifier#addSortListener(com.vaadin.event.SortEvent.SortListener)
     */
    public static <S extends SortEvent.SortNotifier & Component> PropertyNode<S> onSort(final SortEvent.SortListener arg1) {
        return c -> c.addSortListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.PopupView#addPopupVisibilityListener(com.vaadin.ui.PopupView.PopupVisibilityListener)
     */
    public static PropertyNode<PopupView> onPopupVisibility(final PopupView.PopupVisibilityListener arg1) {
        return c -> c.addPopupVisibilityListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.TabSheet#addSelectedTabChangeListener(com.vaadin.ui.TabSheet.SelectedTabChangeListener)
     */
    public static PropertyNode<TabSheet> onSelectedTabChange(final TabSheet.SelectedTabChangeListener arg1) {
        return c -> c.addSelectedTabChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#addColumnReorderListener(com.vaadin.ui.Table.ColumnReorderListener)
     */
    public static PropertyNode<Table> onTableColumnReorder(final Table.ColumnReorderListener arg1) {
        return c -> c.addColumnReorderListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#addColumnResizeListener(com.vaadin.ui.Table.ColumnResizeListener)
     */
    public static PropertyNode<Table> onTableColumnResize(final Table.ColumnResizeListener arg1) {
        return c -> c.addColumnResizeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#addFooterClickListener(com.vaadin.ui.Table.FooterClickListener)
     */
    public static PropertyNode<Table> onTableFooterClick(final Table.FooterClickListener arg1) {
        return c -> c.addFooterClickListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Table#addHeaderClickListener(com.vaadin.ui.Table.HeaderClickListener)
     */
    public static PropertyNode<Table> onTableHeaderClick(final Table.HeaderClickListener arg1) {
        return c -> c.addHeaderClickListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Tree#addCollapseListener(com.vaadin.ui.Tree.CollapseListener)
     */
    public static PropertyNode<Tree> onTreeCollapse(final Tree.CollapseListener arg1) {
        return c -> c.addCollapseListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Tree#addExpandListener(com.vaadin.ui.Tree.ExpandListener)
     */
    public static PropertyNode<Tree> onTreeExpand(final Tree.ExpandListener arg1) {
        return c -> c.addExpandListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#addChangeListener(com.vaadin.ui.Upload.ChangeListener)
     */
    public static PropertyNode<Upload> onUploadChange(final Upload.ChangeListener arg1) {
        return c -> c.addChangeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#addFailedListener(com.vaadin.ui.Upload.FailedListener)
     */
    public static PropertyNode<Upload> onUploadFailed(final Upload.FailedListener arg1) {
        return c -> c.addFailedListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#addFinishedListener(com.vaadin.ui.Upload.FinishedListener)
     */
    public static PropertyNode<Upload> onUploadFinished(final Upload.FinishedListener arg1) {
        return c -> c.addFinishedListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#addProgressListener(com.vaadin.ui.Upload.ProgressListener)
     */
    public static PropertyNode<Upload> onUploadProgress(final Upload.ProgressListener arg1) {
        return c -> c.addProgressListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#addStartedListener(com.vaadin.ui.Upload.StartedListener)
     */
    public static PropertyNode<Upload> onUploadStarted(final Upload.StartedListener arg1) {
        return c -> c.addStartedListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Upload#addSucceededListener(com.vaadin.ui.Upload.SucceededListener)
     */
    public static PropertyNode<Upload> onUploadSucceeded(final Upload.SucceededListener arg1) {
        return c -> c.addSucceededListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#addCloseListener(com.vaadin.ui.Window.CloseListener)
     */
    public static PropertyNode<Window> onWindowClose(final Window.CloseListener arg1) {
        return c -> c.addCloseListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#addResizeListener(com.vaadin.ui.Window.ResizeListener)
     */
    public static PropertyNode<Window> onWindowResize(final Window.ResizeListener arg1) {
        return c -> c.addResizeListener(arg1);
    }

    /**
     *
     * @see com.vaadin.ui.Window#addWindowModeChangeListener(com.vaadin.ui.Window.WindowModeChangeListener)
     */
    public static PropertyNode<Window> onWindowModeChange(final Window.WindowModeChangeListener arg1) {
        return c -> c.addWindowModeChangeListener(arg1);
    }

}

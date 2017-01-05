package org.vaadin.addons.dsl;

import com.vaadin.ui.Audio;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.Button;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Flash;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Image;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.Slider;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Video;
import java.lang.SafeVarargs;
import java.lang.SuppressWarnings;
import org.vaadin.addons.dsl.core.ComponentNode;
import org.vaadin.addons.dsl.core.PropertyNode;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Components {
  private Components() {
  }

  @SafeVarargs
  public static <T extends Audio> ComponentNode<T> audio(final PropertyNode<? super T>... args) {
    return new ComponentNode(Audio.class, args);
  }

  @SafeVarargs
  public static <T extends Audio> ComponentNode<T> audio(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends BrowserFrame> ComponentNode<T> browserFrame(final PropertyNode<? super T>... args) {
    return new ComponentNode(BrowserFrame.class, args);
  }

  @SafeVarargs
  public static <T extends BrowserFrame> ComponentNode<T> browserFrame(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Button> ComponentNode<T> button(final PropertyNode<? super T>... args) {
    return new ComponentNode(Button.class, args);
  }

  @SafeVarargs
  public static <T extends Button> ComponentNode<T> button(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Calendar> ComponentNode<T> calendar(final PropertyNode<? super T>... args) {
    return new ComponentNode(Calendar.class, args);
  }

  @SafeVarargs
  public static <T extends Calendar> ComponentNode<T> calendar(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends CheckBox> ComponentNode<T> checkBox(final PropertyNode<? super T>... args) {
    return new ComponentNode(CheckBox.class, args);
  }

  @SafeVarargs
  public static <T extends CheckBox> ComponentNode<T> checkBox(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends ComboBox> ComponentNode<T> comboBox(final PropertyNode<? super T>... args) {
    return new ComponentNode(ComboBox.class, args);
  }

  @SafeVarargs
  public static <T extends ComboBox> ComponentNode<T> comboBox(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends CustomComponent> ComponentNode<T> customComponent(final PropertyNode<? super T>... args) {
    return new ComponentNode(CustomComponent.class, args);
  }

  @SafeVarargs
  public static <T extends CustomComponent> ComponentNode<T> customComponent(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends DateField> ComponentNode<T> dateField(final PropertyNode<? super T>... args) {
    return new ComponentNode(DateField.class, args);
  }

  @SafeVarargs
  public static <T extends DateField> ComponentNode<T> dateField(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Embedded> ComponentNode<T> embedded(final PropertyNode<? super T>... args) {
    return new ComponentNode(Embedded.class, args);
  }

  @SafeVarargs
  public static <T extends Embedded> ComponentNode<T> embedded(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Flash> ComponentNode<T> flash(final PropertyNode<? super T>... args) {
    return new ComponentNode(Flash.class, args);
  }

  @SafeVarargs
  public static <T extends Flash> ComponentNode<T> flash(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Grid> ComponentNode<T> grid(final PropertyNode<? super T>... args) {
    return new ComponentNode(Grid.class, args);
  }

  @SafeVarargs
  public static <T extends Grid> ComponentNode<T> grid(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Image> ComponentNode<T> image(final PropertyNode<? super T>... args) {
    return new ComponentNode(Image.class, args);
  }

  @SafeVarargs
  public static <T extends Image> ComponentNode<T> image(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends InlineDateField> ComponentNode<T> inlineDateField(final PropertyNode<? super T>... args) {
    return new ComponentNode(InlineDateField.class, args);
  }

  @SafeVarargs
  public static <T extends InlineDateField> ComponentNode<T> inlineDateField(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Label> ComponentNode<T> label(final PropertyNode<? super T>... args) {
    return new ComponentNode(Label.class, args);
  }

  @SafeVarargs
  public static <T extends Label> ComponentNode<T> label(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Link> ComponentNode<T> link(final PropertyNode<? super T>... args) {
    return new ComponentNode(Link.class, args);
  }

  @SafeVarargs
  public static <T extends Link> ComponentNode<T> link(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends ListSelect> ComponentNode<T> listSelect(final PropertyNode<? super T>... args) {
    return new ComponentNode(ListSelect.class, args);
  }

  @SafeVarargs
  public static <T extends ListSelect> ComponentNode<T> listSelect(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends MenuBar> ComponentNode<T> menuBar(final PropertyNode<? super T>... args) {
    return new ComponentNode(MenuBar.class, args);
  }

  @SafeVarargs
  public static <T extends MenuBar> ComponentNode<T> menuBar(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends NativeButton> ComponentNode<T> nativeButton(final PropertyNode<? super T>... args) {
    return new ComponentNode(NativeButton.class, args);
  }

  @SafeVarargs
  public static <T extends NativeButton> ComponentNode<T> nativeButton(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends NativeSelect> ComponentNode<T> nativeSelect(final PropertyNode<? super T>... args) {
    return new ComponentNode(NativeSelect.class, args);
  }

  @SafeVarargs
  public static <T extends NativeSelect> ComponentNode<T> nativeSelect(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends OptionGroup> ComponentNode<T> optionGroup(final PropertyNode<? super T>... args) {
    return new ComponentNode(OptionGroup.class, args);
  }

  @SafeVarargs
  public static <T extends OptionGroup> ComponentNode<T> optionGroup(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends PasswordField> ComponentNode<T> passwordField(final PropertyNode<? super T>... args) {
    return new ComponentNode(PasswordField.class, args);
  }

  @SafeVarargs
  public static <T extends PasswordField> ComponentNode<T> passwordField(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends PopupDateField> ComponentNode<T> popupDateField(final PropertyNode<? super T>... args) {
    return new ComponentNode(PopupDateField.class, args);
  }

  @SafeVarargs
  public static <T extends PopupDateField> ComponentNode<T> popupDateField(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends PopupView> ComponentNode<T> popupView(final PropertyNode<? super T>... args) {
    return new ComponentNode(PopupView.class, args);
  }

  @SafeVarargs
  public static <T extends PopupView> ComponentNode<T> popupView(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends ProgressBar> ComponentNode<T> progressBar(final PropertyNode<? super T>... args) {
    return new ComponentNode(ProgressBar.class, args);
  }

  @SafeVarargs
  public static <T extends ProgressBar> ComponentNode<T> progressBar(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends RichTextArea> ComponentNode<T> richTextArea(final PropertyNode<? super T>... args) {
    return new ComponentNode(RichTextArea.class, args);
  }

  @SafeVarargs
  public static <T extends RichTextArea> ComponentNode<T> richTextArea(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Slider> ComponentNode<T> slider(final PropertyNode<? super T>... args) {
    return new ComponentNode(Slider.class, args);
  }

  @SafeVarargs
  public static <T extends Slider> ComponentNode<T> slider(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Table> ComponentNode<T> table(final PropertyNode<? super T>... args) {
    return new ComponentNode(Table.class, args);
  }

  @SafeVarargs
  public static <T extends Table> ComponentNode<T> table(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends TextArea> ComponentNode<T> textArea(final PropertyNode<? super T>... args) {
    return new ComponentNode(TextArea.class, args);
  }

  @SafeVarargs
  public static <T extends TextArea> ComponentNode<T> textArea(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends TextField> ComponentNode<T> textField(final PropertyNode<? super T>... args) {
    return new ComponentNode(TextField.class, args);
  }

  @SafeVarargs
  public static <T extends TextField> ComponentNode<T> textField(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Tree> ComponentNode<T> tree(final PropertyNode<? super T>... args) {
    return new ComponentNode(Tree.class, args);
  }

  @SafeVarargs
  public static <T extends Tree> ComponentNode<T> tree(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends TreeTable> ComponentNode<T> treeTable(final PropertyNode<? super T>... args) {
    return new ComponentNode(TreeTable.class, args);
  }

  @SafeVarargs
  public static <T extends TreeTable> ComponentNode<T> treeTable(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends TwinColSelect> ComponentNode<T> twinColSelect(final PropertyNode<? super T>... args) {
    return new ComponentNode(TwinColSelect.class, args);
  }

  @SafeVarargs
  public static <T extends TwinColSelect> ComponentNode<T> twinColSelect(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Upload> ComponentNode<T> upload(final PropertyNode<? super T>... args) {
    return new ComponentNode(Upload.class, args);
  }

  @SafeVarargs
  public static <T extends Upload> ComponentNode<T> upload(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }

  @SafeVarargs
  public static <T extends Video> ComponentNode<T> video(final PropertyNode<? super T>... args) {
    return new ComponentNode(Video.class, args);
  }

  @SafeVarargs
  public static <T extends Video> ComponentNode<T> video(final T instance,
      final PropertyNode<? super T>... args) {
    return new ComponentNode(instance, args);
  }
}

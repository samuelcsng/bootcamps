import java.time.format.TextStyle;
import java.util.Deque;
import java.util.LinkedList;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class TextEditor {
  // Word: append(), undo(), redo()
  private String text;
  private Deque<String> undoStack;
  private Deque<String> redoStack;

  public TextEditor() {
    this.text = "";
    this.undoStack = new LinkedList<>();
    this.redoStack = new LinkedList<>();
  }

  public String toString() {
    return "TextEditor(" //
        + "text=" + this.text //
        + ", undoStack=" + this.undoStack //
        + ", redoStack=" + this.redoStack //
        + ")";
  }

  public void append(String newtext) {
    this.undoStack.push(this.text); // before
    text += newtext;
    this.redoStack.push(this.text); // after
  }

  public void undo() {
    if (!this.redoStack.isEmpty()) {
      this.redoStack.push(this.text);
      // if (this.text == null) {
      // System.out.println("Nothing to undo!!!");
      // }
      this.text = undoStack.pop();
    } else {
      System.out.println("No action to undo!");
    }
  }

  public void redo() {
    if (!this.redoStack.isEmpty()) {
      this.undoStack.push(this.text);
      // if (this.text == this.redoStack.pop()) {
      // System.out.println("Nothing to redo!!!");
      // }
      this.text = this.redoStack.pop();
    } else {
      System.out.println("No action to redo!");
    }
  }

  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    System.out.println(editor); // nothing

    editor.append("Hello"); // undoStack: "", this.text = Hello
    System.out.println(editor); // Hello

    editor.append(" World"); // undoStack: "Hello", this.text = Hello World
    System.out.println(editor); // Hello World

    editor.undo();
    System.out.println(editor); // Hello

    editor.redo();
    System.out.println(editor); // Hello World

    editor.append("world");
    System.out.println(editor); // Hello Worldworld

    editor.undo();
    System.out.println(editor); // Hello World

    editor.undo();
    System.out.println(editor); // Hello

    editor.undo();
    System.out.println(editor); //

    editor.undo();
    System.out.println(editor); // Nothing to undo!!!


  } // main()
}

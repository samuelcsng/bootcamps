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

  public void append(String newtext) {
    this.undoStack.push(this.text);
    text += newtext;
  }

  public void undo() {
    this.text = undoStack.pop();
  }

  public void redo() {

  }

  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    editor.append("Hello"); // undoStack: "", this.text = Hello
    editor.append(" World"); // undoStack: "Hello", this.text = Hello World
    System.out.println(editor); // Hello World
    editor.undo();
    System.out.println(editor); // Hello
    editor.redo();
    System.out.println(editor); // Hello World


  } // main()
}

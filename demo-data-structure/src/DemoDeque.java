import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
  public static void main(String[] args) {
    
  // Deque -> two ways (both head & tail) add and remove
  Deque<String> strings = new LinkedList<>();
  strings.add("abc");
  strings.add("def");
  strings.add("ijk"); // addLast()

  strings.addLast("aaa");
  strings.addFirst("bbb");
  }
  
  
}

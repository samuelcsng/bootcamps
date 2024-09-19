import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {

  // Map<Integer, String> nameMap = new Hashtable<>();
  Map<Integer, String> nameMap = new HashMap<>();

  public Map<Integer, String> getNameMap() {
    return this.nameMap;
  }

  public static void main(String[] args) throws InterruptedException {
    // Hashtable VS HashMap

    DemoHashtable demo = new DemoHashtable();
    Runnable addNames1 = () -> {
      for (int i = 0; i < 1_000; i++) {
        demo.getNameMap().put(i, "x");
      }
    };
    Runnable addNames2 = () -> {
      for (int i = 0; i < 1_000; i++) {
        demo.getNameMap().put(i, "y");
      }
    };
    Thread thread1 = new Thread(addNames1);
    Thread thread2 = new Thread(addNames2);
    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
    System.out.println(demo.getNameMap().size()); // 2000000

    // Lambda
    demo.getNameMap()
        .forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

    // demo.getNameMap().stream().filter((k,v)-> v=="x");
  } // main()
}

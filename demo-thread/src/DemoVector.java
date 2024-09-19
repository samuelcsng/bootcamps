import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  // private List<String> names = new ArrayList<>();
  private List<String> names = new Vector<>();

  public List<String> getNames() {
    return this.names;
  }

  public static void main(String[] args) throws InterruptedException {
    DemoVector demo = new DemoVector();
    Runnable addNames = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        demo.getNames().add("x");
      }
    };
    Thread thread1 = new Thread(addNames);
    Thread thread2 = new Thread(addNames);
    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
    System.out.println(demo.getNames().size()); // 2000000
  }
}

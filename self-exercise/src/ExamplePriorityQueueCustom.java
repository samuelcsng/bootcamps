import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b) {
    // Custom logic to reverse the default ordering
    // return a < b ? -1 : 1;
    return a < b ? 1 : -1;
  }
}


public class ExamplePriorityQueueCustom {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue =
        new PriorityQueue<>(new CustomComparator());
    // Adding elements with custom ordering
    priorityQueue.add(30);
    priorityQueue.add(10);
    priorityQueue.add(50);
    // Removing elements based on custom ordering
    System.out.println(priorityQueue.poll()); // Output: 50
    System.out.println(priorityQueue.poll()); // Output: 30
    System.out.println(priorityQueue.poll()); // Output: 10
  }

}

import java.util.Comparator;
import java.util.PriorityQueue;

public class ExamplePriorityQueueInteger {
  public static void main(String[] args) {
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();

    // Lambda Expression
    // Comparator<Integer> descending = (x, y) -> y > x ? 1 : -1; // descending
    // PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(descending);
    Comparator<Integer> ascending = (x, y) -> y > x ? -1 : 1; // ascending
    PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(ascending);


    priorityQueue2.add(10);
    priorityQueue2.add(100);
    priorityQueue2.add(40);
    for (int i : priorityQueue2) {
      System.out.println(i);
      // System.out.println(priorityQueue2.peek());
    }
    int size = priorityQueue2.size();
    for (int i = 0; i < size; i++) {
      System.out.println(priorityQueue2.poll());
      // System.out.println(priorityQueue2.poll());
      // System.out.println(priorityQueue2.poll());
    }


  }
}

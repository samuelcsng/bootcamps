import java.util.PriorityQueue;

public class ExamplePriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    // Adding elements with priority
    priorityQueue.add(30);
    priorityQueue.add(10);
    priorityQueue.add(50);
    // Removing elements based on priority
    System.out.println(priorityQueue.poll()); // Output: 10
    System.out.println(priorityQueue.poll()); // Output: 30
    System.out.println(priorityQueue.poll()); // Output: 50

  }
}

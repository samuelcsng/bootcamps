import java.util.PriorityQueue;

public class ExamplePriorityQueueString {
  public static void main(String[] args) {
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    // Adding strings with natural ordering
    priorityQueue.add("banana");
    priorityQueue.add("apple");
    priorityQueue.add("orange");
    // Removing strings based on natural ordering
    System.out.println(priorityQueue.poll()); // Output: "apple"
    // Adding "apple" again and observing the order
    priorityQueue.add("apple");
    System.out.println(priorityQueue.poll()); // Output: "apple"
    System.out.println(priorityQueue.poll()); // Output: "banana"
    System.out.println(priorityQueue.poll()); // Output: "orange"

  }
}

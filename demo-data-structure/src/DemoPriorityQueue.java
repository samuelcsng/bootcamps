import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static void main(String[] args) {
    // toString -> No ordering
    Queue<String> pq = new PriorityQueue<>();
    pq.add("abc");
    pq.add("hello");
    System.out.println(pq); // [abc, hello]
    pq.add("def");
    System.out.println(pq); // [abc, hello, def]

    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());

    // Ordering

    // Custom order
    // Tips: Class for sorting (Comparator)
    // Queue<String> pq2 = new PriorityQueue<>(...);

    Queue<String> pq2 = new PriorityQueue<>();
    pq2.add("abc");
    pq2.add("bcd");
    pq2.add("def");
    System.out.println(pq2);

    Comparator<String> ascendingOrderComparator = new Comparator<String>(){
@Override
public int compare(String s1, String s2){
  
}
    };





  }
}

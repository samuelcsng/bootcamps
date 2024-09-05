import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // For PQ, it is NOT first come first serve.
    Queue<String> pq = new PriorityQueue<>(); // natural ordering of the elements
    pq.add("abc");
    pq.add("hello");
    System.out.println(pq); // [abc, hello]
    pq.add("def");
    System.out.println(pq); // [abc, hello, def] -> it is not the queue order ...
    pq.add("aaa");
    pq.add("bca");
    pq.add("bac");

    // !!! The algorithm pick the first element at poll(), but not exactly a sorting.
    // but ...  the actual ordering of this queue is ...
    System.out.println(pq.poll()); // aaa

    // Not yet sort completely
    System.out.println(pq); // [abc, bca, bac, hello, def]

    System.out.println(pq.poll()); // abc
    System.out.println(pq.poll()); // bac

    // Custom order
    // Tips: Class for sorting (Comparator)
    Queue<String> pq2 = new PriorityQueue<>(new StringDesc());
    pq2.add("abc");
    pq2.add("def");
    System.out.println("pq2:"+pq2);
    
    pq2.add("xyz");
    System.out.println("pq2:"+pq2);


    // Person.class (name, age), isElderly()
    // PriorityQueue, Elderly always goes first.
    PriorityQueue<Person> pq3 = new PriorityQueue<>(new Person());
    pq3.add(new Person("Alan", 60));
    System.out.println("pq3:"+pq3);

    pq3.add(new Person("Benny", 65));
    System.out.println("pq3:"+pq3);
    
    pq3.add(new Person("Cath", 67));
    System.out.println("pq3:"+pq3);



  } // main()
}
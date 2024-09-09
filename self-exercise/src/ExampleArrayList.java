import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ExampleArrayList {
  public static void main(String[] args) {

    // ArrayList<String> names = new ArrayList<>();
    // names.add("Alice");
    // names.add("Bob");
    // System.out.println(names);
    // names.remove("Alice"); // names: ["Bob"]
    // System.out.println(names);

    // ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(0, 10); // numbers: [10]
    // numbers.add(1, 20); // numbers: [10, 20]
    // System.out.println(numbers);
    // numbers.add(1, 99);
    // System.out.println(numbers);

    // ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(10);
    // numbers.add(20);
    // int removedNumber = numbers.remove(1); // numbers: [10], removedNumber: 20
    // System.out.println(numbers);
    // System.out.println(removedNumber);

    // ArrayList<String> names = new ArrayList<>();
    // names.add("Alice");
    // names.add("Bob");
    // String firstPerson = names.get(0); // "Alice"
    // System.out.println(firstPerson);

    // ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(10);
    // numbers.add(20);
    // System.out.println(numbers);
    // int out = numbers.set(1, 30); // numbers: [10, 30]
    // System.out.println(numbers);
    // System.out.println(out);

    // numbers.isEmpty();

    // ArrayList<String> names = new ArrayList<>();
    // names.add("Alice");
    // names.add("Bob");
    // Iterator<String> iterator = names.iterator();
    // while (iterator.hasNext()) {
    // String name = iterator.next();
    // System.out.println(name);
    // }

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    ListIterator<Integer> listIterator = numbers.listIterator(1);
    int number = listIterator.next();
    System.out.println(number);


  } // main()
}

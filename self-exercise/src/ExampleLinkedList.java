import java.util.LinkedList;

public class ExampleLinkedList {
  public static void main(String[] args) {

    // // Create a LinkedList of Strings
    // LinkedList<String> names = new LinkedList<>();
    // // Adding elements to the LinkedList
    // names.add("Alice");
    // names.add("Bob");
    // names.add("Charlie");

    // names.clear();
    // System.out.println(names.isEmpty());

    // LinkedList<String> names = new LinkedList<>();
    // names.add("Alice");
    // names.add("Bob");
    // names.add("Alice");
    // int lastIndexAlice = names.lastIndexOf("Alice"); // 2 (last occurrence)
    // int lastIndexCharlie = names.lastIndexOf("Charlie"); // -1 (not found)

    // LinkedList<String> names = new LinkedList<>();
    // names.add("Alice");
    // LinkedList<String> otherNames = new LinkedList<>();
    // otherNames.add("Bob");
    // otherNames.add("Charlie");
    // names.addAll(otherNames); // Adds all elements from otherNames to the end of names

    // LinkedList<String> names = new LinkedList<>();
    // names.add("Alice");
    // LinkedList<String> otherNames = new LinkedList<>();
    // otherNames.add("Bob");
    // otherNames.add("Charlie");
    // names.addAll(0, otherNames); // Adds all elements from otherNames at index 0 in names

    // LinkedList<String> names = new LinkedList<>();
    // names.add("Alice");
    // names.addFirst("Bob"); // Inserts "Bob" at the beginning of the deque

    // LinkedList<String> names = new LinkedList<>();
    // names.add("Alice");
    // names.addLast("Bob"); // Inserts "Bob" at the end of the deque
    // names.add("Cathy");

    LinkedList<String> names = new LinkedList<>();
    names.add("Alice");
    boolean success = names.offerFirst("Bob"); // Inserts "Bob" at the beginning and returns



  }
}

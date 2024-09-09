import java.util.HashSet;

public class ExampleHashSet {
  public static void main(String[] args) {
    // // Create a HashSet of Strings
    // HashSet<String> namesSet = new HashSet<>();
    // // Adding elements to the HashSet
    // namesSet.add("Alice");
    // namesSet.add("Bob");
    // namesSet.add("Charlie");
    // System.out.println(namesSet);

    // namesSet.remove("Alice");
    // System.out.println(namesSet);

    // HashSet<String> namesSet = new HashSet<>();
    // namesSet.add("Alice");
    // HashSet<String> otherNamesSet = new HashSet<>();
    // otherNamesSet.add("Bob");
    // otherNamesSet.add("Charlie");
    // namesSet.addAll(otherNamesSet); // Adds all elements from otherNamesSet to namesSet
    // System.out.println(namesSet);

    // HashSet<String> namesSet = new HashSet<>();
    // namesSet.add("Alice");
    // namesSet.add("Bob");
    // namesSet.clear(); // Removes all elements from the set

    HashSet<String> namesSet = new HashSet<>();
    namesSet.add("Alice");
    boolean containsAlice = namesSet.contains("Alice"); // trueboolean containsBob = namesSet
    System.out.println(containsAlice);


  }
}

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleHashMap {
  public static void main(String[] args) {

    // // Create a HashMap with Integer keys and String values
    // HashMap<Integer, String> studentMap = new HashMap<>();
    // // Adding elements to the HashMap
    // studentMap.put(1, "Alice");
    // studentMap.put(2, "Bob");
    // studentMap.put(3, "Charlie");

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // String alice = studentMap.get(1); // "Alice"String unknownStudent = studentMap.get(2); //

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // studentMap.remove(1); // Removes the entry with key 1

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // boolean containsKey = studentMap.containsKey(1); // trueboolean containsUnknownkey = stud

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // boolean containsValue = studentMap.containsValue("Alice"); // trueboolean containsUnknown

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // studentMap.put(2, "Bob");
    // studentMap.clear(); // Removes all entries from the map

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // studentMap.put(2, "Bob");
    // Set<Integer> keys = studentMap.keySet(); // Set containing [1, 2]

    // HashMap<Integer, String> studentMap = new HashMap<>();
    // studentMap.put(1, "Alice");
    // studentMap.put(2, "Bob");
    // Collection<String> values = studentMap.values(); // Collection containing ["Alice", "Bob"

    HashMap<Integer, String> studentMap = new HashMap<>();
    studentMap.put(1, "Alice");
    studentMap.put(2, "Bob");
    Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
    // Set<Entry<Integer, String>> entries1 = studentMap.entrySet();

    for (Map.Entry<Integer, String> entry : entries) {
      int key = entry.getKey();
      String value = entry.getValue();
      System.out.println("Key: " + key + ", Value: " + value);
    }

  }
}

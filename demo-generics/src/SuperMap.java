// !!! Type K can be same as Type V

import java.util.LinkedList;
import java.util.List;

public class SuperMap<K, V> {
  private List<SuperEntry<K, V>> entries;

  public SuperMap() {
    this.entries = new LinkedList<>();
  }

  // Get Entry by key
  // public SuperEntry<K, V> getEntry(K key) {
  private SuperEntry<K, V> getEntry(K key) {
    // if not found, return null
    if (key == null) {
      return null;
    }
    for (SuperEntry<K, V> superEntry : this.entries) {
      if (key.equals(superEntry.getKey())) {
        return superEntry;
      }
    }
    return null;
  }

  public void put(K key, V value) {
    // check duplicate
    SuperEntry<K, V> entry = this.getEntry(key);
    if (entry == null) {
      this.entries.add(new SuperEntry<>(key, value));
      return;
    }
    // if duplicated
    entry.setValue(value);
  }

  public V get(K key) {
    SuperEntry<K, V> entry = this.getEntry(key);
    return entry == null ? null : entry.getValue();
  }

  public int size() {
    return this.entries.size();
  }

  public static void main(String[] args) {
    SuperMap<String, Integer> superMap = new SuperMap<>();
    superMap.put("peter", 1);
    superMap.put("peter", 2);
    superMap.put("john", 3);
    superMap.put("mary", 4);
    System.out.println(superMap.size());

    System.out.println(superMap.getEntry("peter"));
    System.out.println(superMap.getEntry("john"));
    System.out.println(superMap.getEntry("mary"));
    System.out.println(superMap.getEntry("simon"));

    System.out.println(superMap.size());

    //
    SuperMap<String, String> nameMap = new SuperMap<>();
    System.out.println(nameMap.size());
    nameMap.put("john", "apple");
    nameMap.put("vincent", "orange");
    System.out.println(nameMap.get("john")); // apple
    nameMap.put("john", "banana");    
    System.out.println(nameMap.get("john")); // banana
    System.out.println(nameMap.size());



  } // main()

}

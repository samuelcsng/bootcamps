import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // Map consists of entries
    // An entry consists of a key and a value

    Map<Integer, String> map = new HashMap<>();

    map.put(10, "Vincent"); // add to map
    map.put(-20, "Jenny"); // add to map
    // map.put(9, 10); // Wrong type of value object
    System.out.println(map.size()); // 2 entries

    System.out.println(map.get(-20)); // Jenny, Get Value Object
    System.out.println(map.get(-200)); // null

    // For-Each
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out
          .println("key=" + entry.getKey() + ", value=" + entry.getValue());
    }

    // Person.class
    Map<String, Person> personMap = new HashMap<>();
    Person person1 = new Person("john", 10);
    Person person2 = new Person("peter", 10);
    Person person3 = new Person("mary", 10);
    Person person4 = new Person("mary", 90);
    personMap.put(person1.getName(), person1);
    personMap.put(person2.getName(), person2);
    personMap.put(person3.getName(), person3);
    personMap.put(person4.getName(), person4);

    System.out.println("map size:" + personMap.size());
    System.out.println(personMap.get("john"));
    System.out.println(personMap.get(person4.getName()));
    // Map -> Entry<String, Person> -> Person -> Name, Age
    int sum = 0;
    for (Map.Entry<String, Person> entry : personMap.entrySet()) {
      System.out.println("key=" + entry.getKey() + ", value=" + " "
          + entry.getValue() + entry.getValue().getAge());
      sum += entry.getValue().getAge();
    }
    System.out.println(sum);

    // put() -> overwrite
    map.put(-20, "Oscar");
    System.out.println(map.size()); // 2
    System.out.println(map); // toString() -> {-20=Oscar, 10=Vincent}
    System.out.println(map.values());
    System.out.println(map.keySet());
    System.out.println(personMap.keySet());
    System.out.println(personMap.values());

    for (String key : personMap.keySet()) {
      System.out.println(key);
    }
    for (Person person : personMap.values()) {
      System.out.println(person);
    }
    System.out.println(personMap.entrySet());

    // !!! how to identigy the key is duplicated?
    Map<HKID, Person> citizenMap = new HashMap<>();
    citizenMap.put(new HKID("1234"), person1);
    System.out.println(citizenMap);
    citizenMap.put(new HKID("1235"), person2);
    System.out.println(citizenMap);
    System.out.println(citizenMap.size()); // 2

    // get()
    System.out.println(citizenMap.get(new HKID("1234"))); // null, problem?

    citizenMap.put(new HKID("1234"), person3); // want to overwrite, but fail!
    System.out.println(citizenMap);

    // size
    System.out.println(citizenMap.size()); // 3 ?!

    // The implementation of put() method


  } // main()
}

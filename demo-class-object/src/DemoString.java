public class DemoString {
  public static void main(String[] args) {

    String s = "hello";
    String s2 = s.concat("world"); // one obj ref, two objects

    // String s2 = s.concat("world"); // String object s won't change (Two references, Two objects)

    // valueOf() -> Pool
    String str11 = String.valueOf("abc"); // Pool
    String str12 = "abc"; // Pool
    System.out.println(str11 == str12); // true

    // Summary
    // 1. valueOf() -> put into Pool
    // 2. new String() -> NOT put into Pool
    // 3. "" -> put into Pool
    // 4. new String().intern() -> put into Pool

    Integer n1 = 127;
    Integer n2 = 128;
    System.out.println(n1.equals(n2));
    System.out.println(n1.compareTo(n2)); // -1

    System.out.println(n1 == n2); // false, check if the addresses are same

    // Within -128 to 127 (Pool - Internal Cache)
    Integer n3 = 127;
    System.out.println(n1 == n3); // true

    // Outside -128 to 127 (No Pool)
    Integer n4 = 128;
    System.out.println(n2 == n4); // false

    Integer n5 = -129;
    Integer n6 = -129;
    System.out.println(n5 == n6); // false

    Integer n7 = new Integer(127);
    System.out.println(n7 == n3); // false

    Integer n8 = Integer.valueOf(127);
    System.out.println(n3 == n8); // true

    Integer n9 = Integer.valueOf(128);
    System.out.println(n3 == n9); // false


  }
}

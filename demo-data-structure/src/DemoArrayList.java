import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[] {"abc", "def", "ijk"};
        System.out.println(arr.length); // 3
        arr[1] = "hello";
        for (String s : arr) {

        }
        System.out.println();
        // if we want to add one more String object to array object
        // you have to create another String array object, and then copy ...
        // so, array object is fixed length

        // After Java 5
        // ArrayList object is variable length
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("def");
        strings.add("ijk");
        strings.add("hello");
        System.out.println(strings.size()); // 4

        strings.set(1, "opq");

        for (String s : strings) {

        }

        System.out.println(strings.get(1)); // opq

        strings.remove("ijk"); // !!! vip

        System.out.println(strings); // ArrayList.toString() -> [abc, opq, hello]

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(10000);
        integers.add(-2_100_000_000);
        System.out.println(integers.size()); // 3

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer john = new Customer("John");

        customers.add(john);
        customers.add(john);
        System.out.println(customers.size()); // 2
        customers.remove(john); // Object.class equals() true -> break
        // customers.add(new Customer("John")); // Object.class equals() true -> break
        // customers.add(new Customer("John")); // 2
        System.out.println(customers.size()); // 1



    } // end of main()
}

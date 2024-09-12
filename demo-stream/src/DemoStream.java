import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    // Stream.class
    Stream<String> strings = Stream.of("abc", "def");
    // for-each (Iterable)
    // for-each (Stream cannot use for-each)
    // for (String s: strings){
    // System.out.println(s);
    // }

    // Both List and Stream can use forEach()
    strings.forEach(s -> {
      System.out.println(s);
    });

    Stream<Customer> customers =
        Stream.of(new Customer(18, "John"), new Customer(20, "Steven"));

    customers.forEach(c -> System.out.println(c.getName() + ", " + c.getAge()));

    // !!! 1. Convert List to Stream - stream()
    List<Customer> customers2 =
        Arrays.asList(new Customer(18, "John"), new Customer(20, "Steven"));
    Stream<Customer> customerStream = customers2.stream();

    // !!! 2. Convert Stream to List - collect()
    List<Customer> customers3 = customerStream.collect(Collectors.toList());


    // Stream Object -> filter() + collect()
    // Similar to for loop + if
    List<Customer> customers4 = customers2.stream() // return Stream<Customer>
        .filter(customer -> customer.getAge() > 18) // return Stream<Customer>
        .collect(Collectors.toList()); // return List<Customer>

    System.out.println(customers4); // [Customer:(name=Steven, age=20)]


    // Stream Object -> map() + collect()
    // similar to for loop + new ArrayList() + add()
    List<String> names = customers2.stream() // return Stream<Customer>
        .map(customer -> customer.getName()) // !!! return Stream<String>
        .collect(Collectors.toList()); // return List<String>
    System.out.println(names); // [John, Steven]

    // filter() can work together with map()
    // 1. filter () before map()
    // 2. map() before filter()

    List<String> stringStream1 =
        customers2.stream().filter(c -> c.getAge() > 18).map(c -> c.toString())
            .collect(Collectors.toList());
    System.out.println(stringStream1);

    List<String> stringStream2 = customers2.stream().map(c -> c.getName())
        .filter(s -> s.length() > 5).collect(Collectors.toList());
    System.out.println(stringStream2);

    // count()

    // Stream Object -> mapToInt() -> IntStream object -> sum()
    int sumOfAges = customers2.stream().mapToInt(c -> c.getAge()).sum(); // 38
    System.out.println(sumOfAges);

    // IntStream object -> max(), min(), average()

    // IntStream -> distinct()

    // Collect to Set

    // Array to IntStream to Stream<Integer> to List<Integer>
    int[] arr = new int[] {3, 2, 1};
    IntStream ints = Arrays.stream(arr);
    Stream<Integer> integers = ints.boxed();
    Set<Integer> integerSet = integers.collect(Collectors.toSet());
    System.out.println(integerSet); // [1, 2, 3]

  } // main()
}

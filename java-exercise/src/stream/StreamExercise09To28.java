package stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise09To28 {
  public static void main(String[] args) {

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result into
    // a Map<Integer, List<String>> where the key is the age and the value is a list of names.
    List<Person> people = Arrays.asList( //
        new Person("Alice", 30), //
        new Person("Bob", 25), //
        new Person("Charlie", 30) //
    ); //
    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)
    //
    // Map<Integer, List<String>> ans9 = new HashMap<>();
    Map<Integer, List<String>> ans9 = people.stream() //
        .collect(Collectors.groupingBy(p -> p.getAge(), //
            Collectors.mapping(p -> p.getName(), Collectors.toList()))) //
    ;
    System.out.println(ans9);


    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of people with their names and genders, partition them into two groups: male and female,
    // and collect the result into a Map<Boolean, List<Person>>.
    // Create Person2.class first.
    List<Person2> people2 = Arrays.asList( //
        new Person2("Alice", "Female"), //
        new Person2("Bob", "Male"), //
        new Person2("Charlie", "Male") //
    );
    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)
    //
    Map<Boolean, List<Person2>> ans10 = people2.stream() //
        .collect(Collectors.partitioningBy(p -> p.getGender() == "Male")) // , //
    // Collectors.mapping(p -> p.getName(), Collectors.toList()))) //
    ;
    System.out.println(ans10); // {false=[Alice], true=[Bob, Charlie]} ???
    //
    Map<Boolean, List<String>> ans10b = ans10.entrySet().stream() //
        .collect( //
            Collectors.toMap( //
                e -> e.getKey(), //
                e -> e.getValue().stream() //
                    .map(s -> s.getName()) //
                    .collect(Collectors.toList()) //
            ) //
        ) //
    ;
    System.out.println(ans10b);


    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers by 2, and
    // collect the result into a List.
    List<Integer> numbers = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]
    //
    List<Integer> ans11 = numbers.stream() //
        .filter(number -> number >= 10) //
        .map(number -> number * 2) //
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans11);


    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name and
    // default value for age) and collect the result into a list.
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)
    //
    List<Person> ans12 = names.stream() //
        .map(name -> new Person(name, defaultAge)) //
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans12);


    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a Deque.
    List<String> words = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)
    //
    ArrayDeque<String> ans13 = words.stream() //
        .map(word -> word.toUpperCase()) //
        .collect(Collectors.toCollection(ArrayDeque::new)) //
    ;
    System.out.println(ans13 + " " + ans13.getClass());


    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.
    List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]
    //
    Integer[] ans14 = numbers14.stream() //
        .map(number -> (int) Math.pow(number, 2)) //
        // .collect(Collectors.toList()) //
        .toArray(Integer[]::new) //
    ;
    System.out.println(Arrays.toString(ans14));


    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the total price of all products. Create Product.class first.
    List<Product> products = Arrays.asList( //
        new Product("Book", 10), //
        new Product("Pen", 5), //
        new Product("Notebook", 7) //
    );
    // Output: 22
    //
    double ans15 = products.stream() //
        .map(p -> p.getPrice()) //
        .reduce(0.0, (x, y) -> x + y) //
    ;
    System.out.println(ans15);


    // 16. Grouping
    // Task: Given a list of employees with their department names, use `groupingBy` method to group the
    // employees by department.
    // Create Employee2.class first.
    List<Employee2> employees = Arrays.asList( //
        new Employee2("Alice", "HR"), //
        new Employee2("Bob", "IT"), //
        new Employee2("Charlie", "HR"), //
        new Employee2("David", "IT") //
    );
    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}
    //
    Map<String, List<String>> ans16 = employees.stream() //
        .collect(Collectors.groupingBy(e -> e.getDepartment(), //
            Collectors.mapping(e -> e.getName(), Collectors.toList()))) //
    ;
    System.out.println(ans16);


    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers17 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: 55
    //
    Integer ans17 = numbers17.parallelStream() //
        .reduce(0, (x, y) -> x + y) //
    ;
    System.out.println(ans17);


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the numbers greater than 5.
    List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
    // Output: [6, 7, 8, 9]
    //
    List<Integer> ans18 = listOfLists.stream() //
        .flatMap(list -> list.stream()) //
        .filter(x -> x > 5) //
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans18);


    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result in alphabetical order.
    List<String> words19 =
        Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    //
    List<String> ans19 = words19.stream() //
        .distinct() //
        .sorted() //
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans19);


    // 20. Partitioning By
    // Task: Given a list of students with their scores, partition the students into passing and failing groups (pass if
    // score >= 50).
    // Create Student.class first.
    List<Student> students = Arrays.asList( //
        new Student("Alice", 45), //
        new Student("Bob", 55), //
        new Student("Charlie", 40), //
        new Student("David", 70) //
    );
    // Output: {false=[Alice, Charlie], true=[Bob, David]}
    //
    Map<Boolean, List<Student>> ans20a = students.stream() //
        .collect(Collectors.partitioningBy(s -> s.getScore() > 50)) //
    ;
    Map<Boolean, List<String>> ans20 = ans20a.entrySet().stream() //
        .collect( //
            Collectors.toMap( //
                // Map.Entry::getKey, //
                e -> e.getKey(), //
                entry -> entry.getValue().stream() //
                    // .map(Student::getName) //
                    .map(s -> s.getName()) //
                    .collect(Collectors.toList()) //
            ) //
        ) //
    ;
    System.out.println(ans20);


    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    List<String> words21 = Arrays.asList("Java", "Streams", "Are", "Fun");
    // Output: "Java, Streams, Are, Fun"
    //
    String ans21 = words21.stream() //
        .reduce((s1, s2) -> s1 + ", " + s2) //
        .orElseThrow(() -> new RuntimeException("List is empty")) //
    ;
    System.out.println(ans21);


    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> numbers22 = Arrays.asList(4, 7, 9, 12, 16, 21);
    // Output: 9
    //
    int ans22 = numbers22.stream() //
        .filter(n -> n % 3 == 0) //
        .findFirst() //
        .orElseThrow(() -> new RuntimeException("List is empty")) //
    ;
    System.out.println(ans22);


    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    List<Integer> numbers23 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]
    //
    List<Integer> ans23 = numbers23.stream() //
        .skip(3) //
        .limit(5) //
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans23);


    // 24. Peek (Debugging in Streams)
    // Task: Given a list of integers, double each element and use the `peek` method to log the intermediate results to the console.
    List<Integer> numbers24 = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]
    //
    List<Integer> ans24 = numbers24.stream() //
        .map(n -> n * 2) //
        .peek(n -> System.out.print(n + ", ")) //
        .collect(Collectors.toList()) //
    ;
    System.out.print("\n");
    System.out.println(ans24);


    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters. Handle the case
    // where no such string exists using Optional.
    List<String> words25 = Arrays.asList("hi", "hello", "cat", "dog");
    // Output: Optional[hello]
    //
    Optional<String> ans25 = words25.stream() //
        .filter(s -> s.length() > 4) //
        .findFirst() //
    ;
    System.out.println(ans25);


    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream into a HashSet.
    List<Integer> numbers26 = Arrays.asList(1, 2, 3, 4, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (in any order)
    //
    Set<Integer> ans26 = numbers26.stream() //
        .collect(Collectors.toSet()) //
    ;
    System.out.println(ans26);


    // 27. Using Stream to Manipulate Arrays
    // Task: Given an array of integers, find the sum of the elements after converting the array to a Stream.
    int[] numbers27 = {1, 2, 3, 4, 5};
    // Output: 15
    //
    int ans27 = Arrays.stream(numbers27) //
        .reduce(0, (n1, n2) -> n1 + n2) //
    ;
    System.out.println(ans27);


    // 28. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings combined.
    List<String> words28 = Arrays.asList("Java", "Streams", "Practice");
    // Output: 19
    int ans28 = words28.stream() //
        .map(s -> s.length()) //
        .reduce(0, (x, y) -> x + y) //
    ;
    System.out.println(ans28);


  } // main()
}


class Person {
  private String name;
  private int age;

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }

}


class Person2 {
  private String name;
  private String gender;

  public Person2(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return this.name;
  }

}


class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

}


class Employee2 {
  private String name;
  private String department;

  public Employee2(String name, String department) {
    this.name = name;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

}

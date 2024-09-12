package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise {
  public static void main(String[] args) {

    // 1. **Basic Stream Operations**
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [64, 36, 16, 4]
    //
    List<Integer> ans1 = numbers.stream() //
        .filter(x -> x % 2 == 0) //
        .map(x -> x * x) //
        .sorted((x, y) -> Integer.compare(y, x)) //
        .collect(Collectors.toList()); //
    System.out.println(ans1);


    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // Output: [Alice, Annie, Alex]
    //
    List<String> ans2 = names.stream() //
        .filter(s -> s.startsWith("A")) //
        .collect(Collectors.toList()); //
    System.out.println(ans2);


    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5
    //
    // max
    // Optional<Integer> max = numbers3.stream() //
    int max = numbers3.stream() //
        .max((x, y) -> Integer.compare(x, y)) //
        // .max(Integer::compare) //
        // .max((x, y) -> x.compareTo(y)) //
        .orElseThrow(() -> new RuntimeException("List is empty")) //
    ;
    System.out.println("Max: " + max);
    // min
    // Optional<Integer> min = numbers3.stream() //
    int min = numbers3.stream() //
        .min((x, y) -> Integer.compare(x, y)) //
        // .min(Integer::compare) //
        // .min((x, y) -> x.compareTo(y)) //
        .orElseThrow(() -> new RuntimeException("List is empty")) //
    ;
    System.out.println("Min: " + min);


    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a `List<Integer>`.
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    //
    List<Integer> ans4 = words.stream() //
        // .map(s -> s.length()) //
        .map(String::length)
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans4);


    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words5 =
        Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    //
    long ans5 = words5.stream() //
        // .map(s -> s.length()) //
        .map(String::length) //
        .filter(x -> x > 3) //
        .count() //
    ;
    System.out.println(ans5);


    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a Set.
    List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // Output: [15, 20]
    //
    Set<Integer> ans6 = numbers6.stream() //
        .filter(x -> x > 10) //
        .collect(Collectors.toSet()) //
    ;
    System.out.println(ans6);


    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>, where
    // the key is the student's name and the value is their score.
    // Create Student.class first.
    List<Student> students =
        Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
    // Output: {Alice=85, Bob=75}
    //
    Map<String, Integer> ans7 = students.stream() //
        // .collect(Collectors.toMap(Student::getName, Student::getScore)) //
        .collect(Collectors.toMap(o -> o.getName(), o -> o.getScore())) //
    ;
    System.out.println(ans7);


    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and map them to
    // a list of their names.
    // Create Employee.class first.
    List<Employee> employees = Arrays.asList( //
        new Employee("John", 65000), //
        new Employee("Jane", 55000), //
        new Employee("Doe", 40000));
    // Output: [John, Jane]
    //
    List<String> ans8 = employees.stream() //
        .filter(employee -> employee.getSalary() > 50000) //
        // .map(employee -> employee.getName()) //
        .map(Employee::getName)
        .collect(Collectors.toList()) //
    ;
    System.out.println(ans8);

  } // main()
}


class Student {
  private String name;
  private int score;

  // constructor
  public Student(String name, int age) {
    this.name = name;
    this.score = age;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }
}


class Employee {
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }
}

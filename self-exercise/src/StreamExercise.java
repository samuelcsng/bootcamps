import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise {
        public static void main(String[] args) {

                List<Integer> numbers =
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                // Output: [100, 64, 36, 16, 4]
                List<Integer> ans01 = numbers.stream() //
                                .filter(s -> s % 2 == 0) //
                                .map(n -> n * n) //
                                .sorted((n1, n2) -> n2.compareTo(n1)) //
                                .collect(Collectors.toList()) //
                ;
                System.out.println(ans01);

                List<String> names = Arrays.asList("Alice", "Bob", "Annie",
                                "David", "Alex");
                // Output: [Alice, Annie, Alex]
                List<String> ans02 = names.stream() //
                                .filter(s -> s.startsWith("A")) //
                                .collect(Collectors.toList()) //
                ;
                System.out.println(ans02);

                List<Integer> numbers03 = Arrays.asList(10, 20, 5, 30, 15);
                // Output: Max: 30
                // Output: Min: 5
                int max = numbers03.stream() //
                                // .reduce((x, y) -> {
                                // if (x > y) {
                                // return x;
                                // }
                                // return y;
                                // }) //
                                .max((x, y) -> x.compareTo(y)) //
                                .orElseThrow() //
                ;
                int min = numbers03.stream() //
                                // .reduce((x, y) -> {
                                // if (x > y) {
                                // return x;
                                // }
                                // return y;
                                // }) //
                                .min((x, y) -> x.compareTo(y)) //
                                .orElseThrow() //
                ;
                System.out.println(max);
                System.out.println(min);

                List<String> words = Arrays.asList("apple", "banana", "pear");
                // Output: [5, 6, 4] (List)
                List<Integer> ans04 = words.stream() //
                                .map(s -> s.length()) //
                                .collect(Collectors.toList()) //
                ;
                System.out.println(ans04);

                List<String> words05 = Arrays.asList("hi", "hello", "world",
                                "java", "stream");
                // Output: 4
                long ans05 = words05.stream() //
                                .filter(s -> s.length() > 3) //
                                .count() //
                ;
                System.out.println(ans05);

                List<Integer> numbers06 = Arrays.asList(5, 10, 15, 20, 10, 5);
                // Output: [15, 20]
                Set<Integer> ans06 = numbers06.stream() //
                                .filter(n -> n > 10) //
                                .collect(Collectors.toSet()) //
                ;
                System.out.println(ans06);

                List<Student> students = Arrays.asList(new Student("Alice", 85),
                                new Student("Bob", 75));
                // Output: {Alice=85, Bob=75}
                Map<String, Integer> ans07 = students.stream() //
                                .collect( //
                                                Collectors.toMap( //
                                                                entry -> entry.getName(), //
                                                                entry -> entry.getScores() //
                                                ) //
                                ) //
                ;
                System.out.println(ans07 + " " + ans07.getClass());

                List<Employee> employees =
                                Arrays.asList(new Employee("John", 65000),
                                                new Employee("Jane", 55000),
                                                new Employee("Doe", 40000));
                // Output: [John, Jane]
                List<String> ans08 = employees.stream() //
                                .filter(e -> e.getSalary() > 50000) //
                                .map(e -> e.getName()) //
                                .collect(Collectors.toList()) //
                ;
                System.out.println(ans08);

        } // main()
}


class Student {
        private String name;
        private int scores;

        public Student(String name, int scores) {
                this.name = name;
                this.scores = scores;
        }

        public String getName() {
                return name;
        }

        public int getScores() {
                return scores;
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

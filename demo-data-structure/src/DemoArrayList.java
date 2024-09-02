import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    public static void main(String[] args) {
        String[] arr = new String[] {"abc", "def", "ijk"};
        System.out.println(arr.length); // 3
        arr[1] = "hello";
        for (String s : arr) {

        }
        System.out.println(arr[1]);
        // if we want to add one more String object to array object
        // you have to create another String array object, and then copy ....
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

        strings.remove(new String("ijk")); // !!!

        System.out.println(strings); // ArrayList.toString() -> [abc, opq, hello]

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(10000);
        integers.add(-2_100_000_000);
        System.out.println(integers.size()); // 3


        // !!! you should think of the scenario of without equals() in Customer.class
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer john = new Customer("John");

        customers.add(john);
        customers.add(john);
        System.out.println(customers.size()); // 2
        customers.remove(john); // Object.class equals() true -> break
        System.out.println(customers.size()); // 1

        customers.add(john);
        System.out.println(customers.size()); // 2

        ArrayList<Customer> targetRemoveList = new ArrayList<>();
        targetRemoveList.add(john);

        customers.removeAll(targetRemoveList); // -> Customer.equals()

        System.out.println(customers.size()); // 0

        ArrayList<BigDecimal> decimals = new ArrayList<>();
        // add
        decimals.add(BigDecimal.valueOf(3.0d));
        decimals.add(BigDecimal.valueOf(3.5));
        decimals.add(BigDecimal.valueOf(3.5));
        // remove
        decimals.remove(BigDecimal.valueOf(3.5)); // remove one and break
        // size
        System.out.println(decimals.size()); // 2

        //
        System.out.println(decimals.contains(BigDecimal.valueOf(3.5))); // true
        // ArrayList.class -> contains() -> for loop, break
        // but the definition of equals() is still controlled by BigDecimal.class -> equals()

        // ask if contains both 3.0, 3.5
        // ArrayList<BigDecimal> checkIfContains = new ArrayList<>()();
        // checkIfContains.add(BigDecimal.valueOf(3.0));
        // checkIfContains.add(BigDecimal.valueOf(3.5));
        // decimals.containsAll(checkIfContains);

        decimals.containsAll(Arrays.asList(BigDecimal.valueOf(3.0),
                BigDecimal.valueOf(3.5))); // true

        // ArrayList<>
        // for loop - ArrayList
        for (int i = 0; i < decimals.size(); i++) {
            System.out.println(decimals.get(i));
        }
        // for-each loop - ArrayList
        for (BigDecimal bd : decimals) {
            System.out.println(bd);

        }

        // create each subject item
        Subject subEnglish = new Subject(99, "English");
        Subject subMath = new Subject(55, "Mathematics");
        // create subject ArrayList
        ArrayList<Subject> subjects = new ArrayList<>();
        // add items to ArrayList
        subjects.add(subEnglish);
        subjects.add(subMath);
        // create each subject student
        Student student1 = new Student(subjects);
        Student student2 = new Student(subjects);
        // create student ArrayList
        ArrayList<Student> students = new ArrayList<>();
        // add student to ArrayList
        students.add(student1);
        students.add(student2);

        // can refactor to use .toString()
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            for (int j = 0; j < student.getSubjects().size(); j++) {
                Subject subject = student.getSubjects().get(j);
                String desc = subject.getDesc();
                int score = subject.getScore();
                System.out.println(student + ": " + desc + ": " + score);
            }
        }



    } // end of main()
}

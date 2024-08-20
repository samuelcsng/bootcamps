public class Student {
  private static String schoolName = "ABC school";

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // instance method
  public String info() {
    return "Student(" //
        + "name=" + this.name // instance variable
        + ", age=" + this.age // instance variable
        + ", school=" + schoolName // static variable
        + ")";
  }

  public static void main(String[] args) {
    Student s1 = new Student("John", 13);
    Student s2 = new Student("Jenny", 11);

    System.out.println(s1.info()); // Student(name=John, age=13, school=ABC school)
    System.out.println(s2.info()); // Student(name=Jenny, age=11, school=ABC school)

    Student.schoolName = "DEF school"; // !!!
    System.out.println(s1.info()); // Student(name=John, age=13, school=DEF school)
    System.out.println(s2.info()); // Student(name=Jenny, age=11, school=DEF school)



  } // end of main()
}

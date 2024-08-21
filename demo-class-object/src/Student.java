public class Student {
  private static String schoolName = "ABC school"; // outside the Student Object

  private String name; // inside the Student Object
  private int age; // inside the Student Object

  // !!! Summary (static vs instance)
  // Static method return instance variable (NOT OK - compile error)
  // Instance method return instance variable (OK)
  // Static method return static variable (OK)
  // Instance method return static variable (OK)

  // !!!
  // static method, static variable, static class do not belongs to object
  // so static stuff can be written to any class technically

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

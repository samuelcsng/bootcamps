public class Person {
  private String name;
  private int age;

  // default empty constructor, only if you did not create another constructor
  // empty, all-args
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // You can just read the attribute from objects, if there is no setter.
  // You cannot override/rewrite the attribute anymore after object creation.
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }



  // Testing
  public static void main(String[] args) {
    // memory
    // When you create one all-arg constructor only
    // compiler would not create the empty constructor for you anymore.
    // Person person=new Person(); // compile error

    Person person = new Person("John", 66);
    System.out.println(person.getName());
    System.out.println(person.getAge());

  } // end of main()

} // end of class

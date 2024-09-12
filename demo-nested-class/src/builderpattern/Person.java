package builderpattern;

public class Person {
  private String name;
  private int age;

  // constructor
  public Person() {}

  // all-args constructor
  // traditional constructor
  // public Person(String name, int age) {
  private Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // You can add other public constructors if required
  private Person(Person.Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }


  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // getter
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  // *** builder() *** static method
  public static Builder builder() {
    return new Builder();
  }

  // toString, equals, hashCode
  // ...

  public static class Builder {
    // copy all Person's attribute
    private String name;
    private int age;

    // constructor

    public Person.Builder name(String name) {
      this.name = name;
      return this;
    }

    public Person.Builder age(int age) {
      this.age = age;
      return this;
    }

    // method
    // *** build() *** instance method
    public Person build() { // ************
      return new Person(this.name, this.age);
      // return new Person(this);
    }

  } // class Builder

  public static void main(String[] args) {
    Person p = new Person("John", 30);
    p.setAge(40);
    System.out.println(p.getAge());

    // Task 1: builder()
    // Task 2: build() -> return Person Object


    Person p2 = Person.builder() //
        .name("Peter") //
        .age(20) //
        .build();
    // build() -> instance method
    // -> return Person.object

    System.out.println(p2.getName()); // Peter
    System.out.println(p2.getAge()); // 20
  }
} // class Person

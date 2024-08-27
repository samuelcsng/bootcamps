public class Cat extends Animal {
  private String color;

  // empty constructor
  public Cat() {

  }

  // In Java, we never inherit constructor from Parent Class
  // but we can call parent constructor
  public Cat(int age, String name, String color) {
    // call parent constructor
    super(age, name); // call parent constructor
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public String toString() {
    return "Cat()" //
        + "name=" + super.getName(); //
  }



  public static void main(String[] args) {
    // Parent Class -> Animal.class
    // Child Class -> Cat.class

    // Child object inherits Parent object attributes & behaviours
    Cat cat = new Cat();
    // Cat object inherits Parent object
    System.out.println(cat.getAge()); // 0 (default value of int)
    System.out.println(cat.getColor()); // null (default value of String)

    Animal animal = new Animal();
    System.out.println(animal.getAge()); // 0
    // animal.getColor(); // error

    // Cat -> 10, John, Yellow
    Cat cat2 = new Cat("Yellow");



  } // end of main()
}

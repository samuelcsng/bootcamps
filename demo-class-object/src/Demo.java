public class Demo {

  public static void main(String[] args) {
    // memory
    int x = 3;

    // arr -> object reference -> object address
    // int array object (length=2)
    int[] arr = new int[2];

    // cat -> object ref -> cat object address
    // Cat object in memory
    Cat cat = new Cat(); //
    cat.setName("John");
    System.out.println(cat.getName());

    Cat[] cats = new Cat[3];

    // if attribute is private, then you cannot read the attribute directly by obj ref.
    // For example, cat.name and cat.color

    Cat cat2 = new Cat(); //
    String name = "Peter";
    cat2.setName(name);
    System.out.println(cat2.getName());

    cat.getName(); // return this.name;
    cat2.getName(); // return this.name;

    // You cannot use "this" in main
    // System.out.println(this.name);

    // setColor
    cat.setColor("BLACK");
    // getColor
    System.out.println(cat.getColor());

    System.out.println(cat.getAge()); // 0
    cat.setAge(10);
    System.out.println(cat.getAge()); // 10

    Staff staff = new Staff(); // Staff() -> constructor
    staff.setHeight(1.75);
    staff.setWeight(73.25);
    // getBMI() -> class encapsulates complicated behavior
    System.out.println(staff.getBMI()); // 23.91

    Staff staff2 = new Staff("Jenny", "Chan", 1.65, 60.2);
    System.out.println(staff2.getBMI()); // 22.11202938475666



  } // end of main()
}

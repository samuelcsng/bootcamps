public class Staff {
  // 1. attributes
  private int id;
  private double salary;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;
  // private String fullName;

  // 2. empty constructor implicitly exists
  public Staff() {

  }

  public Staff() {
    System.out.println("Creating staff object ...");
    this.salary = 20000;

    // You can preform any logic here...
    // for () {
    // ... if () {
    // }
    // }
  }

  // Class may have more than one constructor
  // constructor signature

  // You can overwrite the old one
  public Staff(String firstName, String lastName, double height,
      double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }

  // All arguments (parameters) constructor
  public Staff(int id, double salary, String firstName, String lastName,
      double height, double weight) {
    this.id = id;
    this.salary = salary;
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }

  // 3. instance method
  // getter
  // setter
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  // Presentation
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public double getBMI() {
    return this.weight / Math.pow(this.height, 2.0);
  }



} // end of class

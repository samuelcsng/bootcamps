public class Customer {
  private int age;
  private String name;



  public Customer(int age) {
    this.age = age;
  }

  public Customer(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }


}

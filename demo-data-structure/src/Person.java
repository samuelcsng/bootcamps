import java.util.Comparator;

public class Person implements Comparator<Person> {
  private String name;
  private int age;
  private HKID hkid; // person.getHKID().getValue()

  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Person("//
        + "name=" + this.name//
        + ", age=" + this.age//
        + ")";
  }

  @Override
  public int compare(Person p1, Person p2) {
    // p1 (-1), p2 (1)
    // return p2.compareTo(p1) > 0 ? 1 : -1;
    return p2.getAge() > p1.getAge() ? 1 : -1;
  }
}

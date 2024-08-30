public class Person implements Walkable, Swimable {

  public Person(){

  }

  @Override
  public void walk(){
    System.out.println("Person is walking ...");
  }
  @Override
  public void swim(){
    System.out.println("Person is swimming ...");
  }

  public static void main(String[] args) {
    Person p1=new Person();
  }

  
  
}

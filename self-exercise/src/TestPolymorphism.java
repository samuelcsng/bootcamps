class Animal {
  void print() {
    System.out.println("Print Animal...");
  }
  void print2(){
    System.out.println("Animal print2() method");
  }
}


class Cat extends Animal {
  @Override
  void print() {
    System.out.println("Print Cat...");
  }

  // @Override
  void catMethod(){
    System.out.println("CatMethod ...");
  }
}


public class TestPolymorphism {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.print();
    animal.print2();
    // animal.catMethod();
    System.out.println(animal.getClass());

    Cat cat = new Cat();
    cat.print();
    cat.print2();
    cat.catMethod();
    System.out.println(cat.getClass());

    Animal cat2 = (Animal) new Cat();
    cat2.print();
    cat2.print2();
    // cat2.catMethod();
    System.out.println(cat2.getClass());

    // Cat animal2 = (Cat) new Animal();
    // Cat animal2 = (Cat) animal;
    // animal2.print();
    // animal2.print2();
    // System.out.println(animal2.getClass());
  } // main()
}

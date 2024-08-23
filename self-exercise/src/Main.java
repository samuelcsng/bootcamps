public class Main {
  public static void main(String[] args) {
    TestClass testClass = new TestClass();
    System.out.println(testClass.int1);

    System.out.println(testClass.getInt2());

    System.out.println(TestClass.int3);
    TestClass.int3 = 8888;
    System.out.println(TestClass.int3);

    // System.out.println(TestClass.int3a); // error
    System.out.println(TestClass.getInt3a());

    System.out.println(TestClass.INT4);
    // TestClass.INT4 = 88888; // error

    // System.out.println(TestClass.INT5); // error
    System.out.println(TestClass.getInt5());
    // TestClass.INT5 = 88888; // error

    testClass.methodInstance();
    // methodInstance(); // error
    // TestClass.methodInstance(); // error

    testClass.methodStatic(); // no error but warning
    System.out.println(TestClass.methodStatic());
    // methodStatic(); // error
    System.out.println(TestClass.methodStatic2());
    System.out.println(TestClass.methodStatic3());

  } // end of main()
}

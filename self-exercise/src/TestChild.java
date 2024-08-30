public class TestChild extends TestPolymorphism {


  public static void main(String[] args) {
    TestPolymorphism testPolymorphism = new TestPolymorphism();
    TestChild testChild = new TestChild();

    System.out.println(testPolymorphism);
    System.out.println(testChild);

    // TestChild upCast = (TestChild) testPolymorphism;
    // System.out.println(upCast);

    // TestPolymorphism dnCast = testChild;
    // System.out.println(dnCast);


    // primitives
    byte byteVar = 10;
    int intVar = 256;
    long longVar = 12345678;

    System.out.println(intVar); // 128

    long longNum = (long) intVar; // upcast (implicit), no risk???
    System.out.println(longNum); // 128
    byte byteNum = (byte) intVar; // downcast (explicit), have risk, need precaution, overflow, 2's complement
    System.out.println(byteNum); // -128



  }
}

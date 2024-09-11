public class DemoParentException {

  public static void main(String[] args) {
    // !!!
    // !!! 1. "catch" can be multiple code block, Similar to "else if". 
    // !!! 2. "catch" has Parent and Polymorphism concepts
    try {
      int x = 10 / 0; // 1
      // "abc".charAt(3);
    } catch (StringIndexOutOfBoundsException e) { // 2
      System.out.println("Caught StringIndexOutOfBoundsException ...");
    } catch (RuntimeException e) { // 3, ArithmeticException come here
      System.out.println("Caught Other RunTimeException ..."); // 4
      if (e instanceof ArithmeticException) {
        System.out.println("It is arithmetic exception ..."); // 5
      }
    } catch (Exception e){
      System.out.println("Other Exceptions ...");
    }
    System.out.println("program ends ..."); // 5
  }
}

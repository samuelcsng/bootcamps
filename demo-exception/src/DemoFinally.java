public class DemoFinally {
  public static void main(String[] args) {
    try {
      System.out.println("try starts ..."); // 1
      "abc".charAt(3);
      System.out.println("try ends ..."); // 2 
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught the Exception");
    } finally{
      System.out.println("finally ..."); // 3, happy or unhappy path still come here ...
    }
    System.out.println("main() ends ..."); // 4

    try {
      System.out.println("try starts ..."); // 1
      "abc".charAt(2);
      System.out.println("try ends ..."); // 2
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught the Exception");
    } finally{
      System.out.println("finally ..."); // 3, happy or unhappy path still come here ...
    }
    System.out.println("program ends ..."); // 4
  }
}

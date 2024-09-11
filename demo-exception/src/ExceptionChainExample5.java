public class ExceptionChainExample5 {
  // !!!! No Exception
  public static void main(String[] args) {
    try {
      method2(10, 0);
    } catch (RuntimeException e) {
      System.out.println("runtime exception ...");
    }
  } // main()

  public static int method1(int x, int y) {
    try {
      return method2(x, y);
    } catch (ArithmeticException e) {
      throw new RuntimeException(); // re-throw another exception
    }
  }

  public static int method2(int x, int y) {
    return x / y;
  }
}

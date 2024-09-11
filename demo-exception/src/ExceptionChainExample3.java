public class ExceptionChainExample3 {
  // !!!! No Exception
  public static void main(String[] args) {
    method1(10, 0); // if there is no one handling the exception along the call stack
    // finally, main() method will throw the exception to JVM.
  } // main()

  public static int method1(int x, int y) {
    // try
    try {
      return method2(x, y); // method2 throw an exception
    } catch (ArithmeticException e) { // catch the exception
      
    }
  }

  public static int method2(int x, int y) {
    return x / y; // throw exception
  }

} // end class



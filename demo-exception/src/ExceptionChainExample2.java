public class ExceptionChainExample2 {
  // !!!! No Exception
    public static void main(String[] args) {
      method1(10, 0); // if there is no one handling the exception along the call stack
      // finally, main() method will throw the exception to JVM.
    } // main()
  
    public static int method1(int x, int y) {
      return method2(x, y);
    }
  
    public static int method2(int x, int y) {
      int a = 100;
      // try
      try {
        return x / y; // throw exception
      } catch (ArithmeticException e) { // catch
        a = -1;
      }
      return a;
    }
  
  } // end class
  

  
}

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // A special type in Java
    // Problem (double, float in Math Operation +,-,*,/)
    System.out.println(0.2 + 0.1); // 0.30000000000000004
    System.out.println(0.2f * 0.1f); // 0.020000001
    System.out.println(0.2f / 0.1f); // 2.0
    System.out.println(0.2f - 0.1f); // 0.1
    System.out.println(0.2 * 0.1); // 0.020000000000000004
    System.out.println(0.2 + 0.2); // 0.4

    double x = 0.2 + 0.1;
    if (x == 0.3) {
      System.out.println("x = 0.3");
    } else {
      System.out.println("x != 0.3");
    }

    // BigDecimal (double)
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    // instance method for Math operations
    double result = bd1.add(bd2).doubleValue();
    System.out.println(result); // 0.3

    // multiply
    System.out.println(bd1.multiply(bd2).doubleValue()); // 0.02
    System.out.println(bd1.multiply(bd2).intValue()); // 0

    // subtract
    System.out.println(bd1.subtract(bd2).doubleValue()); // 0.1

    // divide
    System.out.println(bd1.divide(bd2).doubleValue()); // 2.0

    // for most the cases, you should start with a double primitive
    bd1 = BigDecimal.valueOf(10);
    bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue()); // 3.0
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP)); // 3.333 -> 3.33
    System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING)); // 3.333 -> 3.34

    // Non-terminating decimal expansion
    // bd1.divide(bd2).setScale(2,RoundingMode.HALF_UP).doubleValue(); // 3.333333....

    // For divided by zero, you should have specific handling before divide()
    double m = 0.0;
    if (m == 0.0) {
      result = 0.0;
    } else {
      result = bd1.divide(BigDecimal.valueOf(m), 2, RoundingMode.HALF_UP)
          .doubleValue();
    }
    // java.lang.ArithmeticException
    // System.out.println(bd1.divide(BigDecimal.valueOf(m), 2, RoundingMode.HALF_UP));

    System.out.println(BigDecimal.valueOf(3.440).setScale(2, RoundingMode.UP)); // 3.44
    System.out.println(BigDecimal.valueOf(3.441).setScale(2, RoundingMode.UP)); // 3.45
    System.out
        .println(BigDecimal.valueOf(3.444).setScale(2, RoundingMode.HALF_UP)); // 3.44
    System.out
        .println(BigDecimal.valueOf(3.445).setScale(2, RoundingMode.HALF_UP)); // 3.45

    // equals()
    System.out.println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0))); // false
    System.out.println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0))); // true
    System.out.println(BigDecimal.valueOf(10L).doubleValue()==BigDecimal.valueOf(10.0).doubleValue()); // true

    // compareTo()
    System.out.println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0))); // 0
    System.out.println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0))); // 1
    System.out.println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0))); // -1


  } // end of main()
}

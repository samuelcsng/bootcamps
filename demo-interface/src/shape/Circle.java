package shape;

import java.math.BigDecimal;

public class Circle implements Shape {
  private double radius;

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.pow(radius, 2.0))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }
}

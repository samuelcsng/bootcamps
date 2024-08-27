package shape;

import java.math.BigDecimal;

// The implications of "extends Shape": obtains color attribute
public class Circle extends Shape { // Circle.class -> concrete class has to implement all abstract methods
  private double radius;
  private Color color;

  public Circle(double radius) {
    super(); // empty constructor -> optional
    this.radius = radius;
  }

  public Circle(double radius, Color color){
    super();
    this.radius=radius;
    this.color = color;
  }

  // Override -> Same Method signature
  // "@" -> annotation (for compiler to read)
  @Override // Ask compiler to check if the parent class contains area() method.
  // if no, compile error.
  // If you do not annotate it, it still override the method, coz they are same method signature
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.5);
    System.out.println(circle.area()); // 38.48451000647496
  }

}

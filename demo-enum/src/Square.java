import java.math.BigDecimal;

public class Square {
  private double length;
  // private String color;
  private Color color;

  // getter and constructor
  public Square(double length, Color color) {
    // length <0
    this.length = length;
    this.color = color;
  }

  // Square.ofRed(3)
  public static Square ofRed(double length) {
    return new Square(length, Color.ofRED());
  }

  public double getLength() {
    return this.length;
  }

  public Color getColor() {
    return this.color;
  }

  public double area() {
    // return Math.pow(this.length, 2);
    return BigDecimal.valueOf(this.length) //
        .multiply(BigDecimal.valueOf(this.length)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Color red = Color.ofRED();

    // Square s1 = new Square(4.0d, Color.ofRED());
    Square s1 = new Square(4.0d, red);
    System.out.println(s1.area());

    // Square s2 = new Square(4.0d, Color.ofRED()); // new Color(RED)
    // Square s3 = new Square(4.0d, Color.ofRED());
    Square s2 = new Square(4.0d, red); // new Color(RED)
    Square s3 = new Square(4.0d, red);

    // new Square(3.2d, red);
    Square s4 = Square.ofRed(3.2d);


    // Do we really need ore than one Red Color object?


  } // end of main()
}

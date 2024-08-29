package shape;

// 2D
// public class Shape {
public abstract class Shape {
  private Color color; // enum object default value -> null

  public Shape() {

  }

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  // public double area() {
  // return -1.0d;
  // }

  // After defining the concrete class (non-abstract) become abstract,
  // 1. we can create abstract method (without implementation)
  // 2. cannot create object for Abstract Class (only extends)
  // 3. Abstract class can still hold its own attributes
  // 4. The constructor in abstract class is for child class to invoke/call
  // 5. by default all abstract method must be public

  // public abstract double area();

  abstract double area();

  public static void main(String[] args) {
    // Shape shape = new Shape();
    // System.out.println(shape.area()); -1.0


  } // end of main()
}

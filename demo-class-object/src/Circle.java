public class Circle {
  // label is NOT object reference
  // String Object "LAB" exists, even though there is no circle object created.
  private static String label = "LAB"; // stack memory

  // radius is obj ref
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public static String getLabel1() {
    return label;
  }

  // !!!!!
  // static method NEVER return instance variable
  // public static double getRadius2(){
  // return this.radius;
  // }

  public String getLabel2() {
    return label;
  }

  // Presentation
  public double area() {
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(2.0);
    System.out.println(circle.area()); // 12.566370614359172

    // because "lable" is a static variable, so it does not belongs to any Circle object
    // Way to static method
    Circle.getLabel1(); // return static variable

    // Way to instance method
    // Every circle object has getLabel2() method
    new Circle(3.3).getLabel2(); // return static variable
    new Circle(4.5).getLabel2(); // return static variable
    new Circle(10.2).getLabel2(); // return static variable
    new Circle(20.9).getLabel2(); // return static variable

    new Circle(10.2).getLabel1();
    // technical OK, but you should not call static method in this way
    // we should call it by "Circle.getLabel1()"



  } // end of main()
}

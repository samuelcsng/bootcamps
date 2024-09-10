package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Shape {
  private Color color;

  abstract double area();

  // With Generics (lower boundary = <T extends Shape>)
  // !!!!!!! List<Shape> OR List<Circle> OR List<Square>
  public static <T extends Shape> double totalArea(List<T> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // With Generics (upper boundary - <? super Shape>)
  // !!! What object can we pass into this method?
  // !!!!!!!! List<Shape> OR ... List<Any Parent Type of Shape>
  public static double totalArea3(List<? super Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Object shape : shapes) {
      bd =bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // Without Generics
  public static double totalArea2(List<Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    // Without Generics
    List<Shape> shapes = new ArrayList<>(
        Arrays.asList(new Circle(3.0), new Square(3.0), new Circle(4.0)));
    System.out.println(totalArea2(shapes)); //

    // With Generics (Lower Boundary)
    System.out.println(totalArea(shapes)); //
  }

}

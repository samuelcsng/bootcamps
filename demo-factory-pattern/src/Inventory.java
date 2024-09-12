import java.util.ArrayList;
import java.util.List;

public class Inventory {
  // public static int modernChairCount = 0;
  // public static int modernSofaCount = 0;
  // public static int victorianChairCount = 0;
  // public static int victorianSofaCount = 0;

  public List<Furniture> furnitures = new ArrayList<>();

  public void add(Style style) {
    for (Furniture furniture : furnitures) {
      System.out.println(furniture);
    }
  }
}

public class Demo {

  public static int totalCheckoutAmount(List<Furniture> furnitures) {
    int total = 0;
    for (Furniture furniture : furnitures) {
      total += furniture.getPrice() * furniture.getQuantity();
    }
  }

  public static void main(String[] args) {
    // new FurnitureFactory().
  }
}

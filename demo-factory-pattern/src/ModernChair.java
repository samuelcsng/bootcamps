public class ModernChair implements Chair {
  private int price;
  private int quantity;

  public int getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public boolean hasLegs() {
    return false;
  }

  @Override
  public void sitOn() {
    System.out.println("Modern Chair sitOn() ...");
  }

}

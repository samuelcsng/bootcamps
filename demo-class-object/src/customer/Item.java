package customer;

import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;

  // constructor
  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  // getter(), setter()
  public double getPrice() {
    return this.price;
  }

  public double getQuantity() {
    return this.quantity;
  }

  // Not a must to use BigDecimal (double * int)
  public double totalValue() {
    // int * double -> 1.0 * 0.2
    // double * double -> 0.1 * 0.2
    BigDecimal total = BigDecimal.valueOf(0);
    total = BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity));
    // multiply() -> return a new BigDecimal Object
    return total.doubleValue();
  }



}

end of
class

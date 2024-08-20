package customer;

import java.math.BigDecimal;

public class User {
  private Order[] orders; // Order[] object

  public User() {
    this.orders = new Order[0];
  }

  public User(Order[] orders) {
    this.orders = orders;
  }

  public void add(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  public Order[] getOrders() {
    return this.orders;
  }

  public boolean isVIP() {
    return this.totalTransactionAmount() >= 100000;
  }

  // Unit Test
  public double totalTransactionAmount() {
    BigDecimal total = new BigDecimal(0.0);
    for (int i = 0; i < orders.length; i++) {
      total = total.add(BigDecimal.valueOf(this.orders[i].totalValue()));
    }
    return total.doubleValue();
  }

  // public void setOrders(Order[] orders) {
  // this.orders = orders;
  // }

  // Presentation
  public int getNumberOfOrders() {
    return orders.length;
  }

  public static void main(String[] args) {
    User john = new User(); // User -> Order Array -> Order

    john.totalTransactionAmount();

    john.isVIP();
  }

}

package customer;

public class User {
  private Order[] orders;

  public User(Order[] orders) {
    this.orders = orders;
  }

  public Order[] getOrders() {
    return orders;
  }

  // public void setOrders(Order[] orders) {
  //   this.orders = orders;
  // }

  // Presentation
  public int getNumberOfOrders(){
    return orders.length;
  }

}

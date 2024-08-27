public class Order {
  // Item[] items;
  private Status status; // PAID, READY_TO_SHIP, SHIPPING, DELIVERED
  // ...

  // constructor

  public boolean isStockAvailable() {
    return 
  }

  public void nextStatus() {
    this.status = this.status.next();
  }

  public Status getStatus() {
    return this.status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public static void main(String[] args) {
    Order order = new Order();
    order.setStatus(Status.PAID); // validation

    System.out.println(order.getStatus()); // PAID

    for (Item items:)
    order.nextStatus(); // void (PAID -> READY_TO_SHIP)

    System.out.println(order.getStatus(); // READY_TO_SHIP



  } // end of main()
}

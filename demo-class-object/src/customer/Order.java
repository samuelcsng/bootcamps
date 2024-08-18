package customer;

public class Order {
  private Item[] items;

  //
  public Order(Item[] items) {
    this.items = items;
  }

  public Item[] getItems() {
    return this.items;
  }

  // public void setItems(Item[] items) {
  // this.items = items;
  // }

  // Presentation
  public int getNumberOfItems() {
    return items.length;
  }



} // end of class

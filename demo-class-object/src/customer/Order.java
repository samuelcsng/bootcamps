package customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  private static int count = 0;

  private int id; // system generate id
  private Item[] items; // one to many
  private String currency; // one to one

  public Order() {
    this.id = getId();
    this.items = new Item[0]; // fixed length
  }

  //
  public Order(Item[] items) {
    this.items = items;
    // this.items=Arrays.copyOf(items, items.length);
  }

  // static method
  public static int getId() {
    return ++count;
  }

  // Method Signature: method name + parameter list (number + type)
  public void add(Item item) {
    // // Item[] newItems = Arrays.copyOf(this.items, this.items.length);
    // Item[] newItems = new Item[this.items.length + 1];
    // // code ...
    // for (int i = 0; i < newItems.length; i++) {
    // if (i < this.items.length) {
    // newItems[i] = this.items[i];
    // } else {
    // newItems[i] = item;
    // }
    // }
    // this.items = newItems;

    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }



  public void remove(int index) { // i.e. length 4 -> length 3
    if (index > this.items.length - 1 && index >= 0)
      return;
    Item[] newItems = new Item[this.items.length - 1];
    int idx = 0;
    for (int i = 0; i < this.items.length; i++) {
      if (i != index) {
        newItems[idx++] = this.items[i];
      }
    }
    this.items = newItems;
  }

  public Item[] getItems() {
    return this.items;
    // return Arrays.copyOf(this.items, this.items.length);
  }

  public void setItems(Item[] items) {
    this.items = items;
    // this.items=Arrays.copyOf(items, items.length);
  }

  // Presentation
  public int getNumberOfItems() {
    return items.length;
  }

  public double totalValue() {
    // double + double -> BigDecimal
    BigDecimal total = new BigDecimal(0.0);
    for (int i = 0; i < this.items.length; i++) {
      total = total.add(BigDecimal.valueOf(this.items[i].totalValue()));
    }
    return total.doubleValue();
  }



} // end of class

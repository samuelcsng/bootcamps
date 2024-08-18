package customer;

import java.beans.Customizer;

public class Shopping {
  public static void main(String[] args) {
    // Create customer
    // User user = new User();

    // Create order
    // Order order1 = new Order();
    // Item item11 = new Item(1.1, 10);
    // Item item12 = new Item(2.2, 20);
    // Item[] items1 = new Item[] {item11, item12};
    // order1.setItems(items);

    // Order order2 = new Order();
    // Item item21 = new Item(1.1, 10);
    // Item item12 = new Item(2.2, 20);
    // Item[] items = new Item[] {item11, item12};
    // order1.setItems(items);

    // user.orders = new Order[] {order1, order2};
    // user.orders[0].items = new Item[] {new Item(1.1, 10), new Item(2.2, 20)};
    // user.orders[1].items = new Item[] {new Item(3.3, 30), new Item(4.4, 40)};

    // Create item
    Item apple = new Item(10.99, 4);
    Item orange = new Item(11.9, 2);
    Item[] items = new Item[] {apple, orange};
    Order order = new Order(items);

    Item apple2 = new Item(10.99, 4);
    Item orange2 = new Item(11.9, 2);
    Item[] items2 = new Item[] {apple2, orange2};
    Order order2 = new Order(items2);

    User user = new User(new Order[] {order, order2});
    System.out.println(user.getNumberOfOrders());
    System.out.println(user.getOrders()[0].getNumberOfItems());
    System.out.println(user.getOrders()[1].getNumberOfItems());


  }
}

package linkedlistDemo;

import java.util.LinkedList;

public class Node {
  private Node next;
  private Customer customer;

  // public Node() {

  // }

  public Node(Customer customer) {
    this.customer = customer;
  }

  public Node(Customer customer, Node next) {
    this.customer = customer;
    this.next = next;
  }

  // Normal getter
  public Node getNext() {
    return this.next;
  }

  // Normal getter
  public Customer getCustomer() {
    return this.customer;
  }

  // instance method
  // return this.arr[index];
  public int get(int index) {
    int count = 0;
    Box head = this.next;
    while (head != null) {
      // ...
      if (++count > index) {
        return this.value;
      }
      head = head.next;
    }
    return -1;
  }

  public Box getTail() {
    Box head = this;
    while (head.next != null) {
      head = head.next;
    }
    return head;
  }

  @Override
  public String toString() {
    Node head = this;
    StringBuilder sb = new StringBuilder("Node(");
    while (head != null) {
      sb.append(head.getCustomer());
      head = head.next;
      sb.append(",");
    }
    return sb.append(")").toString();
  }

  public static void main(String[] args) {
    // 3 ways to store a list of value of same type
    // [3, 10, 7] -> 1. array 2. arraylist 3. linkedlist

    // Explanation of Linked List
    Box stringList = new Box(3, new Box(10, new Box(7)));

    // get the first element
    System.out.println(stringList.getValue()); // 3
    // get the second element
    System.out.println(stringList.getNext().getValue()); // 10
    // get the third element
    System.out.println(stringList.getNext().getNext().getValue()); // 7

    // Add new element at head position
    stringList = new Box(100, stringList);
    System.out.println(stringList.getValue()); // 100

    // Add new element at tail position
    Box tail = stringList.getTail();
    tail.next = new Box(200);

    System.out.println(stringList); // Box(100,3,10,7,200,)

    // !!!!
    LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
    integerLinkedList.add(3);
    integerLinkedList.add(10);
    integerLinkedList.add(7);
    System.out.println(integerLinkedList); // [3, 10, 7]



  }
}
// package linkedlistDemo;

// import java.util.LinkedList;
// import java.util.List;

// // Similar to Box
// // List<Customer> = new LinkedList<Customer>();
// // Customer.class -> name, age

// public class Node {
//   Customer customer;
//   private Node next;

//   public Node(Customer customer, Node next) {
//     this.next = next;
//     this.customer = customer;
//   }



//   public static void main(String[] args) {
//     Customer c1 = new Customer("custName1", 9);
//     System.out.println(c1);
//     Customer c2 = new Customer("custName2", 99);
//     System.out.println(c2);

//     List<Customer> customerLinkedList = new LinkedList<Customer>();
//     customerLinkedList.add(c1);
//     customerLinkedList.add(c2);

//     // System.out.println(customerLinkedList.get(0));
//     // System.out.println(customerLinkedList.get(0).getName());
//     // System.out.println(customerLinkedList.get(0).getAge());

//     // System.out.println(customerLinkedList.get(1));
//     // System.out.println(customerLinkedList.get(1).getName());
//     // System.out.println(customerLinkedList.get(1).getAge());

//     System.out.println("");
//     for (Customer customer : customerLinkedList) {
//       System.out.println(customer);
//       // System.out.println(customer.getName());
//       // System.out.println(customer.getAge());
//       System.out.println(customer.hashCode());
//     }


//   } // end of main()
// }

package linkedList;

public class Node {
  int value;
  Node next;

  // constructor
  public Node() {}

  public Node(int value) {
    this.value = value;
  }

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node:(" //
        + "value=" + this.value //
        // + ", next=" + this.next //
        + ")";
  }

  public static void main(String[] args) {
    Node head = new Node(0);
    System.out.println(head);
    System.out.println(head.value);
    System.out.println(head.next);

    Node second = new Node(1);
    System.out.println(second);
    System.out.println(second.value);
    System.out.println(second.next);

    head.next = second;
    System.out.println(head);
    System.out.println(head.value);
    System.out.println(head.next);

    System.out.println(second);

    Node third = new Node(2);
    second.next = third;
    Node fourth = new Node(3);
    third.next = fourth;
    Node fifth = new Node(4);
    fourth.next = fifth;
    Node sixth = new Node(5);
    fifth.next = sixth;
    Node seventh = new Node(6);
    sixth.next = seventh;
    Node eighth = new Node(7);
    seventh.next = eighth;
    Node ninth = new Node(8);
    eighth.next = ninth;
    Node tenth = new Node(9);
    ninth.next = tenth;

    System.out.println("\nloop a linked list...");
    Node aux = head;
    int count = 0;
    while (aux != null) {
      // if (aux.value == 0)
      System.out.println(count + " " + aux);
      aux = aux.next;
      count++;
    }

    System.out.println("\nloop-if a linked list...");
    aux = head;
    count = 0;
    while (aux != null) {
      if (aux.value % 2 == 0) {
        System.out.println(count + " " + aux);
      }
      aux = aux.next;
      count++;
    }

    System.out.println("\nloop-if a linked list...add node");
    Node newHead = null;

    Node newAux = null;
    aux = head;
    count = 0;
    while (aux != null) { // check if end of linkedList
      if (aux.value % 2 == 1 && aux.value % 3 == 1) {
        System.out.println(count + " " + aux);
        if (newHead == null) { // if empty linkedList, create new 
          newHead = new Node(aux.value); // create first Node
          newAux = newHead;
        } else { // else add tail
          newAux.next = new Node(aux.value);
          newAux = newAux.next;
        }
      }
      aux = aux.next;
      count++;
    }

    System.out.println("\nloop a linked list...result");
    // aux = head;
    aux = newHead;
    count = 0;
    while (aux != null) {
      // if (aux.value == 0)
      System.out.println(count + " " + aux);
      aux = aux.next;
      count++;
    }

  } // main()
}

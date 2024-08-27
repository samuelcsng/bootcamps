package deck;

import java.util.Arrays;

public enum Suit2 {
  // create enum objects
  // DIAMOND, // call empty constructor
  DIAMOND(1), //
  CLUB(2), //
  HEART(3), //
  SPADE(4), //
  ;

  private final int value; // no setter

  private Suit2(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // public void setValue(int value) {
  // this.value = value;
  // }

  //
  public int compare(Suit2 suit) {
    if (this == suit)
      return 0;
    return this.value > suit.getValue() ? 1 : -1;
  }

  public int length(){
    // values()
    return Suit2.values().length;
  }

  // values() method implicitly created by JAVA
  public static Suit2 get(int value) {
    for (Suit2 suit : Suit2.values()) {
      if (suit.getValue() == value) {
        return suit;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    // Load classes to Memory
    // enum -> create objects for enum
    // static/ static final
    // start to read your code in main method

    Suit2 suit = Suit2.CLUB;
    System.out.println(suit);
    System.out.println(Suit2.CLUB);
    System.out.println(Suit2.class);
    System.out.println(suit.compare(Suit2.SPADE));

    // enum.class compareTo() by default checking address
    System.out.println(Suit2.HEART.compareTo(Suit2.HEART)); // 0
    System.out.println(Suit2.CLUB.compareTo(Suit2.HEART)); // 1
    System.out.println(Suit2.SPADE.compareTo(Suit2.HEART)); // 2

    // equals() -> result OK
    Suit2 unknown = Suit2.HEART;
    System.out.println(unknown.equals(Suit2.HEART)); // true
    System.out.println(unknown == Suit2.HEART); // true
    System.out.println(unknown != Suit2.HEART); // false

    // Suit2.CLUB.setValue(3);
    System.out.println(Suit2.CLUB.getValue()); // 2

    System.out.println(Suit2.DIAMOND.name()); // "DIAMOND"
    System.out.println(Suit2.DIAMOND.toString()); // "DIAMOND"

    // ordinal() -> index
    System.out.println(Suit2.CLUB.ordinal());
    System.out.println(Suit2.HEART.ordinal());

    System.out.println(Suit2.CLUB.getValue()); // 2

  } // end of main()

}


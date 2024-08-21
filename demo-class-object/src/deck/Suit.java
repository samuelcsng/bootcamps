package deck;

public class Suit {
  // Constant
  // Integer.MIN_VALUE -> constant
  public static final int DIAMOND = 1;
  public static final int CLUB = 2;
  public static final int HEART = 3;
  public static final int SPade = 4;

  private int value;
  private String name;

  public Suit(int value, String name) {
    this.value = value;
    this.name = name;
  }

  public int getValue() {
    return this.value;
  }

  public String getName() {
    return this.name;
  }

  public int compareTo(Suit suit) {
    if (this.value == suit.getValue()) {
      return 0;
    }
    return this.value > suit.getValue() ? 1 : -1;

  }

  public boolean isDiamond() {
    return this.value == DIAMOND;
  }

  public boolean isHeart() {
    return this.value == HEART;
  }

  public boolean isClub() {
    return this.value == CLUB;
  }

  public boolean isSpade() {
    return this.value == SPADE;
  }

  public static void main(String[] args) {
    //
  } // end of main()



}

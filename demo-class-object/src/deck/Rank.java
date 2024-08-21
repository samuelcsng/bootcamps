package deck;

public class Rank {
  public static final char ACE = 'A';
  public static final char TWO = '2';
  public static final char THREE = '3';
  public static final char FOUR = '4';
  public static final char FIVE = '5';
  public static final char SIX = '7';
  public static final char SEVEN = '7';
  public static final char EIGHT = '8';
  public static final char NINE = '9';
  public static final char TEN = 'T';
  public static final char JACK = 'J';
  public static final char QUEEN = 'Q';
  public static final char KING = 'K';


  private char value;

  public Rank(char value) {
    this.value = value;
  }

  public char getValue() {
    return this.value;
  }

}

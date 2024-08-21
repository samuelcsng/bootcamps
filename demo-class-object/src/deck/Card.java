package deck;

public class Card {
  public static final int DIAMOND = 1;
  public static final int CLUB = 2;
  public static final int HEART = 3;
  public static final int SPade = 4;

  // !!!
  // Make you know the difference between instance variable, static variable, static final variable

  // String -> good presentation, built-in equals() & compareTo()
  private char rank; // A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K
  private String suit; // DIAMOND, CLUB, HEART, SPADE
  private Suit suit2;

  public Card(char rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Card(char rank, Suit suit2) {
    this.suit2 = suit2;
  }

  // get, set
  public char getRank() {
    return this.rank;
  }

  public String getSuit() {
    return this.suit;
  }

  public int compareSuitTo(Card card) {
    int result = 0;
    if (this.getSuit() == "SPADE") {
      switch (card.getSuit()) {
        case "SPADE":
          result = 0;
          break;
        case "HEART":
        case "CLUB":
        case "DIAMOND":
          result = 1;
          break;
      }
    }
    if (this.getSuit() == "HEART") {
      switch (card.getSuit()) {
        case "SPADE":
          result = -1;
          break;
        case "HEART":
          result = 0;
          break;
        case "CLUB":
        case "DIAMOND":
          result = 1;
          break;
      }
    }
    if (this.getSuit() == "CLUB") {
      switch (card.getSuit()) {
        case "SPADE":
        case "HEART":
          result = -1;
          break;
        case "CLUB":
          result = 0;
          break;
        case "DIAMOND":
          result = 1;
          break;
      }
    }
    if (this.getSuit() == "DIAMOND") {
      switch (card.getSuit()) {
        case "SPADE":
        case "HEART":
        case "CLUB":
          result = -1;
          break;
        case "DIAMOND":
          result = 0;
          break;
      }
    }
    return result;
  }

  public int compareRankTo(Card card) {
    int result = 0;
    if (this.getRank() == 'A') { // A
      switch (card.getRank()) {
        case 'A':
          result = 0;
          break;
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == 'K') { // K
      switch (card.getRank()) {
        case 'A':
          result = -1;
          break;
        case 'K':
          result = 0;
          break;
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == 'Q') { // Q
      switch (card.getRank()) {
        case 'A':
        case 'K':
          result = -1;
          break;
        case 'Q':
          result = 0;
          break;
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == 'J') { // J
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
          result = -1;
          break;
        case 'J':
          result = 0;
          break;
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == 'T') { // T
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
          result = -1;
          break;
        case 'T':
          result = 0;
          break;
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '9') { // 9
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
          result = -1;
          break;
        case '9':
          result = 0;
          break;
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '8') { // 8
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
          result = -1;
          break;
        case '8':
          result = 0;
          break;
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '7') { // 7
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
          result = -1;
          break;
        case '7':
          result = 0;
          break;
        case '6':
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '6') { // 6
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
          result = -1;
          break;
        case '6':
          result = 0;
          break;
        case '5':
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '5') { // 5
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
          result = -1;
          break;
        case '5':
          result = 0;
          break;
        case '4':
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '4') { // 4
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
          result = -1;
          break;
        case '4':
          result = 0;
          break;
        case '3':
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '3') { // 3
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
          result = -1;
          break;
        case '3':
          result = 0;
          break;
        case '2':
          result = 1;
          break;
      }
    }
    if (this.getRank() == '2') { // 2
      switch (card.getRank()) {
        case 'A':
        case 'K':
        case 'Q':
        case 'J':
        case 'T':
        case '9':
        case '8':
        case '7':
        case '6':
        case '5':
        case '4':
        case '3':
          result = -1;
          break;
        case '2':
          result = 0;
          break;
      }
    }

    return result;
  }

  public int compareTo(Card card) {
    int result = 0;
    if (this.compareRankTo(card) == 1) {
      result = 1;
    } else if (this.compareRankTo(card) == 0) {
      if (this.compareSuitTo(card) == 1) {
        result = 1;
      } else if (this.compareSuitTo(card) == 0) {
        result = 0;
      } else {
        result = -1;
      }
    } else if (this.compareRankTo(card) == -1) {
      result = -1;
    }
    return result;
  }

  public static int compareTwoCard(Card card1, Card card2) {
    return card1.compareTo(card2);
  }

  public static void main(String[] args) {
    Card c1 = new Card('A', "CLUB");
    Card c2 = new Card('A', "DIAMOND");
    Card c3 = new Card('A', "CLUB");
    Card c4 = new Card('2', "CLUB");

    System.out.println(c2.compareTo(c1)); // -1
    System.out.println(c1.compareTo(c2)); // 1
    System.out.println(c1.compareTo(c3)); // 0
    System.out.println(c1.compareTo(c4)); // 1

    System.out.println(compareTwoCard(c1, c2)); // 1
    System.out.println(compareTwoCard(c2, c1)); // -1

    // Card.CLUB = 10; // final variable cannot be modified


  } // end of main()


}

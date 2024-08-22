package deck;

import java.util.Arrays;
import java.util.Random;

public class Deck {
  private static final Suit[] suits = new Suit[] {Suit.ofDiamond(),
      Suit.ofClub(), Suit.ofHeart(), Suit.ofSpade()};
  private static final Rank[] ranks = new Rank[] {Rank.ofACE(), Rank.ofTWO(),
      Rank.ofTHREE(), Rank.ofFOUR(), Rank.ofFIVE(), Rank.ofSIX(),
      Rank.ofSEVEN(), Rank.ofEIGHT(), Rank.ofNINE(), Rank.ofTEN(),
      Rank.ofJACK(), Rank.ofQUEEN(), Rank.ofKING(),};

  private Card[] cards;

  // NPE - null pointer exception
  public Deck() {
    this.cards = new Card[suits.length * ranks.length]; // initialize empty array !
    // create 52 cards, and then put it into Deck Object
    // for-each
    // 13 x 4
    int idx = 0;
    for (Suit suit : suits) {
      for (Rank rank : ranks) {
        this.cards[idx++] = new Card(rank, suit);
      }
    }
  }

  public int size() {
    return this.cards.length;
  }

  public String toString() {
    return "Deck(" //
        + "cards=" + Arrays.toString(this.cards) //
        + ")";
  }

  // Deck Object behavior
  public void shuffle() {
    System.out.println("\nshuffling...\n");
    // method 1
    // Random rand = new Random();
    // for (int i = 0; i < this.cards.length; i++) {
    // int randomIndexToSwap = rand.nextInt(this.cards.length);
    // Card temp = this.cards[randomIndexToSwap];
    // this.cards[randomIndexToSwap] = this.cards[i];
    // this.cards[i] = temp;
    // }

    // method 2
    int idx = new Random().nextInt(52-2); // 0 - 51
    int number = new Random().nextInt(52 - 2 - idx) + 1;
    // Part 1: begin=0, end=idx
    // Part 2: begin=idx+1, end=idx+number
    // Part 3: begin=idx+number+1, end=51

    // new Array
    Card[] newCards = new Card[52];
    // for loop
    int c = 0;
    // Part 2 first
    for (int i = idx + 1; i < idx + number + 1; i++) {
      newCards[c++] = this.cards[i];
    }
    // Part 1 middle
    for (int i = 0; i < idx + 1; i++) {
      newCards[c++] = this.cards[i];
    }
    // Part 3 bottom
    for (int i = idx + number + 1; i < 52; i++) {
      newCards[c++] = this.cards[i];
    }
    this.cards = newCards;

  }

  public static void main(String[] args) {
    Deck deck = new Deck(); // Card ?
    System.out.println(deck.size()); // 0

    // Without toString(), sysout custom object -> object reference (i.e.
    // deck.Deck@8bcc55f)
    System.out.println(deck); // System.out.println(deck.toString())
    deck.shuffle();
    System.out.println(deck);



  } // end of main()



}

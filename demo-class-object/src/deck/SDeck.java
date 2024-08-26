package deck;

public class SDeck {
  // !!! final -> array object cannot be changed
  private final Card[] cards = new Card[52];

  public SDeck() {

  }

  public Card[] getCards() {
    return this.cards;
  }

}

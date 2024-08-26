package deck;

public class RuleManager {
  public boolean isPair(Card card1, Card card2) {
    return new PairManager(card1, card2).isPair();
  }

  public static void main(String[] args) {
    RuleManager ruleManager = new RuleManager();
    ruleManager.isPair(Card.of(Rank.ofACE(), Suit2.DIAMOND),
        Card.of(Rank.ofFIVE(), Suit2.CLUB));

    System.out.println(result);
  }
}

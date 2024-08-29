package deck;

public class Rank3 extends Rank {
  private char value;

  private Rank3(char value) {
    this.value = value;
  }

  public char getValue(){
    return this.value;
  }

  // @Override
  public int compareTo(Rank3 rank) {
    // Early return
    if (this.getValue() != rank.getValue()) {
      // if (this.getValue() == TWO)
      //   return 1;
      // if (rank.getValue() == TWO)
      //   return -1;
      if (this.getValue() == ACE)
        return 1;
      if (rank.getValue() == ACE)
        return -1;
      if (this.getValue() == KING)
        return 1;
      if (rank.getValue() == KING)
        return -1;
      if (this.getValue() == QUEEN)
        return 1;
      if (rank.getValue() == QUEEN)
        return -1;
      if (this.getValue() == JACK)
        return 1;
      if (rank.getValue() == JACK)
        return -1;
      if (this.getValue() == TEN)
        return 1;
      if (rank.getValue() == TEN)
        return -1;
      return this.getValue() > rank.getValue() ? 1 : -1; // 3 - 9
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Rank3(" //
        + "value=" + this.value //
        + ")";
  }

  public static void main(String[] args) {
    Rank3 rank3TWO=new Rank3(TWO);
    Rank3 rank3ACE=new Rank3(ACE);
    System.out.println(rank3TWO.getValue());
    System.out.println(rank3ACE.getValue());
    System.out.println(rank3TWO.compareTo(rank3ACE));
    System.out.println(rank3ACE.compareTo(rank3TWO));
    System.out.println(rank3ACE.compareTo(rank3ACE));
  }

}

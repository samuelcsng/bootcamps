public class Subject {
  private int score;
  private String desc;

  public Subject(int score, String desc) {
    this.score = score;
    this.desc = desc;
  }

  public int getScore(){
    return this.score;
  }
  public String getDesc(){
    return this.desc;
  }
}

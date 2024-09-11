package staticnested;

public class Outer {
  private int x;

  
  public Outer(int x) {
    this.x = x;
  }

  public int getY(){
    int gettedY = new StaticClass(0).getY();
    return gettedY;
  }

  static class StaticClass{
    private int y;

    public StaticClass(int y) {
      this.y = y;
    }

    public int getY() {
      return this.y;
    }

    public void setY(int y) {
      this.y = y;
    }
  }

  public static void main(String[] args) {
    Outer outer1 = new Outer(1);
    
  }
}

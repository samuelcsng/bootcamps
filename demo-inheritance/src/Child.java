public class Child extends Parent {

  private double y;
  private byte age;

  // Two 

  // calling super() implicitly
  public Child() {

  }

  public Child(String s) {
    super(s);
  }

  public Child(int x){
    super(x, (byte) 0);
  }

  public Child(int x, double y) {
    super(x);
    this.y = y;
  }

  public byte getB(){
    // return this.b; // super.b
    return super.b;
  }

  // JVM machine -> java object(heap)
  public static void main(String[] args) {
    // Once you decided to extend a parent class
    // all child object has an "inside object"
    // so, all child constructor has to "super"
    Child child = new Child(); // inside object

    Child c2 = new Child(10);

    // value 20 goes to Parent object
    Child c3 = new Child(20, 99.9);

    c3.sleep();
    // c2's parent object is not same as c3's parent




  } // end of main()
}

public class Box {
  private long[] arr;

  public Box() {
    this.arr = new long[0]; // !!! VIP
  }

  public Box(long[] arr) {
    this.arr = arr;
  }

  public int size() {
    return this.arr.length;
  }

  public void setArr(long[] arr) {
    this.arr = arr;
  }

  public long[] getArr() {
    return this.arr;
  }

  public long getLongValue(int index) {
    // index -> negative?
    return this.arr[index];
  }

  public long totalLongValue() {
    int sum = 0;
    for (int i = 0; i < this.arr.length; i++) {
      sum += this.arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    Box box = new Box(); // Box object exits
    box.size(); // 0

    // If there is no custom constructor and no setter
    // then the array cannot be initialized
    // arr is null pointer exception

    // 2 ways to solve (either):
    // 1. Custome Constructor
    // but the implicit empty constructor will be removed
    // and then you can still create "custom empty constructor"

    // arr with length 0
    int[] arr = new int[] {}; // OK, fixed length array (length=0)
    // arr[0] = 1; // NOT OK, runtime error

    // 2. setter
    Box box2 = new Box();
    box2.setArr(new long[] {8L, 4, (byte) 10});

    long result = box2.getArr()[1]; // 4
    System.out.println(result);

    result = box2.getLongValue(2);
    System.out.println(result); // 10


  } // end of main()
}

import java.util.Arrays;

public class BigBox {
  private Box box;

  public BigBox() {};

  public BigBox(Box box) {
    this.box = box;
  }

  //
  public long BoxValue() { // b3 -> boxValue() -> totalLongValue()
    return this.box.totalLongValue();
  }

  public static void main(String[] args) {
    BigBox bb = new BigBox();
    // heap memory
    // BigBox object ref (stack memory)
    // -> BigBox object (box obj ref)
    // -> Box Object (long[] obj ref)
    // -> long[] object
    // -> lots of array

    Box backup = new Box(new long[] {1, 2});
    BigBox bb2 = new BigBox(backup); // OK

    System.out.println(Arrays.toString(backup.getArr())); // [1, 2]

    // for bb3, you lost the Box object address
    // and if you do not provide any access method to box object
    // then you are no longer reaching it.
    BigBox bb3 = new BigBox(new Box(new long[] {1, 2}));
    System.out.println(bb3.BoxValue());


  } // end of main()
}

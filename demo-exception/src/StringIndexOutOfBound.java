public class StringIndexOutOfBound {
  public static void main(String[] args) {
    // char[]
    try {
      "abc".charAt(3);
      // substring(startIdx, endIdx)
      // 
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("idx is out of bound.");
    }
  }
}

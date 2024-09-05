import java.util.HashSet;

public class ArrayToHashSet {
  public static void main(String[] args) {
    int[] arr = { -100, 2, 2, 2, 2, 1, 2, 3, 4, 5, 5 };
    HashSet<Integer> result = new HashSet<>();
    for (int num : arr) {
      result.add(num);
    }
    System.out.println(result);
  }
}

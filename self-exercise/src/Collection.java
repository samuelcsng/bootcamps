import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {
  public static void main(String[] args) {
    int[] integers = new int[] {1, 2, 3, 4, 5, 6};
    List<Integer> integersList = //
        Arrays.stream(integers) //
            .boxed() //
            .collect(Collectors.toList()) //
    ;
    System.out.println(integersList);
  }
}

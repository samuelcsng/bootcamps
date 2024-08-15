public class DemoForEachLoop {
  public static void main(String[] args) {

    // for loop
    int[] arr = new int[] {2, 9, 10, -3};

    // i -> array index
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " " + arr[arr.length - 1]);
    }
    // print out elements

    // for-each loop
    // i -> element
    int sum = 0;
    for (int i : arr) { // supports continue, break
      // System.out.println(i);
      sum += i;
    }
    // print out elements
    System.out.println(sum);

    String[] fruits = new String[] {"apple", "orange", null, "banana"};
    // for-each loop string array
    for (String fruit : fruits) {
      if (fruit != null && "o".equals(fruit.substring(0, 1))) {
        System.out.println(fruit.charAt(fruit.length() - 1));
      }

    }



  } // end of main()
}

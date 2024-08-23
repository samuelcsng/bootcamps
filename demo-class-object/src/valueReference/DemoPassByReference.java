package valueReference;

import java.util.Arrays;

public class DemoPassByReference {

  public static void main(String[] args) {
    int[] integers = new int[] {10, 20, -3, 9};
    // move the max value to the tail -> [x, x, x, 20]
    // algorithm (static method)
    moveMaxToTail(integers;)
    System.out.println(Arrays.toString(integers)); // [10, -3, 9, 20]

String s="hello";
String capString = 
toUpperCase(s); // pass a copy of String value
System.out.println(s); // hello

    // primitives, wrapper class object, String object -> pass by value


  } // end of main()

  // So, array is one of type that is "pass by reference"
  public static void moveMaxToTail(int[] arr) {
    int backup;
    for (int i=0; i<arr.length-1;i++){
      if (arr[i]>arr[i+1]){
        backup=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=backup;
      }
    }
    return arr;
  }


}

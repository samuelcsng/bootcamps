import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // 8 primitives + String
    int x = 3;
    int x2 = 6;
    int x3 = -4;

    int max = 0;
    if (x > max) {
      max = x;
    }
    if (x2 > max) {
      max = x2;
    }
    if (x3 > max) {
      max = x3;
    }

    System.out.println("max=" + max);

    // how about we compare 10 numbers?
    // You have to define the length of array before you use it.
    int[] arr = new int[3]; // 3 means the length of array
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;
    // print out all numbers from the array
    System.out.println(arr[0]); // 3
    System.out.println(arr[1]); // 6
    System.out.println(arr[2]); // -4
    System.out.println(arr.length);

    // for loop -> print the values in array
    for (int i = 0; i < arr.length; i++) { // 0 1 2
      System.out.println(arr[i]);
    }

    // declare an array for double
    // for loop
    double[] arr2 = new double[5];
    System.out.println(arr2.length);
    arr2[0] = 16.1;
    arr2[1] = 3.4d;
    arr2[2] = 2.8f; // float -> double
    arr2[3] = -4.9;
    arr2[4] = 10; // int -> double
    // arr2[5] = 10.2; // java.lang.ArrayIndexOutOfBoundsException

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }
    // char[], boolean[], byte[], short[], long[], float[], String[]

    // Example 1
    int[] arr3 = new int[3];
    arr3[0] = 3;
    arr3[1] = 6;
    arr3[2] = -4;
    // Find the max num from the array
    // Loop
    int maxNum = -210000000; // -2_100_000_000 // arr3[0];
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > maxNum) {
        maxNum = arr3[i];
      }
    }
    System.out.println("maxNum=" + maxNum); // 6

    // Fin the min. number
    int minNum = 999_999_999; // arr3[0]
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < minNum) {
        minNum = arr3[i];
      }
    }
    System.out.println("minNum=" + minNum); // -4

    // Example 3
    String[] strings = new String[3];
    strings[0] = "abcdabcd";
    strings[1] = "hello";
    strings[2] = "1230900";
    String longestString = ""; // length = 0

    // code here ...
    // strings[i].length() -> A String Value length
    // strings.length -> string array length
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > longestString.length()) {
        longestString = strings[i];
      }
    }
    System.out.println("The longest string=" + longestString);

    // Example 4
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 1.5;
    prices[3] = 2.3;
    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 4;

    double totalAmount = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i];
    }

    System.out.println("Total Amount=" + totalAmount);

    // Example 5
    // Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    // loop
    // int totalScore = 0;
    double totalScore = 0.0;
    double average = 0.0;
    for (int i = 0; i < scores.length; i++) {
      totalScore += scores[i];
    }
    // average = (double) totalScore / scores.length;
    average = totalScore / scores.length;
    System.out.println("Average score=" + average);

    // declase and initialize an array
    // approach 1
    String[] arr5 = new String[3];
    // approach 2
    String[] arr6 = new String[] {"abc", "def", "ijk"}; // length =3
    // arr6[3]; // error
    // approach 3
    String[] arr7 = {"abc", "def", "ijk"};

    // Example 6
    int[] arr8 = new int[] {100, -20, 40, 33, 90, 44, 66};
    // Find all numbers that > 40 and divided by 3
    int[] answers = new int[arr8.length];
    int idx = 0;
    for (int i = 0; i < arr8.length; i++) {
      if (arr8[i] > 40 && arr8[i] % 3 == 0) {
        // System.out.println(arr8[i]);
        answers[idx++] = arr8[i]; // ************
      }
    }
    // Print out array
    System.out.println(Arrays.toString(answers)); // [90, 66, 0, 0, 0, 0, 0]
    // [90, 66]

    // Example 7
    char[] arr9 = new char[2];
    arr9[0] = 'h';
    arr9[1] = 'a';
    // swap
    char dummy;
    dummy = arr9[0];
    arr9[0] = arr9[1];
    arr9[1] = dummy;
    System.out.println(arr9[0]); // a
    System.out.println(arr9[1]); // h

    // swap - by backup
    char[] arr99 = {'h', 'a'};
    char backup;
    // backup
    backup = arr99[0];
    arr99[0] = arr99[1];
    arr99[1] = backup;
    System.out.println(Arrays.toString(arr99));

    // Example 8
    // loop + swap
    char[] arr10 = new char[] {'9', '4', '3', '2', '1', '0'};
    // Move the first character to the tail
    // You cannot create another array
    char backup2 = arr10[0];
    // char backup2 = arr10[arr10.indexOf('9')];
    for (int i = 0; i < arr10.length; i++) {
      if (i != arr10.length - 1) {
        arr10[i] = arr10[i + 1];
      } else {
        arr10[i] = backup2;
      }
    }
    System.out.println(Arrays.toString(arr10));

    for (int i = 0; i < arr10.length - 1; i++) {
      // swap
      backup2 = arr10[i];
      arr10[i] = arr10[i + 1];
      arr10[i + 1] = backup2;
    }
    System.out.println(Arrays.toString(arr10)); // [4, 3, 2, 1, 0, 9]

    // Example 9
    int[] arr11 = new int[] {100, -100, -4, 5, -2, 200, 9};
    // Move the max value to tail
    // [x, x, x, x, x, x, 200]
    int maxValue = 0;
    for (int i = 0; i < arr11.length; i++) {
      if (arr11[i] > maxValue) {
        maxValue = arr11[i];
      }
    }
    arr11[arr11.length - 1] = maxValue;
    System.out.println(Arrays.toString(arr11));

    int backup3 = -1;
    for (int i = 0; i < arr11.length - 1; i++) {
      if (arr11[i] > arr11[i + 1]) {
        backup3 = arr11[i];
        arr11[i] = arr11[i + 1];
        arr11[i + 1] = backup3;
      }
    }
    System.out.println(Arrays.toString(arr11));

    // Example 10
    int[] arr12 = new int[] {100, -100, -4, 5, -2, 200, 9};
    // sum all values
    // 208
    int sum = 0;
    for (int i = 0; i < arr12.length; i++) {
      sum += arr12[i];
    }
    System.out.println("sum=" + sum);

    // Example 11 - Bubble Sort
    // refer to example 9
    // Sorting
    long[] arr13 = new long[] {10, 3, -4, 9, 100, 70};
    // [-4, 3, 9, 10, 70, 100]
    // Move the max value to the tail repeatedly

    // 1st round: [10, 3, -4, 9, 70,100]
    // 2nd round: [x, x, x, x, x, 70, 100]
    // 3rd round: [x, x, x, 10, 70, 100]
    // 4th round: ...
    // last round: [-4, 3, 9, 10, 70, 100]
    long backup4 = -1;
    for (int i = 0; i < arr13.length - 1; i++) { // 5 times, 0,1,2,3,4
      for (int j = 0; j < arr13.length - i - 1; j++) { // Move max value to tail
        // swap
        if (arr13[j] > arr13[j + 1]) {
          backup4 = arr13[j];
          arr13[j] = arr13[j + 1];
          arr13[j + 1] = backup4;
        }
      }
      System.out.println(i + " " + Arrays.toString(arr13));
    }

    // Arrays.sort(arr13);
    // System.out.println(Arrays.toString(arr13));


    // default value for int[]
    int[] arr14 = new int[4];
    System.out.println(Arrays.toString(arr14)); // [0,0,0,0]

    // default value for boolean[]
    boolean[] arr15 = new boolean[3];
    System.out.println(Arrays.toString(arr15)); // [false, false, false]

    // default value for char[]
    char[] arr16 = new char[3];
    arr16[0] = ' ';
    arr16[1] = '\u0000';
    arr16[2] = ' '; // [ , , ]
    System.out.println(Arrays.toString(arr16));

    arr16[1] = ' '; // [, , ]
    System.out.println(Arrays.toString(arr16));

    if (arr16[0] == '\u0000') { // true
      System.out.println("it is a space character.");
    }

    // String[], length 3
    // 2 ways to declare String array
    String[] arr17 = new String[] {"hello", "abc", "def"}; // fixed length 3
    System.out.println(arr17[1]); // abc
    arr17 = new String[4];
    // Create String array object (heap memory)
    // arr17 -> Object Reference (Variable)
    arr17[2] = "ijk";
    // Create String object, and assign String address to one of the addresses inside the array
    System.out.println(Arrays.toString(arr17)); // [null, null, "ijk", null]

    // 2D Array
    int[][] arr18 = new int[2][3]; // 2 rows (index 0,1) x 3 columns (0,1,2)
    arr18[1][1] = 100;
    arr18[1][2] = -99;
    arr18[0][1] = 1;
    // arr18[2][1] == 11; // error
    System.out.println(Arrays.deepToString(arr18)); // [[0,1,0],[0,100,-99]]

    System.out.println(arr18.length); // row length -> 2
    System.out.println(arr18[0].length); // column length -> 3
    System.out.println(arr18[1].length); // column length -> 3

    // for loop -> access 2D array
    for (int i = 0; i < arr18.length; i++) { // row -> 2
      for (int j = 0; j < arr18[0].length; j++) { // column -> 3 -> reset
        System.out.println("[" + i + "][" + j + "]=" + arr18[i][j]);
      }
    }

    // Example 12
    int count = 0;
    int[] arr19 = new int[] {9, 4, 2, 2, 3, 9, 3};
    // The number of 2 = 2
    for (int i = 0; i < arr19.length; i++) {
      if (arr19[i] == 2) {
        count++;
      }
    }
    System.out.println("The number of 2 = " + count);

    // given int value: 0 < x < 9
    int[] arr20 = new int[] {9, 4, 2, 2, 0, 3, 9, 9, 3};
    // Fin the Max. Count's value -> 9

    int[] counts = new int[10]; // 0 - 9
    for (int i = 0; i < arr20.length; i++) {
      counts[arr20[i]]++; // ***
    }
    int max2 = 0;
    int target = -1;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max2) {
        max2 = counts[i];
        target = i;
      }
    }
    System.out.println(Arrays.toString(counts));
    System.out.println("Max. Count's value=" + target); // Max. Count's value=9

    // Arrays.copyof()
    // Problem
    // arr4 -> ojb ref
    // int array object
    int[] arr4 = new int[] {1, 2, 3};
    arr4 = new int[] {2, 3, 4};

    // We have 2 object reference, but one object
    // Example 1
    int[] arr21 = new int[] {1, 2, 3};
    int[] arr22 = arr21; // Pass by reference
    System.out.println(arr21[2]); // 3
    System.out.println(arr22[2]); // 3

    System.out.println(arr22[1]); // 2
    arr21[1] = 100;
    System.out.println(arr21[1]); // 100
    System.out.println(arr22[1]); // 100

    // Example 2 (primitive)
    int x1 = 10;
    int x4 = x1; // Pass by value
    System.out.println(x4); // 10

    x1 = 100;
    System.out.println(x1); // 100
    System.out.println(x4); // 10

    // Example 3 (Wrapper Class / String)
    String s1 = "abc";
    String s2 = s1; // Pass by value
    s1 = "def";
    System.out.println(s1); // def
    System.out.println(s2); // abc



    // Conclusion
    // 8 Primitives + 8 Wrapper Classes + String -> Pass by value
    // Other than that -> Pass by reference

    // For Pass by reference -> you can refer to example 1.
    // for Pass by value -> you can refer to example 2 and 3

    // How to backup an array?
    // Arrays.copyOf()
    // Heap memory -> create another int array
    // define the length of the new array
    int[] backupArray = Arrays.copyOf(arr21, arr21.length);
    System.out.println(Arrays.toString(backupArray));

    // Bubble Sort/ Insertion Sort (Nested Loop)
    int[] beforeSort = new int[] {30, -3, 100, -102};
    Arrays.sort(beforeSort); // passByReference; performance: nlogn
    System.out.println(Arrays.toString(beforeSort));


  } // end of main()
}

// package demo-loop.src;

public class DemoForLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x); // 81

    int y = 3;
    for (int i = 0; i < 3; i++) { // (counter initialization; continue condition;)
      y = y * 3;
    }
    System.out.println(y);

    // Example 1
    // print 5 times Hello World
    for (int i = 0; i < 5; i++) {
      System.out.println("helloworld");
    }

    // Example 2
    // use i for other purpose
    for (int i = 0; i < 6; i++) {
      System.out.println(i);
    }

    // Example 3
    // Print all odd number between 0 - 10
    // Loop and if
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // Example 4
    for (int i = 10; i > 0; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.println(10 - i);
      }
    }

    // Example 5
    String str = "abcdefghijk";
    String str2 = "";
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        str2 += str.charAt(i);
      }
    }
    System.out.println(str2);

    // Example 6
    String s2 = "bbaaaacceeef";
    char target = 'e';
    int count = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == target) {
        count++;
      }
    }
    System.out.println("The number of character " + target + " is " + count);

    // Example 7 - counting
    // 1 - 100
    // divided by 3 or divided 4, count
    count = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
        // System.out.println(i);
        count++;
      }
    }
    System.out.println(count);

    // Example 8
    // 1 - 50
    // Find the total number, which sum up all odd numbers and subtract all even numbers between 1 - 50
    int output = 0;
    for (int i = 1; i < 51; i++) {
      if (i % 2 == 0) {
        output -= i;
      } else {
        output += i;
      }
    }
    System.out.println(output); // -25

    // Example 9
    String s3 = "abcdxyzijk";
    // Print the index of j, If j is not found, print -1
    boolean found = false;
    int idxOfJ = -1;
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == 'j') {
        found = true;
        idxOfJ = i;
      }
    }
    System.out.println(idxOfJ);

    // Alternative String.indexOf()
    System.out.println(s3.indexOf('j')); // 8
    s3 = "abc";
    System.out.println(s3.indexOf('j')); // -1

    // Example 10
    String s4 = "hello";
    char targetEndWith = 'o';
    // check if the last character is o -> true
    System.out.println(s4.charAt(s4.length() - 1) == targetEndWith); // true

    // endsWith(), startsWith()
    System.out.println(s4.endsWith("o")); // true
    System.out.println(s4.startsWith("he")); // true
    System.out.println(s4.startsWith("eh")); // false

    // substring
    String s5 = "abcdefghik";
    // Find "def"
    System.out.println(s5.contains("def")); // true
    // Find the index between 2 and 4
    System.out.println(s5.substring(2, 5)); // cde
    System.out.println(s5.indexOf("abc")); // 0
    System.out.println(s5.substring(0, 3)); // abc

    // Example 11
    String s6 = "abcdefghik";
    String subString = "def";
    // Don't use indexof() or contains
    // for loop
    // Found or not found
    found = false;
    for (int i = 0; i < s6.length(); i++) {
      for (int j = 0; j < subString.length(); j++) {
        System.out.println(s6.charAt(i) + " " + subString.charAt(j));
        System.out.println(s6.charAt(i) == subString.charAt(j));
      }
    }

    // Nested Loop
    for (int i = 0; i < 3; i++) { // outer loop
      for (int j = 0; j < 2; j++) { // inner loop
        System.out.println("i=" + i + ",j=" + j);
      }
    }

    // Example 12
    // break
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
      if (i >= 3) {
        break;
      }
    }
    // hello
    // hello
    // hello
    // hello

    // Example 13
    // break - searching
    String s7 = "ijkdef";
    found = false;
    for (int i = 0; i < s7.length(); i++) {
      if (s7.charAt(i) == 'k') {
        found = true;
        // System.out.println(found);
        break; // break the loop
      }
    }

    // Example 14
    // continue - skip some patterns
    for (int i = 0; i < 50; i++) { // 0 - 49
      if (i % 2 == 0) {
        continue; // skip the rest of code for current iteration
      }
      if (i > 30) {
        break;
      }
      System.out.println(i); // odd number and < 30
    }

    // Example 15
    // *****
    for (int i = 0; i < 5; i++) {
      System.out.print("*");
    }
    System.out.println("");

    // Example 16}
    // *****
    // ****
    // ***
    // **
    // *

    System.out.println("Example 16");
    // Nested Loop (i and j)
    for (int i = 5; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // Example 17
    // ******
    // ****
    // **

    // Infinite loop

    // for (;;){
    // System.out.println("hello");
    // }

    // int x2 = 0;
    // for (int i = 0; i >= 0; i++) {
    // x2++;
    // }


    // Continue

    String searchMe = "pwieurtierpeptipetpiro";
    int num = 0;
    for (int i = 0; i < searchMe.length(); i++) {
      if (searchMe.charAt(i) != 'p') {
        continue;
      }
      num++;
    }
    System.out.println(num);

    num = 0;
    for (int i = 0; i < searchMe.length(); i++) {
      if (searchMe.charAt(i) == 'p') {
        num++;
      }
    }
    System.out.println(num);


    


  } // end of main()
}

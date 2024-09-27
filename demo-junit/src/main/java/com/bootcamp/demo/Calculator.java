package com.bootcamp.demo;

public class Calculator {

  public static int sum(int x, int y) {
    // return -1;
    // return x + y;
    if ((long) x + (long) y > Integer.MAX_VALUE)
      return -1;
    return x + y;
  }

  // leetcode
  // if all number < 0, return -1
  // if any number >= 0 return Max
  public static int findMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    boolean withPositiveNumber = false;
    for (int x : arr) {
      if (x > max) {
        if (x >= 0)
          withPositiveNumber = true;
        max = x;
      }
    }
    // return max;
    return withPositiveNumber ? max : -1;
  }


}

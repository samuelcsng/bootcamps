package com.bootcamp.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exam {
  private List<Integer> scores;

  public Exam() {
    this.scores = new LinkedList<>();
  }

  // !!!! Exam Object -> instance method (highestScore()) -> Calculator.findMax()
  public int highestScore() {
    // call Calculator.finMax()
    // List<Integer> -> int[]
    // Integer[] arr = this.scores.toArray(new Integer[this.scores.size()]);

    // List<Integer> -> IntStream -> int[]
    int[] arr = this.scores.stream().mapToInt(Integer::intValue).toArray();
    return Calculator.findMax(arr) + 10; // value add for highestScore()
  }

}

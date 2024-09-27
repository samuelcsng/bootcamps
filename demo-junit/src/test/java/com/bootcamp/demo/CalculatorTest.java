package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  void sum() {
    assertEquals(5, Calculator.sum(3, 2));
    assertEquals(0, Calculator.sum(0, 0));
    assertEquals(-4, Calculator.sum(-2, -2));
    assertEquals(8, Calculator.sum(-2, 10));
    assertEquals(-1, Calculator.sum(2_100_000_000, 100_000_000));
  }

  @Test
  void findMax() {
    assertEquals(10, Calculator.findMax(new int[] {10, -2, 9}));
    assertEquals(0, Calculator.findMax(new int[] {-100, -99, 0}));



  }
}

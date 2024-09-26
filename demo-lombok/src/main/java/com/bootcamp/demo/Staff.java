package com.bootcamp.demo;

import lombok.NonNull;

public class Staff {
  private String name;
  private double salary;

  // Parameter Annotation -> generate exception checking
  public Staff(@NonNull String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void work(@NonNull String detail){
System.out.println("Staff is working on " + detail);
  }

  public static void main(String[] args) {
    new Staff("John", 20000.0).work("something"); // Staff is working on something
    new Staff("Peter", 25000.0).work(null); // java.lang.NullPointerException
  }

  // ! Solution
  // You have to explicitly write your own business code inside the constructor
  // this.name = name;
  // this.salary = salary;
}

package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

// Class level Annotation
@Data // @ RequiredArgsConstructor
// @AllArgsConstructor
public class Person {
  // Annotation can be attribute level
  @NonNull // runtime checking on Constructor + Setter
  private String name; // non-nullable

  private String emailAddress; // nullable

  public static void main(String[] args) {
    Person p = new Person("John");
    System.out.println(p);

    Person p2 = new Person(null);
    // runtime -> java.lang.NullPointerException



  } // main()
}

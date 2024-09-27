package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class PersonTest {
  private Person adult;
  private Person child;

  // before all test case
@BeforeAll
void init(){
  this.adult=new Person(18,"John");
  this.child=new Person(17, "Peter");
}

  @Test
  void testIsAdult() {

  }

  @Test
  void testGetter() {

  }

  @Test
  void testConstructor() {
    Person p = new Person(18, "John");
    assertNotNull(p);
    assertInstanceOf(Person.class, p);
  }

  // Maven generates the test cases caller
  public static void main(String[] args) {
    
  }
}

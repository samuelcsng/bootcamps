package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data // Includes Getters, Setters, toString(), equals(), hashCode()
@Getter
@AllArgsConstructor
@Builder
public class Ball {
  private Color color;
  
  public static enum Color{
    RED,BLUE,BLACK
  }
  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor()); // "RED"
    // Ball ball2=Ball.builder() //
    // .
  }
}

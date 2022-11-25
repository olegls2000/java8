package com.animal;

import com.annotation.NumberRange;

public class Fox implements WithLifeDuration {
  @NumberRange(min = 0, max = 20)
  private int lifeDuration;
  @NumberRange(min = 0, max = 10)
  private int weight;
  private String[] food;

  public Fox(int lifeDuration, int weight, String[] food) {
    this.lifeDuration = lifeDuration;
    this.weight = weight;
    this.food = food;
  }

  @Override
  public int getLifeDuration() {
    return lifeDuration;
  }

  @Override
  public void printLifeDuration() {
    System.out.println("Fox life duration is - " + lifeDuration);
  }
}

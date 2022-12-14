package com.animal;

import com.annotation.NumberRange;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Fox implements WithLifeDuration {
  @NumberRange(min = 0, max = 20)
  private int lifeDuration;
  @NumberRange(min = 0, max = 10)
  private int weight;
  private String[] food;

  @Override
  public void printLifeDuration() {
    System.out.println("Fox life duration is - " + lifeDuration);
  }

  @Override
  public String toString() {
    return "Fox{" +
               "lifeDuration=" + lifeDuration +
               ", weight=" + weight +
               ", food=" + Arrays.toString(food) +
               '}';
  }
}

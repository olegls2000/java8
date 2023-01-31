package com.lesson18;

import com.animal.Fox;
import com.annotation.MyStringProcessor;
import com.annotation.NumberRangeProcessor;
import com.annotation.ProfileExecutor;
import com.employe.Developer;
import com.lesson10hw.AmservAutoSalon;
import com.lesson10hw.AutoSalon;
import com.shape.Circle;

public class Lesson18 {
  public static void main(String[] args) throws Exception {
    final var numberRangeProcessor = NumberRangeProcessor.getInstance();
    final var fox = new Fox(5, 6, new String[] {"chicken", "pork"});

    numberRangeProcessor.process(fox);
    final Circle circle = new Circle(100);
    numberRangeProcessor.process(circle);

    final Developer developer = new Developer(3_000, "Tom", null);
    MyStringProcessor.getInstance().process(developer);

    ProfileExecutor profileExecutor = new ProfileExecutor();
    AutoSalon autoSalon = new AmservAutoSalon(200_000l);
    profileExecutor.execute(autoSalon);


  }
}

package com.annotation;

public class MyStringProcessor {
  private static MyStringProcessor instance;

  public static MyStringProcessor getInstance() {
    if (instance == null) {
      instance = new MyStringProcessor();
    }
    return instance;
  }

  private MyStringProcessor() {
  }

  public void process(Object objectToProcess) throws Exception {
    //TODO .. Home Work Lesson18
  }
}

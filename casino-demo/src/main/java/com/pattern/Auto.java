package com.pattern;

import java.util.List;

public class Auto {
  private Engine engine;
  private List<Wheel> wheels;
  private Body body;

  public Auto(Engine engine, List<Wheel> wheels, Body body) {
    this.engine = engine;
    this.wheels = wheels;
    this.body = body;
  }
}

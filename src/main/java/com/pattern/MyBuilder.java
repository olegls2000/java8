package com.pattern;

import java.util.List;

public class MyBuilder {
  private Engine engine;
  private List<Wheel> wheels;
  private Body body;

  public MyBuilder addEngine(Engine engine) {
    this.engine = engine;
    return this;
  }

  public MyBuilder addWheels(List<Wheel> wheels) {
    this.wheels = wheels;
    return this;
  }

  public MyBuilder addBody(Body body) {
    this.body = body;
    return this;
  }

  public Auto build() {
    return new Auto(engine, wheels, body);
  }
}

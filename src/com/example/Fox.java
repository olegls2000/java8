package com.example;

public class Fox {
  public String name;
  public int age;
  public String color;

  public Fox(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public Fox (String name) {
    this.name = name;
  }
  public Fox () {
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Fox{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", color='" + color + '\'' +
            '}';
  }
}

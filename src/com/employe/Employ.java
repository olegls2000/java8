package com.employe;

public class Employ {
  protected int salary;
  protected String name;

  public Employ(int salary, String name) {
    this.salary = salary;
    this.name = name;
  }

  public Employ() {
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

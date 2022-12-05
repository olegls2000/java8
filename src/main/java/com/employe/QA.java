package com.employe;

import com.annotation.MyString;

public class QA extends AbstractEmploy {

  @MyString(startWith = "a", maxSize = 25)
  private String team;

  public QA(int salary, String name, String team) {
    this.salary = salary;
    this.name = name;
    this.team = team;
  }

  @Override
  public void salaryRecalculate() {
    this.salary += 200;
  }

  @Override
  public String toString() {
    return "QA{" +
               "salary=" + salary +
               ", name='" + name + '\'' +
               ", team='" + team + '\'' +
               "} " + super.toString();
  }
}

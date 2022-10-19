package com.employe;

public class Developer extends Employ {

  private String[] languages;

  public Developer(int salary, String name, String[] languages) {
    this.salary = salary;
    this.name = name;
    this.languages = languages;
    System.out.println("Hello");
  }
}

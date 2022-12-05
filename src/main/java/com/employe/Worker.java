package com.employe;

public class Worker {
  public Worker(
      int age,
      String firstName,
      String lastName,
      int salary,
      Gender gender
  ) {
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.gender = gender;
  }

  public int age;
  public String firstName;
  public String lastName;
  public int salary;
  public Gender gender;

  public void becomeOneYearOlder() {
    //this.age= this.age + 1;
    this.age++;
  }

  public void printBasicInfo() {
    System.out.println(String.format("Employee data: %s %s: %d years old, salary: %d EUR",
        this.firstName, this.lastName, this.age, this.salary
    ));
  }

  public void getRaise(int percentage) {
    this.salary =(int) (this.salary * (1 + (percentage / 100.0)));
  }

  public void getSalaryDown(int percentage) {
    this.salary =(int) (this.salary * (1 - (percentage / 100.0)));
  }

  public static void printFromStatic(){
    //this.age;
    System.out.println("Hello from Static");
  }
}

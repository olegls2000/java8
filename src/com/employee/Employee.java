package com.employee;

public class Employee {
    private int salary;
    public String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

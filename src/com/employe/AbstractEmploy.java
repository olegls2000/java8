package com.employe;

public abstract class AbstractEmploy {
    protected int salary;
    protected String name;

    abstract void salaryRecalculate();

    public AbstractEmploy() {
        System.out.println("Hello from Abstract!!");
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

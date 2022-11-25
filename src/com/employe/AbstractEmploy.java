package com.employe;

import com.annotation.MyString;
import com.annotation.NumberRange;

public abstract class AbstractEmploy {

    @NumberRange(min = 600, max = 20_000)
    protected int salary;

    @MyString(startWith = "t", maxSize = 25)
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

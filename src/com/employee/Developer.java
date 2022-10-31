package com.employee;

public class Developer extends Employee {

    public Developer(int salary, String name, String[] languages) {
        this.salary = salary;
        this.name = name;
        this.languages = languages;

    }

    public String[] languages;
}

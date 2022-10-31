package com.employe;

public class Developer extends AbstractEmploy {

    private String[] languages;

    public Developer(int salary, String name, String[] languages) {
        System.out.println("Hello from Developer");
        super.salary = salary;
        super.name = name;
        this.languages = languages;
    }

    @Override
    public void salaryRecalculate() {
        this.salary += 100;
    }
}

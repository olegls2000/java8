package com.employe;

import com.shape.Triangle;

public class QA extends AbstractEmploy {
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
}

package com.employee;

public class TeamDeveloperQA {
    public static void main(String[] args) {
        QA[] qa = new QA[2];
        QA qa1 = new QA(5000, "Mike", "Acc3");
        QA qa2 = new QA(8000, "Stive", "Acc4");

        qa[0] = qa1;
        qa[1] = qa2;

        String[] languages = new String[2];

        languages[0] = "Java";
        languages[1] = "Javascript";

        Developer[] developer = new Developer[2];
        Developer developer1 = new Developer(7000, "John", languages);
        Developer developer2 = new Developer(10000, "Doe", languages);

        developer[0] = developer1;
        developer[1] = developer2;

        QA qaWithMaxSalary = getHighSalaryQA(qa);
        System.out.println(qaWithMaxSalary.getSalary());

        Developer developerWithMaxSalary = getHighSalaryDeveloper(developer);
        System.out.println(developerWithMaxSalary.getSalary());

        if (developerWithMaxSalary.getSalary() > qaWithMaxSalary.getSalary()) {
            System.out.println("com.employee.Developer has the highest salary: " + developerWithMaxSalary.getSalary());
        } else {
            System.out.println("com.employee.QA has the highest salary: " + qaWithMaxSalary.getSalary());
        }

    }

    public static QA getHighSalaryQA(
            QA[] qa) {
        QA highSalary = qa[0];
        for (int i = 1; i < qa.length; i++) {
            if (qa[i].getSalary() > highSalary.getSalary()) {
                highSalary = qa[i];
            }
        }
        return highSalary;
    }

    public static Developer getHighSalaryDeveloper(
            Developer[] developer) {
        Developer highSalary = developer[0];
        for (int i = 1; i < developer.length; i++) {
            if (developer[i].getSalary() > highSalary.getSalary()) {
                highSalary = developer[i];
            }
        }
        return highSalary;
    }



/*    com.employee.Employee[] employies = new com.employee.Employee[4];
    employies[0]=developer1;
    employies[1]=developer2;
    employies[2]=qa1;
    employies[3]=qa2;*/

}

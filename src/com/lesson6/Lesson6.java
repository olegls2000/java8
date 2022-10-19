package com.lesson6;

import com.employe.Developer;
import com.employe.Employ;
import com.employe.QA;

public class Lesson6 {
  public static void main(String[] args) {



    Developer dev1 = new Developer(20_000, "Jo", new String[] {"Java", "JS"});
    String[] languages = new String[2];
    languages[0] = "Java";
    languages[1] = "PHP";
    Developer dev2 = new Developer(25_000, "Mik", languages);
    Developer[] developers = {dev1, dev2};

    QA qa2 = new QA(35_000, "Chuk", "A");
    QA[] qas = new QA[2];
    qas[0] = new QA(15_000, "Diana", "Q");
    qas[1] = qa2;
    Developer maxSalaryDeveloper = getDeveloperWithMaxSalary(developers);
    QA maxSalaryQA = getQAWithMaxSalary(qas);
    if (maxSalaryDeveloper.getSalary() > maxSalaryQA.getSalary()) {
      System.out.println(maxSalaryDeveloper.getName() + " has a Max salary");
    } else {
      System.out.println(maxSalaryQA.getName() + " has a Max salary");
    }

    Employ[] employies = new Employ[4];
    employies[0] = dev1;
    employies[1] = dev2;
    employies[2] = new QA(15_000, "Diana", "Q");
    employies[3] = qa2;
    Employ employMaxSalary = getEmployWithMaxSalary(employies);


  }
  public static Employ getEmployWithMaxSalary(Employ[] employs) {
    Employ result = employs[0];
    for (int i = 0; i < employs.length; i++) {
      if (employs[i].getSalary() > result.getSalary()) {
        result = employs[i];
      }
    }
    return result;
  }

  public static Developer getDeveloperWithMaxSalary(Developer[] developers) {
    Developer result = developers[0];
    for (int i = 0; i < developers.length; i++) {
      if (developers[i].getSalary() > result.getSalary()) {
        result = developers[i];
      }
    }
    return result;
  }

  public static QA getQAWithMaxSalary(QA[] qas) {
    QA result = qas[0];
    for (int i = 0; i < qas.length; i++) {
      if (qas[i].getSalary() > result.getSalary()) {
        result = qas[i];
      }
    }
    return result;
  }
}

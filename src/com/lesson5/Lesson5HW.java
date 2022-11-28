package com.lesson5;

import com.employe.Gender;
import com.employe.Worker;
import com.util.Utils;

public class Lesson5HW {
  public static void main(String[] args) {
    //Класс com.employe.Worker имеет
    // поля возраст, имя, фамилия, пол, зарплата
    //Создать отдел (массив людей), наполнить
    // его людьми (5-6 человек),
    // и найти самого молодого и самого
    // старого человека.
    //Посчитать среднюю ЗП сотрудников,
    // найти сотрудника с самой минимальной и максимальной ЗП.

    Worker jo = new Worker(45,
        "Jo",
        "Johnson",
        30_00,
        Gender.OTHER);

    Worker mik = new Worker(28,
        "Mik",
        "Mihkelson",
        30_00,
        Gender.OTHER);

    Worker[] workers = new Worker[2];
    workers[0] = jo;
    workers[1] = mik;

    jo.becomeOneYearOlder();

    mik.becomeOneYearOlder();
    mik.becomeOneYearOlder();

    mik.getRaise(50);
    jo.printBasicInfo();
    mik.printBasicInfo();


    //printReport(workers);
     Worker.printFromStatic();
    Integer[] array = Utils.generateArray(5, 0, 100);


  }

  public static Worker getOldestWorker(Worker[] workers) {
    Worker result = workers[0];
    for (int i = 1; i < workers.length; i++) {
      if (workers[i].age > result.age) {
        result = workers[i];
      }
    }
    return result;
  }

  public static Worker getYoungestWorker(Worker[] workers) {
    Worker result = workers[0];
    for (int i = 1; i < workers.length; i++) {
      if (workers[i].age < result.age) {
        result = workers[i];
      }
    }
    return result;
  }

  public static Worker getWorkerWithBiggestSalary(Worker[] workers) {
    Worker result = workers[0];
    for (int i = 1; i < workers.length; i++) {
      if (workers[i].salary > result.salary) {
        result = workers[i];
      }
    }
    return result;
  }

  public static Worker getWorkerWithSmallestSalary(Worker[] workers) {
    Worker result = workers[0];
    for (int i = 1; i < workers.length; i++) {
      if (workers[i].salary < result.salary) {
        result = workers[i];
      }
    }
    return result;
  }

  public static void printReport(Worker[] workers) {
    //Вывести в консоль мини отчет о средней ЗП,
    // максимальной и минимальной ЗП, среднем возрасте сотрудников,
    // о самом старшем и самом молодом сотруднике.
    Worker oldest = getOldestWorker(workers);
    Worker youngest = getYoungestWorker(workers);
    Worker biggestSalary = getWorkerWithBiggestSalary(workers);
    Worker smallestSalary = getWorkerWithSmallestSalary(workers);

    System.out.println("---Report: ----");
    System.out.println(String.format("Oldest employee %s %s: %d years old",
        oldest.firstName, oldest.lastName, oldest.age));
    System.out.println(String.format("Youngest employee %s %s: %d years old",
        youngest.firstName, youngest.lastName, youngest.age));
    System.out.println(String.format("In total company has : %d employees", workers.length));
    System.out.println("-----------------");
    Math.pow(3.8, 4.0);
  }


}

package com.lesson5;

import com.example.Car;
import com.example.Fox;
import com.util.Utils;

public class Lesson5 {
  public static void main(String[] args) {
    Fox myFox1 = new Fox();
    myFox1.name = "Jo";
    myFox1.age = 5;
    myFox1.color = "brown";

    Fox myFox2 = new Fox();
    myFox2.name = "Foo";
    myFox2.age = 7;
    myFox2.color = "red";

    myFox1 = myFox2;

    Car toyota = new Car();
    System.out.println(toyota.getManufacturer());
    toyota.setManufacturer("TOYOTA");
    toyota.setReleaseYear(2019);
   // toyota.maxSpeed = 180;
    //com.util.Utils.getRandomNumberFromInterval(2,5);
    //toyota = null;
    //System.gc();
    Car bmw = new Car(220,
        "BMW",
        2020);
   // System.out.println(bmw.manufacturer);

    Car shkoda = new Car(
        Utils.getRandomNumberFromInterval(15, 250),
        "Shkoda",
        Utils.getRandomNumberFromInterval(2008, 2022));
    Car shkoda1 = new Car("Shkoda");
    Car honda = new Car("Honda");
    Car[] cars = new Car[5];
    cars[0] = toyota;
    cars[1] = bmw;
    cars[2] = shkoda;
    cars[3] = shkoda1;
    cars[4] = honda;


/*    Car oldest = cars[0];
    for (int i = 1; i < cars.length; i++) {
      if(cars[i].releaseYear < oldest.releaseYear){
        oldest = cars[i];
      }
    }

    System.out.println("Oldest com.example.Car is: " + oldest.manufacturer +
                           " Release year: " + oldest.releaseYear);*/

    Fox ff = new Fox();
    ff.age = 4;



  }
}

package com.lesson10;

import com.animal.Fox;
import com.animal.WithLifeDuration;
import com.animal.Wolf;
import com.employe.Developer;
import com.lesson10hw.AbstractCar;
import com.shape.Circle;
import com.shape.Square;
import com.shape.Triangle;
import com.shape.WithPerimeter;

import static com.shappe2d.Utils2d.DAY_OF_WEEKS;

public class Lesson10 {
    public static void main(String[] args) {
        WithPerimeter triangle = new Triangle(5, 5, 5);
        double p1 = triangle.calculatePerimeter();
        //triangle.triangleSpecificMethod();

        WithPerimeter square = new Square(6);
        //square.side = -10;
        double p2 = square.calculatePerimeter();

        WithPerimeter circle = new Circle(4);
        double p3 = circle.calculatePerimeter();

        WithPerimeter[] shapesWithPerimeter = new WithPerimeter[3];
        shapesWithPerimeter[0] = triangle;
        shapesWithPerimeter[1] = square;
        shapesWithPerimeter[2] = circle;
        System.out.println("afda");

        WithLifeDuration[] animals = new WithLifeDuration[5];
        animals[0] = new Fox(10, 15, null);
        animals[1] = new Fox(9, 17, null);
        animals[2] = new Fox(11, 14, null);
        animals[3] = new Wolf(22, 11, 24);
        animals[4] = new Wolf(19, 15, 28);

        WithLifeDuration maxLife = animals[0];
        for (int i = 1; i < animals.length; i++) {
            if (animals[i].getLifeDuration() > maxLife.getLifeDuration()) {
                maxLife = animals[i];
            }
        }
        for (WithLifeDuration animal : animals) {
            animal.printLifeDuration();
        }

        Fox[] foxes = null;
        Wolf[] wolves = null;

        WithLifeDuration someAnimal = new Fox(10, 15, null);
        WithLifeDuration someAnimal1 = new Wolf(10, 15, 44);


        Developer dev2 = new Developer(45_000, "Joe", null);

        //Developer dev2  = new AbstractEmploy(45_000, "Joe", null);
        //AbstractEmploy dev1  = new Developer(45_000, "Joe", null);

        final int myIntConst = 10;
        //myIntConst = 11;
        final Triangle triangle1 = new Triangle(6, 6, 6);
        triangle1.setA(7);
        triangle1.setB(7);
        triangle1.setC(7);
        //triangle1 = triangle;

        System.out.println("Constant: " + DAY_OF_WEEKS);
    }
}

package com.lesson19;

import com.animal.Wolf;
import com.employe.QA;
import com.pattern.*;
import com.shape.Circle;
import com.shape.MyCustomException;
import com.shape.Triangle;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.util.Utils.getRandomNumberFromInterval;

public class Lesson19 {
  public static void main(String[] args) throws MyCustomException {
    final MyBuilder autoBuilder = new MyBuilder();
    autoBuilder.addEngine(new Engine());
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    Wheel wheel1 = new Wheel();
    Wheel wheel2 = new Wheel();
    Wheel wheel3 = new Wheel();
    Wheel wheel4 = new Wheel();
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");

    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    autoBuilder.addWheels(Arrays.asList(wheel1, wheel2, wheel3, wheel4));
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    System.out.println("Do some logic ...");
    autoBuilder.addBody(new Body());
    final Auto auto = autoBuilder.build();

    final Auto newAuto = new MyBuilder()
        .addBody(new Body())
        .addEngine(new Engine())
        .addWheels(Arrays.asList(new Wheel(), new Wheel(), new Wheel()))
        .build();

    //////////////////Lambda functions:
    QA newQa = new QA(20_000, "Joe", "asteriks");
    QA newQa1 = new QA(30_000, "Joe", "Onyx");
    QA newQa2 = new QA(15_000, "Joe", "Onyx");

    final Comparator<QA> salaryComparator = new Comparator<QA>() {
      @Override
      public int compare(QA o1, QA o2) {
        return o1.getSalary() - o2.getSalary();
      }
    };
    Set<QA> orderedBySalary = new TreeSet<>( //salaryComparator
        (o1, o2) -> o1.getSalary() - o2.getSalary()
    );

    orderedBySalary.add(newQa);
    orderedBySalary.add(newQa1);
    orderedBySalary.add(newQa2);
    System.out.println(orderedBySalary);

/*    Supplier<Circle> newCircleSupplier = new Supplier<Circle>() {
      @Override
      public Circle get() {
        return new Circle();
      }
    };*/
    Supplier<Circle> newCircleSupplierLambda = () -> new Circle();
    Supplier<Circle> newCircleSupplierLambdaX = () -> new Circle(10);
    Supplier<Circle> newCircleSupplierLambdaXY =
        () -> new Circle(getRandomNumberFromInterval(15, 200));

    Circle fromSuppler = newCircleSupplierLambda.get();
    Circle fromSuppler1 = newCircleSupplierLambdaX.get();
    Circle fromSuppler2 = newCircleSupplierLambdaXY.get();

    Consumer<Wolf> wolfConsumer = wolf -> System.out.println(wolf);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    wolfConsumer.accept(new Wolf(20, 15, 10));

    Function<Triangle, Double> perimeterFunction = t -> t.calculatePerimeter();
    final Double perimeter = perimeterFunction.apply(new Triangle(5, 5, 5));

    Function<Circle, Double> areaFunction = c -> c.calculateArea();
    final Double area = areaFunction.apply(new Circle());

    List<Circle> circleList = Arrays.asList(fromSuppler, fromSuppler1, fromSuppler2);
    double resultArea = 0;
    for (Circle circle : circleList) {
      resultArea += circle.calculateArea();
      System.out.println("Circle: " + circle);
    }
    System.out.println("Summ of areas is: " + resultArea);

    Stream
        .generate(() -> new Circle(getRandomNumberFromInterval(15, 200)))
        .limit(10)
        .peek(circle -> System.out.println("Circle before Filtering: " + circle))
        .filter(circle -> circle.getRadius() % 2 == 0)
        .peek(circle -> System.out.println("Circle after Filtering: " + circle))
        .mapToDouble(circle -> circle.calculateArea())
        .sum();
  }
}

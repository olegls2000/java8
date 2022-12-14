package com.lesson20;

import com.animal.Fox;
import com.util.Utils;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson20 {
  public static void main(String[] args) {
    //Generate stream from 1000 elements,
    // print all elements, print count,
    // use lambda, use method reference

    final List<Fox> foxes = Stream
        .generate(() -> new Fox(
            Utils.getRandomNumberFromInterval(2, 15),
            Utils.getRandomNumberFromInterval(2, 10),
            null))
        .limit(10)
        .collect(Collectors.toList());

    long foxesCountMore10Years = foxes.stream()
        .filter(fox -> fox.getLifeDuration() > 10)
        .count();
    System.out.println(
        "Foxes that have more then 10 years life duration: " + foxesCountMore10Years);

    //print fox count weight (3, 6]
    //print fox count weight (3, 6]
    //print fox count weight (3, 6]
    //print fox count weight (3, 6]

    final var foxesCount36 = foxes.stream()
        .filter(fox -> fox.getWeight() > 3 && fox.getWeight() <= 6)
        .count();
    System.out.println("Foxes that have weight (3, 6]: " + foxesCount36);

    boolean has14YOld = foxes.stream().anyMatch(f -> f.getLifeDuration() == 14);
    System.out.println("has14YOld -> " + has14YOld);

    boolean hasNot2YOld = foxes.stream().noneMatch(f -> f.getLifeDuration() == 2);
    System.out.println("has14YOld -> " + has14YOld);

    boolean hasWeightMote2 = foxes.stream().allMatch(f -> f.getWeight() > 2);

    // XSSFWorkbook workbook = new XSSFWorkbook();

    //Create file system using specific name
    // FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));


  }
}

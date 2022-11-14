package com.lesson12hw;

import com.util.StringUtil;
import com.util.Utils;

import static com.util.StringUtil.printSameLetterWord;

public class Lesson12HW {
    //1. In class com.shape.Triangle
    // replace all throws of RuntimeException to your custom exception.
    // Custom Exception must be checked (extends Exception).
    // Fix all compilation issues.

    //3. Assume that we have sentence, create a
    // method that finds and prints the longest and shortest words.
    // Place the method into StringUtils class (need to be created).

    public static void main(String[] args) {
        final String sentence = "Hi, I am Joe and I ama from UnitedaSD, KingdomK!";
        StringUtil.printLongestWord(sentence);
        StringUtil.printShortestWord(sentence);
        printSameLetterWord(sentence);
        Utils.arrayListOfNumbers();
    }

}

package com.lesson12hw;

import com.util.StringUtil;

import static com.util.StringUtil.replaceChark;

public class Lesson12HW {
    //1. In class com.shape.Triangle
    // replace all throws of RuntimeException to your custom exception.
    // Custom Exception must be checked (extends Exception).
    // Fix all compilation issues.

    //3. Assume that we have sentence, create a
    // method that finds and prints the longest and shortest words.
    // Place the method into StringUtils class (need to be created).

    public static void main(String[] args) {
        final String sentence = "Hi, I am Kate and I am from UnitedaSD, :Kingdom!";
        final String replaceChar = "Hi, I am Kate and I am from United, :Kingdom!";
        StringUtil.printLongestWord(sentence);
        StringUtil.printShortestWord(sentence);
        StringUtil.replaceChar(sentence);
        StringUtil.replaceChark(replaceChar);


        String randomWord = "dadagwfgjt";
        char firstCharacter = randomWord.charAt(0);
        char lastCharacter = randomWord.charAt(randomWord.length() - 1);
        StringUtil.printSameLetterWord(sentence);
        "Some String".startsWith("Y");
        "Some String".contains("Y");
        "Some String".toLowerCase();
        "Some String".toUpperCase();
    }

}

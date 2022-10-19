package com.lesson13HW;


public final class StringUtil {

    public static void printReplace(String sentence ) {
        final String[] words = sentence.split(" ");
        String replaceSymbol = words[0];
        for (String word : words) {
            word = cleanWord(word);
            if (word.length() > replaceSymbol.length()) {
                replaceSymbol = word;
            }
        }
        System.out.println(replaceSymbol);

    }
}

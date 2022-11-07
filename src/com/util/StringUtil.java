package com.util;

public final class StringUtil {
    private StringUtil() {
        throw new RuntimeException("Instance is impossible for the Utility class!");
    }
    public static void printLongestWord(String sentence) {
        final String[] words = sentence.split(" ");
        String longestWord = words[0];
        for (String word : words) {
            word = cleanWord(word);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in sentence: \"" +
                sentence + "\" - is: " + longestWord);
    }
    private static String cleanWord(String rawWord) {
        String newRawString = rawWord.replace("!", " ");
        newRawString = rawWord.replace("?", " ");
        newRawString = rawWord.replace(".", " ");
        newRawString = rawWord.replace(",", " ");

        final String result = newRawString.trim();
        return result;
    }
    public static void printShortestWord(String sentence) {

    }
}

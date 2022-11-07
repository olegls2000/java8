package com.lesson12;

public class SmallestLargestWord {
    public static void main(String[] args) {

        String str = "Two things are infinite: the universe and human stupidity";
        String ShortestWord = "";
        String LongestWord = "";

        int ShortestWordLength = 1000;
        int LongestWordLength = 0;

        String[] splitStr = str.split(" ");

        for(String string: splitStr){
            if(string.length() > LongestWordLength){

                LongestWord = string;
                LongestWordLength = string.length();

            } else if(string.length() < ShortestWordLength){

                ShortestWord = string;
                ShortestWordLength = string.length();

            }

        }
        System.out.println("Shortest Word :" + ShortestWord);
        System.out.println("Longest Word :" + LongestWord);

    }
}

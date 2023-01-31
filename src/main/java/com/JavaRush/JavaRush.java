package com.JavaRush;

import java.lang.reflect.Array;

public class JavaRush {

    public static void JavaRush(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }

        /* ------- NEXT ------- */
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https://")) {
            return "https://";
        } else if (url.startsWith("http://")) {
            return "http://";
        } else
            return "NoName";
    }

    public static String checkDomain(String url) {
        if (url.endsWith(".ru")) {
            return ".ru";
        } else if (url.endsWith(".com")) {
            return ".com";
        } else if (url.endsWith(".cc")) {
            return ".cc";
        } else
            return "NoName";
    }

    public static boolean equal(String first, String second) {
        return first.intern() == second.intern();
    }

    /* ------- NEXT ------- */
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    /* ------- NEXT ------- */
    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start, end, str);
        /* ------- NEXT ------- */
    }

    public static void reverse(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }


    /* ------- NEXT ------- */


    public static void global(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);

    }

    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
            
        }
    }

    /* ------- NEXT ------- */
}


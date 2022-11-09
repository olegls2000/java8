package com.lesson13;

import com.util.StringUtil;

public class Lesson13HW {
    public static void main(String[] args) {
        String toReplace = "HiSQATYUIOP";
        char t = 't';
        char c = toReplace.charAt(5);
        System.out.println("Char(5) = " + c);

        String replacedString = StringUtil.replaceAndCount(toReplace);
        System.out.println(replacedString);
        final String replacedByIndexString =
                StringUtil.replaceByIndex("Hi I Am Joe", 2, 'X');
        System.out.println(replacedByIndexString); //"Hi I Am JoX"
    }
}

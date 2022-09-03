package com.algorithms;

import java.util.Locale;

public class StringCheck {
    public static void main(String[] args) {
        String str = "Dear hello";
        System.out.println( str.regionMatches(5,"Hello", 0, 3));
        System.out.println( str.regionMatches(true,5,"Hello", 0, 3));
        str.startsWith("o");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        CharSequence firstString = "Dear";
        CharSequence secondString = "Heyy";
        System.out.println(str.replace(firstString,secondString));

        String str2 = "Welcome to Java";
        System.out.println(str2.indexOf("Java",10));
        System.out.println(str2.lastIndexOf("Wel",5));
    }
}

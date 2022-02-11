package com.algorithms;

public class Spooner {

    public static void main(String[] args) {
        System.out.println(spoonerize("odochi buso"));
    }
    static String spoonerize(String words) {

        String[] splittedWords  = words.split(" ");
        // switch front characters of strings
        var firstCharacter = splittedWords[0].charAt(0);

        var secondCharacter = splittedWords[1].charAt(0);
        return secondCharacter + splittedWords[0].substring(1) + " " + firstCharacter + splittedWords[1].substring(1) ;
    }
}
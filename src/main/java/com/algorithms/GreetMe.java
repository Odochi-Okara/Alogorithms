package com.algorithms;

import java.util.Locale;

public class GreetMe {
    public static void main(String[] args) {
        System.out.println(greet("oDOCHI"));
    }
    public static String greet(String name){
        String u = name.toUpperCase().substring(0,1);
        String [] p = name.split("");
        for (int i = 1; i < name.length(); i++) {
            u+= p[i].toLowerCase();
        }
        ;
        return u;
    }

}

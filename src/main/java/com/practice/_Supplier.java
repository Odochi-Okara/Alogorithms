package com.practice;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getNames.get());
    }
//normal java code
    static String getName(){
        return "Odochi";
    }
    // functional interface
    static  Supplier<String> getNames= ()->"Odochi Okara";
//    static String getName(){
//        return "Odochi";
//    }
//    static Supplier<String> getNames= ()->"Odochi Okara";
}
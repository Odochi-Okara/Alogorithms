package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class algorithms2 {

    public static void main(String[] args) {
        String name ="odochi";
        String[] names= name.split("");
        String str=names[0].toUpperCase();
        for (int i = 1; i < names.length; i++) {

            str+=names[i].toLowerCase();
        }
        System.out.println(str);

    }
    static  void mul(int h){
        String as="";
        for (int i = 0; i < h; i++) {
            as+="*";
            System.out.println(as);
        }

    }

    public static boolean isSquare(int n) {
        double squareroot=  Math.sqrt(n);
        if (n%squareroot==0){
            return true;
        }
        return false;
    }

    public static String greet(String name){
        String[] names= name.split("");
        String str="";
        for (int i = 1; i < names.length; i++) {
            str+=names[0].toUpperCase();
            str+=names[i].toLowerCase();
        }
        return "Hello "+ str +"!";
    }

}

package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SlidingArray {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here

        System.out.println(m + "m");
        List<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.size()-1; i++) {

            //[2 3 7 8 9]
            // check the sum of two numbers of the array that is equal to m

            for (int j = i+1; j < arr.size(); j++) {
                if( arr.get(i) + arr.get(j) == m){
                    System.out.println(arr.get(i));
                    System.out.println(arr.get(j));
                    arr1.add(i+1);
                    arr1.add(j + 1);
                }
            }
        }
        return arr1;
    }
}

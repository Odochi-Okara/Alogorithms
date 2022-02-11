package com.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Algorithms {
    public static void main(String[] args) {

        int [] arr1= {1,7,3};
        int[] arr2= {1,3,5};
        Set<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {set1.add(arr1[i]);}

        for (int i = 0; i < arr2.length; i++) {set1.add(arr2[i]);}

        set1.stream().collect(Collectors.toList()).stream().distinct().sorted().toArray();
        System.out.println(set1);



    }
}

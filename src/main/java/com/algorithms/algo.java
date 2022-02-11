package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algo {
    public static void main(String[] args) {
        int num = 2;
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 =new int[arr.length];
        String result ="";


        for (int i = arr.length-num; i < arr.length; i++) {
            result = result+arr[i];
        }
        for (int i = 0; i < arr.length-num; i++) {
            result = result+arr[i] ;
        }
        String[] str= result.split("");
        for (int i = 0; i < str.length; i++) {
            arr1[i] = Integer.parseInt(str[i]);
        }

        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr1));
//        int[] newArray;
//        for (int i = 0; i < list.size(); i++) newArray[i] = (Integer) list.get(i);
//        System.out.println( newArray[1].getClass());

//        System.out.println(Arrays.toString(arr1.toArray()));
//        var temp = arr1.toArray();
//        temp[5] = "String";
//        System.out.println(arr1.toArray().getClass());
//        System.out.println(Arrays.toString(temp));
    }

    @Override
    public String toString() {
        return "algo{}";
    }
}

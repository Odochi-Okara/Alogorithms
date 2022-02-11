package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

    public static void main(String[] args) {

        String[] arr3= {"NORTH", "SOUTH", "EAST", "WEST","WEST"};
        DirReduction reduction = new DirReduction();
        reduction.dirReduc(arr3);


    }
        static class DirReduction{
            public  String[] dirReduc(String[] arr){


                for (int i = 0; i < arr.length-1; i++) {
                    if(( "NORTH".equals(arr[i] ) &&   "SOUTH".equals(arr[i+1])) ||
                            ("SOUTH".equals(arr[i] ) &&   "NORTH".equals(arr[i+1]))||
                            ("WEST".equals(arr[i] ) &&   "EAST".equals(arr[i+1]))||
                            ("EAST".equals(arr[i] ) &&   "WEST".equals(arr[i+1]))){
                        arr[i] = null;
                        arr[i+1] = null;
                    }
                }
                if (arr.length<=1 || arr == null){
                    return arr;
                }

                final String[] arr2 =Arrays.stream(arr).filter(x-> x != null).toArray(String[]::new);

                if (arr2.length == arr.length){
                    return arr;
                } else {
                    return dirReduc(arr2);
                }
            }
        }


}

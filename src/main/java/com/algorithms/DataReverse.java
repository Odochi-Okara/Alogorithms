//package com.algorithms;
//
//import java.util.Arrays;
//
//public class DataReverse {
//    public static void main(String[] args) {
//        System.out.println(15/2);
//        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
//        Kata kata = new Kata();
//        System.out.println(kata.DataReverse(data1));
//    }
//    static class Kata {
//         String[] DataReverse(int[] data) {
//
//             String[] arr = Arrays.stream(data).mapToObj(String::valueOf).toArray(String[]::new);
//             String[] arr2= new String[8];
//             int c =0;
//
//             for (int i = 8; i < arr[i].length(); i++) {
//                    arr2[c] += arr[i].charAt(i);
//                 System.out.println(arr2);
//             }
//            return Arrays.toString(arr2);
//        }
//    }
//}

package com.algorithms;

public class Reg {
    public static void main(String[] args) {
        String first = "coffee";
        String second = "eecoff";
        System.out.println(first.indexOf(second));

            if (first.length() != second.length()){
                System.out.println(-1);
            }
        System.out.println(second.concat(second).indexOf(first));
        }
        }
//        int count = 0;
//        int u = -1;
//        String[] arr = first.split("");
//        String[] arr2 = second.split("");
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i].equals(arr2[arr.length-1])){count++;}
//            return count;
//        }
//
//
//      return count;
//    }



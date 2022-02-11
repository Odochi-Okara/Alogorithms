package com.algorithms;

import java.util.Arrays;

public class DescendingOrder {

  public static void main(String[] args) {
    System.out.println(sortDesc(123456789));;
  }
   static int sortDesc(final int num) {
    //Your code
    String str  = String.valueOf(num);
    String [] arr = str.split("");
    Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
     String str1 ="";

    for (int i = arr.length-1; i >= 0; i--) {
       str1 += arr[i];
    }
    return Integer.valueOf(str1);
  }
}
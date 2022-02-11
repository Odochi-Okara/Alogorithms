package com.algorithms;

import java.util.Arrays;

public class DoubleEveryOther{
   public static void main(String[] args) {

//      -1000,3306,210,0,1
      int[] numbers = {-1000,1653,210,0,1};
      System.out.println(doubleEveryOther(numbers));
      System.out.println(1%2);
   }
    static int[] doubleEveryOther(int[] a){
        //solution
       int count = a.length-2;
       int [] doubledNumbers = new int[a.length];

       if (a.length%2 == 0) {
          for (int i = a.length - 1; i > 0; i = i - 2) {

             doubledNumbers[i] = (a[i] + a[i]);
             doubledNumbers[count] = a[count];
             count = count - 2;

          }
          return doubledNumbers;
       }
       count = a.length-1;
       for (int i = a.length - 2; i > -1; i = i - 2) {

          doubledNumbers[count] = a[count];
          doubledNumbers[i] = (a[i] + a[i]);
          doubledNumbers[0] = a[0];

          count = count - 2;
       }

       return doubledNumbers;
   }
}
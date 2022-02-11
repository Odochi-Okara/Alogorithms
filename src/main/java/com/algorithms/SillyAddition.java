package com.algorithms;

import java.util.Arrays;

public class SillyAddition {
    public static void main(String[] args) {
        System.out.println(silly(1222,81));
    }

    public static int silly(int num1, int num2){

        String str = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        System.out.println(str.length()-str2.length());
        if(str.length()>str2.length()){
            for (int i=0;i<str.length()-str2.length()+1;i++)
        {
            str2 = "0"+str2;
            System.out.println(i);
            System.out.println(str2);
        }}

        if (str.length()<str2.length()){

            for (int i=0;i<str2.length()-str.length()+1;i++)
            {
                str = "0"+str;
                System.out.println(str);
            }}

        String newStr2 ="";

        for (int i = 0; i < str2.length(); i++) {
            int digits = Character.getNumericValue(str.charAt(i));
            int digits2 = Character.getNumericValue(str2.charAt(i));
            newStr2 += digits2 + digits;
        }
          return Integer.valueOf(newStr2);


//        System.out.println(num1/10);
//        String str1 = String.valueOf(num1);
//        String str2 = String.valueOf(num2);
//
//
//        String newStr = "";
//        String newStr1 = "";
//        String newStr2 = "";
//
//        int sum= 0;
//        String[] arr1;
//        String[] arr2;
//
//        if(str1.length()>str2.length()) {
//            newStr2 = "0" + str2;
//             arr1 = str1.split("");
//             arr2 = newStr2.split("");
//            System.out.println(Arrays.toString(arr2));
//
//        }
//          else {
//              newStr1 = "0" + str1;
//             arr1 = newStr1.split("");
//            System.out.println(Arrays.toString(arr1));
//             arr2 = str2.split("");
//          }
//
//        for (int i = 0; i < arr2.length; i++) {
//            sum = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]);
//            System.out.println(sum);
//            newStr+=sum;
//
//        }
//
//            return Integer.parseInt(newStr);


        }

}

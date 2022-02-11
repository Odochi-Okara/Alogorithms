package com.algorithms;

public class Factorial {

    public static void main(String[] args) {
        int n = 77;
//        int factorial = 1;
//        String str = "";
//        int length = 0;

//        int i = 0;
//        if(n > 1) {
//            while (i < n) {
//                factorial *= (n - i);
//                i++;
//                System.out.println(factorial);
//            }
//
//             str = Integer.toString(factorial);
//             length = str.length();
//            System.out.println(length);
//        }
//
//            str = Integer.toString(factorial);
//            length = str.length();
//            System.out.println(length);


        for (int i = n-1 ; i >0 ; i--) {
            System.out.println(i);
            n*=i;

            System.out.println(n);
        }
        System.out.println(n);


    }
}

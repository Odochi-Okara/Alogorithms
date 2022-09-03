package com.algorithms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
        System.out.println((fibo(7)));
    }
    public static int fibo(int index){
        if(index==0){
            return 0;
        }
        if (index== 1){
            return 1;
        }

        System.out.println(1/0);
        return fibo(index-1)+fibo(index-2);
    }
}

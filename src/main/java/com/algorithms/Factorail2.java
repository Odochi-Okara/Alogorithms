package com.algorithms;

public class Factorail2 {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    static int fact(int n){
//        System.out.println(n);
        if(n==0){
            return 1;
        }
//        System.out.println(n);
        System.out.println(n* fact(n-1));
        return n* fact(n-1);
    }
}

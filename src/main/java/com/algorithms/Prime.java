package com.algorithms;

public class Prime {

    public static void main(String[] args) {
        System.out.println(isPrime(35));

    }
    // 26 / 2 = 13
    // 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79
    public static boolean isPrime(int num) {
        if(num<2) return false;
        if(num%2==0) return false;

        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if(num%i==0) return false;

        }
        return true;
    }
}

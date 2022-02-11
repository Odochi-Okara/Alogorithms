package com.algorithms;

public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);


    int result2 = sum2(5, 10);
    System.out.println(result2);
}

public static int sum2(int start, int end) {
    if (end > start) {
        return end + sum2(7, end - 1);
    } else {
        return end;
    }
}

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1); // recursion
        } else {
            return 0;
        }
    }
}

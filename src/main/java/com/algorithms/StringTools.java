package com.algorithms;

public class StringTools {
    public static void main(String[] args) {
        DecTools tools = new DecTools();
        System.out.println(tools.Digits(100l));
    }

     static class DecTools {
         static int Digits(long n) {
             String x = Long.toString(n);
             int count = 1;
             for (int i = 0; i < x.length()-1; i++) {
                 count++;
             }
            return count;
        }
    }
}

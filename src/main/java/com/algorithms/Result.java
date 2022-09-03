package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    public static void main(String[] args) {
        sockMerchant(9, new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            int count = 0;
            for (int j = 1; j < ar.size(); j++) {
                if(ar.get(i) == ar.get(j)){
                    System.out.println(i + "i");
                    System.out.println(j + "jj");
                    // System.out.println(ar.get(j) + " jjjjjjjj");
                    count++;
                    System.out.println(count);
                }
            }
            sum = (count + 1) /2;
        }
        return sum;
    }

}
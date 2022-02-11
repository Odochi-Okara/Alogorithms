package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class IncrementNumberByPosition {
    public static void main(String[] args) {
        Kata kata = new Kata();
        //5, 8, 0, 5, 8
        int[ ] arr ={4, 6, 7, 1, 3};
        System.out.println(Arrays.toString(kata.incrementer(arr)));
    }

    static class Kata {

        int[] incrementer(int[] numbers) {

            if(numbers.length==0){return numbers;}

            int[] arrs = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                arrs[i] = numbers[i]+(i+1);
                if(arrs[i] > 9){
                    arrs[i] = arrs[i]%10;

                    System.out.println(Arrays.toString(arrs));
                }
                System.out.println(Arrays.toString(arrs));
            }
            return arrs;
        }
    }
}

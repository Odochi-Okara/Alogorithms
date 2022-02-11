package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aldo {
    public static void main(String[] args) {
        int[] num = {3,6,7,8};
        int target = 11;
        int[] newArr = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]+num[j]==target){newArr[0]=(num[i]);newArr[1]=(num[j]);break;}
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}

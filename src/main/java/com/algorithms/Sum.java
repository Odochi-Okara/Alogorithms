package com.algorithms;

import java.util.stream.IntStream;

public class Sum{
    public int GetSum(int a, int b){
        int Sum = 0;

        if(a == b) return a;
        if(a<b){
            for (int i = a; i <=b; i++) {
                Sum +=i;
            }
        }
        else {return GetSum(b,a);}
        return Sum;
    }
}
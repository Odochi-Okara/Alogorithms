package com.practice;

import java.util.Arrays;
import java.util.List;

public class ForLoopToLam {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6);
        list.forEach((x )-> System.out.println(x));
    }
}

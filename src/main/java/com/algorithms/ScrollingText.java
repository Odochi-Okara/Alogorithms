package com.algorithms;

import java.util.Arrays;

public class ScrollingText {

    public static void main(String[] args) {
        System.out.println(scrollingText("codewars").toString());
    }
    static String[] scrollingText(String text) {

        String newText = text.toUpperCase();
        String[] arr = new String[newText.length()];
        arr[0] = newText;

        for (int i = 1; i < newText.length(); i++) {
            String sub = newText.substring(i);
            String sub2 = newText.substring(0,i);
            arr[i]= " " + sub + sub2;
        }
        return arr;
    }
}

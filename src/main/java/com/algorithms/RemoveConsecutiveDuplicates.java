package com.algorithms;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

    static String removeConsecutiveDuplicates(String s) {
        String[] array = s.split(" ");
        String str =array[0];

        for (int i = 1; i < array.length - 1; i++) {
            if(!array[i].equals(array[i+1])){
                str+=" "+array[i];
            }
        }
        return str;
    }
}
package com.algorithms;

import java.util.HashSet;

public class Week9ChallangeString {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println(program.longestSubstringWithoutDuplication("clementisacap"));


    }
    static class Program {
         String longestSubstringWithoutDuplication(String str) {
            // Write your code here
             int pointer2 = 1;
             String str2 ="";
             HashSet<Character> set = new HashSet<>();
             for (int i = 0; i < str.length()-1; i++) {
                 if (str.charAt(pointer2)!=str.charAt(i)){
                     str2+= str.charAt(i);
                     pointer2++;
                 }
                 else {
                     str2.substring(i);
                 }
             }
            return str2;
        }
    }

}

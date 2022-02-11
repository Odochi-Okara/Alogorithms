package com.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ValidWordString {

    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter();
        System.out.println(counter.validateWord("abacabcd"));
    }
    static class CharacterCounter {

         boolean validateWord(String word) {
            // your code here

//             char current = word.charAt(0);
//             int count = 0;
//
//             for (int i = 1; i < word.length(); i++) {
//                 if(current==word.charAt(i++)){
//                     count++;
//                     if(count>1){
//                         return false;
//                     }
//                 }
//             }
//             System.out.println(count);
//             String[] arr = word.split("");
//             Long unique = Arrays.stream(arr).distinct().count();
//
//             System.out.println(unique);
//             if(unique== word.length()){
//                 return true;
//             }
             return true;
        }
    }
}

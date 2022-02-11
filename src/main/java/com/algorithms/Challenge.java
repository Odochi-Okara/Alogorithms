package com.algorithms;

class Challenge {
    public static void main(String[] args) {
        System.out.println(primeString("aab"));
    }
     static boolean primeString(String s) {
         for (int i = 0; i < s.length() / 2 + 1; i++) {
             String temp = s.replace(s.substring(0, i), s.substring(0, i) + " ");
             System.out.println(temp);
         }
            return (s+s).indexOf(s,1) == s.length();
    }

}

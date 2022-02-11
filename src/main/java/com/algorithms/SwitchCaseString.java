package com.algorithms;

public class SwitchCaseString {
    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println(kata.alternateCase("aBc"));
    }
    static class Kata {
         String alternateCase(final String string) {


            char[] c = string.toCharArray();
             for (int i = 0; i < string.length(); i++) {
                 if(Character.isLowerCase(string.charAt(i))){
                     c[i] = Character.toUpperCase(string.charAt(i));
                 }
                 else{
                 c[i] = Character.toLowerCase(string.charAt(i));}
             }
            return String.valueOf(c);
        }
    }
}

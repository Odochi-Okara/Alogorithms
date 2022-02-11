package com.algorithms;

public class CharacterCounter {
  public static void main(String[] args) {
    validateWord("Abca");
    String u = "ihdjd";
      System.out.println(u.substring(1));
  }
   static boolean validateWord(String word) {
    // your code here
    int count = 0;
    for (int i = 0; i < word.length()-1; i++) {
        word = word.substring(i+1);
      for (int j = 1; j < word.length(); j++) {
        System.out.println(word.charAt(i));
        System.out.println(word.charAt(j) + " "+j);

      }

    }
    return true;
  }
}
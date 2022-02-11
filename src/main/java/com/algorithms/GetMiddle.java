package com.algorithms;

class GetMiddle {
  public static void main(String[] args) {
    System.out.println(getMiddle("1237"));
    System.out.println(5/2);
  }
   static String getMiddle(String word) {
    //Code goes here!
     if (word.length() == 1) {
       return word;
     }
     int half = word.length()/2;

    if(word.length()%2 == 0){
        word = word.substring(half-1, half+1);
        return word;
    }
//    return word.substring(1, 2);
     else {
       word = word.substring(half, half+1);
    }
     return word;
    }
  }

package com.algorithms;

import java.util.Arrays;

class StrayNumber {
  public static void main(String[] args) {
int[] numbers = {17, 17, 17, 17, 17, 17, 17,20};
    System.out.println(stray(numbers));
  }
  static int stray(int[] numbers) {

    Arrays.sort(numbers);
    if(numbers[0] != numbers [1]){
      return numbers[0];
    }
    return numbers[numbers.length-1];
  }
}
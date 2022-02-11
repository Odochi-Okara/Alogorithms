package com.algorithms;

public class DivisibleBy13 {
    public static void main(String[] args) {
        Thirteen thirteen = new Thirteen();
        thirteen.thirt(321);
    }
    static class Thirteen {

         long thirt(long n) {
            // your code

             String numberString = String.valueOf(n);
             String s ="";
             int sum =0;
             int count = 0;
             for (int i = 0; i <numberString.length(); i++) {
                 sum += (int) (Character.getNumericValue(numberString.charAt(numberString.length()-i-1))*((Math.pow(10,i))%13));

             }
             if (sum == n) return n;
             return thirt(sum);


//            System.out.println(1%13); //1
//            System.out.println(10%13); //10
//            System.out.println(100%13); //9
//            System.out.println(1000%13); //12
//            System.out.println(10000%13); //3
//            System.out.println(100000%13); //4

        }
    }
}

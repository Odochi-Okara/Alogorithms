package com.algorithms;

public class SquareEachDigits {
    public static void main(String[] args) {
    SquareDigit squareDigit =new SquareDigit();
    squareDigit.squareDigits(50);

    int num = 929;
    int num2 = num%10;
    int num3 = (num/10)%10;
    System.out.println(num3);
        System.out.println((num/100)%10);
    }
    static class SquareDigit {

         int squareDigits(int n) {
            // TODO Implement me
             //square each strings
             
             //change int to string
             String str = String.valueOf(n);

             String str2="";

             for (int i = 0; i < str.length(); i++) {

//                 str2 +=  Character.valueOf(str.charAt(i))*Character.valueOf(str.charAt(i)); this was not working

                 System.out.println(9%10);
                 Character.getNumericValue(str.charAt(i));// this is to get the numerical value of a character


                 int digits = Character.digit(str.charAt(i),10); // to get the numerical value of a character
                 str2+= digits*digits;

             }
                return Integer.valueOf(str2);


             // Another solution
//             if (n < 10) return n * n;
//             else {
//                 int h = squareDigits(n / 10);
//                 int l = n % 10;
//                 return Integer.parseInt(h + "" + l * l);
//             }
         }

    }
}

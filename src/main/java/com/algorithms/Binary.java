package com.algorithms;

public class Binary {
    public static void main(String[] args) {
        long val = 9;
        String str = Long.toBinaryString(val);
        System.out.println(str);

        String newStr = "";
        int result=0;
        int count = 0;
        for (int i = str.length()-1; i >-1 ; i--) {
            newStr+= str.charAt(i);

        }
        for(int i=newStr.length()-1;i>=0;i--){

            if(newStr.charAt(i)=='1')result+=(int)Math.pow(2, count);
            count++;
        }
//        System.out.println(newStr);
        int num = Integer.parseInt(newStr);
//        System.out.println(result);

//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();
//         sb.toString();
//         Integer.valueOf(sb);
//
//        System.out.println(sb);
//        int num = Integer.valueOf(sb);
    }


}

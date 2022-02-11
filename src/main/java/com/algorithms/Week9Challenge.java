package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week9Challenge {
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.highAndLow("2 5 6 4 9");
    }

    static class Challenge {
        String highAndLow(String numbers) {
            

            String[] arr =  numbers.split(" ");
            List<Integer> arrayList = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                arrayList.add(Integer.valueOf(arr[i]));
            }

            String ans = arrayList.get(arrayList.size() - 1)+" " +arrayList.get(0);
            System.out.println(ans);
                return ans;
            }
        }
    }


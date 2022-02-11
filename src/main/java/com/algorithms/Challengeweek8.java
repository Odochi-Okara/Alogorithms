package com.algorithms;

import java.util.ArrayList;

public class Challengeweek8 {
    public static void main(String[] args) {

        Challenge challenge = new Challenge();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(2);
//        arr.add(6);
//        arr.add(20);
//        arr.add(15);
//        arr.add(14);
//        arr.add(7);

        //{3, 5, 4, 8, 7, 6, 9, 11, 13, 12, 15, 1}


        System.out.println(challenge. minimumSwaps(arr));
    }

    static class Challenge {
          int minimumSwaps(ArrayList<Integer> ratings) {


            int count = 0;

            int current = ratings.get(0);
            int next = ratings.get(1);



            for(int i = 0; i<ratings.size()-1; i++){


                current = ratings.get(i);
                next = ratings.get(i+1);

                if(current < next){
                    count ++;
                    ratings.set(i,next);
                    ratings.set(i+1,current);
//                    next = current;
//                    current= next;



                    System.out.println(count);
                }
            }
            return count;
        }
    }
}

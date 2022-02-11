package com.algorithms;

import java.util.ArrayList;

public class ChallengeTuesday {

    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
//        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
//        list.add();
        System.out.println(challenge.sjf(list,3));
    }
    static class Challenge {
         int sjf(ArrayList<Integer> jobs, int index) {

             int sum = jobs.get(index);
            for (int i = 0; i < jobs.size(); i++) {

                int max = jobs.get(index);

                if(  max>= jobs.get(i) || max== jobs.get(jobs.size()-1)){
                    sum+=jobs.get(i);
                    System.out.println(sum);
                    return sum;
                }
                else if (max> jobs.get(i)|| max==jobs.get(i)){
                    sum+=jobs.get(i);
//                    System.out.println(sum);
                    return sum-(jobs.get(index));
                }


            }

            return 1;//sum-(jobs.get(index));
        }
    }
}

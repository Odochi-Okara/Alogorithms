package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class AtmMachine {
    public static void main(String[] args) {
        //[1,1,4] 230-100=130  130-50 = 80 80/20=4
        List<Integer> denomination = new ArrayList<>();
        int num = 230;
        int bill100 = num/100;
        System.out.println(bill100);

        int remainder100 = num%100;

        int bill50=(remainder100)/50;

        int remainder50 = remainder100%50;

        int bill20= remainder50/20;

        if(remainder50 % 20 != 0) {bill50=0; bill20= remainder100/20; }
        System.out.println(bill50);
        System.out.println(bill20);

        denomination.add(bill100);

        denomination.add(bill50);

        denomination.add(bill20);
        System.out.println(denomination);



    }
}

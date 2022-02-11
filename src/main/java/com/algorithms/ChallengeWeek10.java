//package com.algorithms;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ChallengeWeek10 {
//    public static void main(String[] args) {
//        String[] arr = {"gather:field:wheat","bake:flour:bread","mill:wheat:flour"};
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
//     findProcesses("field","bread", list);
//    }
//
//     static List<String> findProcesses(
//            String start_item,
//            String end_item,
//            List<String> tasks
//    ) {
//
////        var splitIndexes = new String[tasks.size()*2];
//         String str ="";
//         for (int i = 0; i < tasks.size(); i++) {
//             var splitIndexes = tasks.get(i).split(":");
//             str+= splitIndexes[i]+" "+splitIndexes[1]+" "+splitIndexes[2]+" ";
//            }
//         System.out.println(str);
//        var str2 = str.split(" ");
//
//         for (int i = 0; i < str2.length; i++) {
//             if(!end_item.equals(str2[i])){
//                 return new ArrayList<String>();
//             }
//
//             return
//         }
//
//        return new ArrayList<String>();
//    }
//}

package com.dataStructures;

public class LinkedListToString {


        public static String stringify(Node2 list) {
            // Your code here.
            int nextData = list.getData();
            Node2 next = list.getNext();
            String str="";
            while(next != null){
                str +=" -> " + String.valueOf(next.getData());
                next = list.getNext();

            }


            return str + " -> ";
        }

    }


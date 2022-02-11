package com.dataStructures;

public class Node3 {


        int data;
        Node next = null;

        Node3(final int data) {
            this.data = data;
        }

        public Node3(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public static Node3 append(Node3 listA, Node3 listB) {
            while(listA.next!=null){
                if(listA.next ==null ){
                    listA.next= listB.next;
                }
            }

                return listA;
        }
}

//package com.dataStructures;
//
//
//
//public class LinkedList {
//    Node head;
//
//    public void  insert(int data){
//        Node nodea = new Node(data);
//        nodea.next= null;
//
//        if(head == null){
//            head = nodea;
//        }
//        else {
//            Node n = head;
//            while (n.next!= null){
//               n = n.next;
//            }
//            n.next = nodea;
//        }
//    }
//    public void show(){
//        Node n = head;
//        while (n.next!=null){
//
//            System.out.println(n.data);
//            n = n.next;
//        }
//        System.out.println(n.data);
//
//    }
//
//}

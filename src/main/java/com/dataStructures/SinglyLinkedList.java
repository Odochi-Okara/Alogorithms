//package com.dataStructures;
//
//import java.util.LinkedList;
//import java.util.List;
//public class SinglyLinkedList {
//    class Node {
//
//        int data;
//        Node next = null;
//
//        Node(final int data) {
//            this.data = data;
//        }
//
//        public Node(int data, Node next) {
//            this.data = data;
//            this.next = next;
//        }
//
//        public static Node append(Node listA, Node listB) {
//            if (listA == null) {
//                return listB;
//            }
//            Node tmp = listA;
//            while (tmp.next != null) {
//                tmp = tmp.next;
//            }
//            tmp.next = listB;
//            return listA;
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//
//        LinkedList sList = new LinkedList();
//
//        //Add nodes to the list
//         head = sList.add(1);
//        sList.add(2);
//        sList.add(3);
//        sList.add(4);
//
//        //Displays the nodes present in the list
//        System.out.println(sList);
//    }
//}
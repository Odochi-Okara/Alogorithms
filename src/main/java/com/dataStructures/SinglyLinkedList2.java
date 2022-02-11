package com.dataStructures;

import java.util.LinkedList;
import java.util.List;



public class SinglyLinkedList2 {


 private Node head;
 private Node tail;
 int size;
 private Node currentNode;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.getData());
            if (temp.getNextNode() != null) {
                sb.append(", ");
            }
            temp = temp.getNextNode();
        }
        sb.append(" ]");
        return sb.toString();
    }

    public Node add(int data){
      Node node = new Node(data);
      if(head==null){

           head = node;
           tail = node;
           size++;
      }
      else {
          Node temp = tail;
          temp.setNextNode(node);
          tail = tail.getNextNode();
          size++;
      }
//     System.out.println(node.getData());
      return node;


 }

    public Node addAtHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            node.setNextNode(head);
            head = node;
            size++;
        }
//     System.out.println(node.getData());
        return node;
    }

//    public Node addAtIndex(int position, int data){
//        Node temps = head;
//        if(position>size){
//            throw new IllegalArgumentException("invalid position");
//        }
//        else {
//            Node node = new Node(data);
//            for (int i = 0; i < size; i++) {
//                if(i==position){
//                    temps
//                }
//
//            }
//
//            }
//        }
//    }


    public static void main(String[] args) {
        SinglyLinkedList2 list = new SinglyLinkedList2();
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list.head.getData());
        System.out.println(list.tail.getData());
        System.out.println(list);

        SinglyLinkedList2 list1 = new SinglyLinkedList2();
        list1.addAtHead(2);
        list1.addAtHead(8);
        list1.addAtHead(9);
        list1.addAtHead(10);

//        list.addAtHead(3);
        System.out.println("0000000000000000000000000");
        System.out.println(list1.head.getData());
        System.out.println(list1);
    }
}

 class Node{
     private Integer data;
     private Node nextNode;

     public Node(Integer data) {
          this.data = data;
     }

     public Integer getData() {
          return data;
     }

     public void setData(Integer data) {
          this.data = data;
     }

     public Node getNextNode() {
          return nextNode;
     }

     public void setNextNode(Node nextNode) {
          this.nextNode = nextNode;
     }
}



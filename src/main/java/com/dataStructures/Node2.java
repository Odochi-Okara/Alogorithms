package com.dataStructures;

public class Node2 {
    private int data;
    private Node2 next;

    public Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node2 getNext() {
        return next;
    }
}

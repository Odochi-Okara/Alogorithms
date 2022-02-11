package com.functional;

public class MyInterfaceClass {
    public void myMethod(){
        System.out.println("instance");

    }

    public static void main(String[] args) {
        MyInterfaceClass obj = new MyInterfaceClass();
        MyInterface ref = obj::myMethod;
        ref.display();
    }

}

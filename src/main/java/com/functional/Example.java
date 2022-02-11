package com.functional;

public class Example {
    public static void main(String[] args) {
//        MyFunctionalInterface o = ()->{
//            return "Hello";}
//        System.out.println(o.sayHello());
//

        MyFunctionalInterface r = (num) -> num*3;
        System.out.println(r.multi(6));
    };
}

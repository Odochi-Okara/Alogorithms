package com.practice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("odo", 5555)); // classes can be instantiated like this
        //normal java function
        Customer maria= new Customer("Maria", 6666); // and like this
        greetCustomer(maria);

        //consumer
        Consumer<Customer> consumer= customer -> System.out.println("Hi, "+ customer.name);
        consumer.accept(maria);

        //bi consumer
        BiConsumer<Customer,Boolean> biConsumer = ((customer, aBoolean) -> System.out.println("Hi "+ customer.name+", thanks for registering your "+ (aBoolean?customer.number:"******")) );
        biConsumer.accept(maria,true);

    }

    static void greetCustomer(Customer customer){
        System.out.println("Hi "+ customer.name+", thanks for registering your"+ customer.number);
    }

    static class Customer {
        private final String name;
        private final int number;

        public Customer(String name, int number) {
            this.name = name;
            this.number = number;
        }
    }
}

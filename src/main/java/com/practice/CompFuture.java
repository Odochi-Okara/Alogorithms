package com.practice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture =  CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'll run in a separate thread than the main thread.");
            }
        });

        CompletableFuture<Void> voidCompletableFuture =CompletableFuture.runAsync(()->{
            System.out.println("Hello");
        });


        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        });

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->{
           return "HELLO";
        });


        completableFuture.get();

        System.out.println(completableFuture1.get());
    }
}

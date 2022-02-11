package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteableFut {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String[]> future = CompletableFuture.supplyAsync(() -> {


            List<Integer> list = Arrays.asList(5,9,14);

            String[] list1=list.stream().map(n-> String.valueOf(n)).toArray(String[]::new);
            return list1;
        });
        System.out.println(Arrays.toString(future.get()));

    }
}

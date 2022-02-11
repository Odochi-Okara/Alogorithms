package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureExample1 {
    public static void main(String[] args)
    {
        try
        {
            List<Integer> list = Arrays.asList(5,9,14);
            list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num))).map(CompletableFuture->CompletableFuture
                    .thenApply(n->String.valueOf(n))).map(t->t.join()).collect(Collectors.toList()).forEach(s->System.out.printf("%d ",s));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static int getNumber(int a)
    {
        return a;
    }
}
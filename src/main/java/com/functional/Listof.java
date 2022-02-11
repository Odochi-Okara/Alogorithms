package com.functional;

import java.util.ArrayList;
import java.util.List;

public class Listof {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Odochi");
        list.add("Samuel");
        list.add("Flora");
list.forEach(System.out::println);
    }
}

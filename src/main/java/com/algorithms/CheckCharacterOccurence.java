package com.algorithms;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class CheckCharacterOccurence {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Wande coal");
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(stringBuilder1.capacity());
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String[] arr = {"Owerri","Enugu"};

        GreetMe.main(arr);
        File file = new File("/Users/odochi/IdeaProjects/OdochiP/Alogorithms");
        System.out.println(file.isDirectory());
        System.out.println(new Date(file.lastModified()));

//        Buffe
        Scanner scanner = new Scanner(System.in);

//        System.out.println(scanner.hasNext());
    }
}

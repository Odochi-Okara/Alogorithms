package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {
        List<Person> list = List.of(new Person("Odochi", Gender.FEMALE),
                new Person("Ifeanyichukwu", Gender.MALE),
                new Person("Emeka", Gender.MALE),
                new Person("Enoch", Gender.MALE),
                new Person("Makera", Gender.MALE),
                new Person("Jerry", Gender.MALE));

        //Declarative
        System.out.println(list.stream().filter(person->person.name.startsWith("E")).collect(Collectors.toList()).size());
        System.out.println(list.stream().filter(person->person.name.startsWith("E")).count());


        //Imperative
        List<Person> lists = new ArrayList<>();
        for (Person person: list) {
            if (person.name.startsWith("E")){
                lists.add(person);
            }
        }
        System.out.println(lists.size());

        int count=0;
        for (Person person:list) {
            if (person.name.startsWith("E"))
                count++;
        }
        System.out.println(count);
    }


    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    static enum Gender{
        FEMALE,MALE
    }
}

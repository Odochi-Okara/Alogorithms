package com.practice;

import java.util.List;
import java.util.stream.Collectors;

public class _Streams {
    public static void main(String[] args) {
        List<Person> personList= List.of(
                new Person("Odochi", Gender.FEMALE),
                new Person("Layefa", Gender.MALE),
                new Person("Buso", Gender.FEMALE),
                new Person("Layefa", Gender.MALE)

        );
//        personList.stream().map(person -> person.name).mapToInt(name->name.length()).forEach(System.out::println);
//        personList.stream().map(p-> p.name).collect(Collectors.toList()).stream().distinct().forEach(System.out::println);
        System.out.println(personList.stream().anyMatch(person -> Gender.FEMALE.equals(person.gender)));
    }


    static class Person{
        private final String name;
        private final  Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }


    static enum Gender {
        MALE,FEMALE
    }
}

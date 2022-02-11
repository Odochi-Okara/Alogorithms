package com.practice;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
//       Person person= new Person("Odochi",null, "civil");
//        System.out.println(person.getEmail().map(x-> x.toLowerCase()).orElse("No email entered"));// optinal method



        // normal java programming
//        if(person.getEmail().isPresent()){
//            String mail = person.getEmail().get();
//            System.out.println(mail.toLowerCase());
//        }
//        else {
//            System.out.println("email not found");
//        }

        Optional.ofNullable(null).ifPresentOrElse(mail-> System.out.println("Sending mail to "+ mail),()-> System.out.println("cannot send mail"));
    }
}
//  class Person{
//    private final String name;
//    private final String email;
//    private final String job;
//
//      public Person(String name, String email, String job) {
//          this.name = name;
//          this.job = job;
//          this.email = email;
//      }
//
//      public String getName() {
//          return name;
//      }
//
//      public Optional <String> getEmail() {
//          return Optional.ofNullable(email);
//      }
//
//      public String getJob() {
//          return job;
//      }
//  }
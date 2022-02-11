package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Implentation {
    public static void main(String[] args) {
        Map<Book, Borrower> listOfBorrowedBooks = new HashMap<>();
        listOfBorrowedBooks.put(new Book("Biology", "Odochi"),new Borrower("Buso",Role.STUDENT));
        listOfBorrowedBooks.put(new Book("Maths", "Odochi"),new Borrower("Chidera",Role.STUDENT));
        listOfBorrowedBooks.put(new Book("Maths", "Odochi"),new Borrower("Kelechi",Role.STUDENT));

        listOfBorrowedBooks.entrySet().forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));
        listOfBorrowedBooks.entrySet().forEach(entry -> {});
//        for(Book book: listOfBorrowedBooks.keySet()){
//
//            if(Objects.equals(book.getName(), returnBookRequest.getBookNameToBorrow())){
//                library.addBookCopies(book.getName(),1);
//                listOfBorrowedBooks.remove(book);
//                notifyResponseListener(new Response(true,"You have successfully returned "+book.getName(),null),
//                        returnBookRequest.getBookBorrower());
//                return;
//            }
//
//        }
//
//        notifyResponseListener(new Response(false,"You cant return a book that you have not borrowed",null),
//                returnBookRequest.getBookBorrower());
    }
     static class Book{
        private final String name;
        private final String author;

         public Book(String name, String author) {
             this.name = name;
             this.author = author;
         }

         public String getName() {
             return name;
         }

         public String getAuthor() {
             return author;
         }

         @Override
         public String toString() {
             return "Book{" +
                     "name='" + name + '\'' +
                     ", author='" + author + '\'' +
                     '}';
         }
     }

     static class Borrower{
        private final String name;
        private final Role role;

         public Borrower(String name, Role role) {
             this.name = name;
             this.role = role;
         }

         public String getName() {
             return name;
         }

         public Role getRole() {
             return role;
         }

         @Override
         public String toString() {
             return "Borrower{" +
                     "name='" + name + '\'' +
                     ", role=" + role +
                     '}';
         }
     }
    enum Role{
        TEACHER, STUDENT
    }
}

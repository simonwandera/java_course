package com.CollectionsAndDataStructures;

import java.util.HashSet;
import java.util.Iterator;

class Book{
    int id;
    String title, author, publisher;

    public Book(int id, String title, String author, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }


}

public class HashSetPractise {
    private HashSet<String> hashSet = new HashSet<>();
    private HashSet<Book> library = new HashSet<>();
    public HashSetPractise() {
        hashSet.add("Michele");
        hashSet.add("Simon");
        hashSet.add("Whitney");
        hashSet.add("Jane");
        hashSet.add("Paul");
        hashSet.add("Maria");
        hashSet.add("Whitney");
        hashSet.add("Douglas");
        hashSet.add("Tabby");
        hashSet.add("James");
        hashSet.add("Whitney");



        Book book1 = new Book(1, "The Alchemist", "Paulo Coelho", "oxford Press");
        Book book2 = new Book(2, "Eleven Minutes", "Paulo Coelho", "oxford Press");
        Book book3 = new Book(3, "Rich dad", "Robert Kiyasaki", "oxford Press");
        Book book4 = new Book(4, "Talking to strangers", "Paulo Coelho", "oxford Press");
        Book book5 = new Book(5, "Weapons of math destruction", "Agnes Wairimu", "KLB Publishers");
        Book book6 = new Book(6, "Black and White", "Florence Mwangi", "Maseno publishers");

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);

    }
    public void iterratingElements(){
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void getBookHashset(){
        library.forEach(item ->{
            Book book = (Book) item;
            System.out.println(book.id + "\t "+book.author + "\t"+book.title + "\t"+ book.publisher);
        });
    }


}

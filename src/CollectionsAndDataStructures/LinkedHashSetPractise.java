package CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractise {
    private LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    private LinkedHashSet<Book> library = new LinkedHashSet<>();

    public LinkedHashSetPractise() {
        linkedHashSet.add("Cashy");
        linkedHashSet.add("Kelly");
        linkedHashSet.add("Stella");
        linkedHashSet.add("Mirrium");
        linkedHashSet.add("Amos");
        linkedHashSet.add("Felix");

        Book book1 = new Book(1,"The Bold and the beautiful", "James Korir", "Systech Publisher");
        Book book2 = new Book(2,"By the river piedra", "James Korir", "Systech Publisher");
        Book book3 = new Book(3,"Overcoming fear", "James Korir", "Systech Publisher");
        Book book4 = new Book(4,"Eleven minutes", "James Korir", "Systech Publisher");
        Book book5 = new Book(5,"The alchemist", "James Korir", "Systech Publisher");

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book2);

    }

    public void iteraticngHashset(){
        Iterator <String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void removeItemsInHashSet(){
        System.out.println("Before removing Amos, Kelly and Felix");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Amos");
        linkedHashSet.remove("Kelly");
        linkedHashSet.remove("Felix");
        System.out.println("After removing Amos, Kelly and Felix");
        System.out.println(linkedHashSet);
    }

    public void iterateCustomClassItems(){
        library.forEach(item ->{
            Book book = (Book) item;
            System.out.println(book.id + "\t" + book.publisher + "\t" + book.title + "\t"+ book.author);
        });
    }

    public void iteratingCustonClassUsinForEach(){
        System.out.println("Iterating using foreach");
        for (Book book: library) {
            System.out.println(book.id + "\t" + book.publisher + "\t" + book.title + "\t"+ book.author);
        }
    }


}

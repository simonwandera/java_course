package CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Bike {
    String type;
    String color;
    int bikeNumber;
    public Bike(String type, String color, int bikeNumber) {
        this.type = type;
        this.color = color;
        this.bikeNumber = bikeNumber;
    }
}

public class LinkedListPractise {
    private LinkedList<String> linkedList = new LinkedList<>();
    ArrayListPractise arrayListPractise = new ArrayListPractise();
    LinkedList<Bike> bicycles = new LinkedList<>();
    public LinkedListPractise() {

        linkedList.addAll(arrayListPractise.getArrayList());
        linkedList.add(3, "Valeria");
        linkedList.add("James");
        linkedList.addLast("Kiche");
        linkedList.add(3, "James");
        linkedList.add(5, "James");
        linkedList.addFirst("Erastus");
        System.out.println(linkedList);

        Bike bike1 = new Bike("Black Mamba", "Black", 101);
        Bike bike2 = new Bike("Mountain bike", "Yellow", 102);
        Bike bike3 = new Bike("Sports bike", "Green", 103);

        bicycles.add(bike1);
        bicycles.add(bike2);
        bicycles.add(bike3);

    }

    public void displayListItems(){
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void removeListItems(){
        System.out.println("Removing kevin from the Linked List");
        linkedList.remove("Kevin");
        System.out.println(linkedList);
        System.out.println("Removing item at index 2");
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println("Removing the first item");
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println("removing the last item");
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println("Removing the first occurence if item James");
        linkedList.removeFirstOccurrence("James");
        System.out.println(linkedList);
        System.out.println("Removing the last occurence of item James");
        linkedList.removeLastOccurrence("James");
        System.out.println(linkedList);
        System.out.println("clearing the linked list");
        linkedList.clear();
        System.out.println(linkedList);
    }

    public void reverseIterator(){
        Iterator iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void getBicycleItems(){
        System.out.println("Using enhanced for");
        for (Bike b: bicycles){
            System.out.println(b.bikeNumber + " " + b.type + " " + b.color);
        }

//        Using forEach method
        System.out.println("Using foreach() method");

        bicycles.forEach( item ->{
            Bike bicycle = (Bike) item;
            System.out.println(bicycle.bikeNumber + " " + bicycle.type + " " + bicycle.color);
        });

        System.out.println("Using an iterator");
        ListIterator<Bike> iterator = bicycles.listIterator();

        while (iterator.hasNext()){
            Bike bike = (Bike) iterator.next();
            System.out.println(bike.bikeNumber + " " + bike.type + " " + bike.color);
        }
    }
}

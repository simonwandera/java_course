package com.CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractise {
    private TreeSet<String> treeSet = new TreeSet<>();
    private TreeSet<Car> cars = new TreeSet<>();
    public TreeSetPractise() {
        treeSet.add("John");
        treeSet.add("Sam");
        treeSet.add("Moses");
        treeSet.add("Duncodi");
        treeSet.add("Nancy");
        treeSet.add("Rose Ann");

        Car car1 = new Car(1,"Toyota", "Toyota Kenya", 12);
        Car car2 = new Car(2,"Oppa", "Nissan sunny", 12);
        Car car3 = new Car(3,"Ford", "American cars", 12);
        Car car4 = new Car(4, "Tesla", "Tesla", 12);
        Car car5 = new Car(5,"Lamboghini", "BMW", 12);
        Car car6 = new Car(6,"Lexus", "V8", 12);
        Car car7 = new Car(7,"Range Rover", "Nissan", 12);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

    }

    public void iteratingItemsInATreeSet(){
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            break;
        }
//        using a descennding iterator

        Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
    }

    public void retrieveHighestAndLowest(){
        System.out.println("Lowest value: " + treeSet.pollLast());
        System.out.println("Highest value: " + treeSet.pollFirst());
    }

    public void treeSetOperations(){
        System.out.println("Initial set: " + treeSet);
        System.out.println("Reverse set: " + treeSet.descendingSet());
        System.out.println("Head set" + treeSet.headSet("Nancy", false));
        System.out.println("Initial set" + treeSet.tailSet("Moses", false));
        System.out.println("Initial set" + treeSet.tailSet("Moses", true));
        System.out.println(treeSet.ceiling("Moses"));
        System.out.println(treeSet.floor("Moses"));
        System.out.println("Last element using pollLast: " + treeSet.pollLast());
        System.out.println("Last element using last: " + treeSet.last());

        System.out.println("\nFirst element using pollFirst: " + treeSet.pollFirst());
        System.out.println("First element using first: " + treeSet.first());
        System.out.println(treeSet.toString().toLowerCase());
        System.out.println("Lower than Rose Sam: "+ treeSet.lower("Rose Sam"));
        System.out.println("Higher than Nancy: " + treeSet.higher("Nancy"));
        System.out.println(treeSet.stream().count());
        System.out.println(treeSet.size());

//        Retrieves and removes the least(first) element
//        System.out.println(treeSet.pollFirst());
//        Retrieves and removes the last elements
//        System.out.println(treeSet.pollLast());
        System.out.println("Subset: "+treeSet.subSet("Nancy", "Sam"));
    }

    public void generateClassElements(){
        cars.forEach(item ->{
            Car car = (Car) item;
            System.out.println(item.carId + "\t" +item.model+ "\t" + item.odometer + "\t" + item.manufacturer);
        });
    }

    public void soutClassElements(){
       for (Car car:cars){
           System.out.println(car.model);
       }
    }
}

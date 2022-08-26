package com.CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePractise {

    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    private PriorityQueue<Car> bikeQueue = new PriorityQueue<>();
    public PriorityQueuePractise() {

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(8);
        priorityQueue.add(9);
        priorityQueue.add(4);
        priorityQueue.add(5);

        Car car1 = new Car(1,"Toyota", "Toyota Kenya", 12);
        Car car2 = new Car(2,"Oppa", "Nissan sunny", 12);
        Car car3 = new Car(3,"Ford", "American cars", 12);
        Car car4 = new Car(4, "Tesla", "Tesla", 12);
        Car car5 = new Car(5,"Lamboghini", "BMW", 12);
        Car car6 = new Car(6,"Lexus", "V8", 12);
        Car car7 = new Car(7,"Range Rover", "Nissan", 12);

        bikeQueue.add(car1);
        bikeQueue.add(car2);
        bikeQueue.add(car3);
        bikeQueue.add(car4);
        bikeQueue.add(car5);
        bikeQueue.add(car6);
        bikeQueue.add(car7);

    }
    public void priorityQueueOperations(){

        System.out.println("Head: " + priorityQueue.element());
        System.out.println("Head: " + priorityQueue.peek());

    }
    public void IteratingPriorityQueues(){
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void removingElementsFromPriorityQueues(){
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
    public void iteratingClassElements(){
        bikeQueue.forEach(car -> {
            Car myCar = (Car) car;
            System.out.println(car.model+ "\t" + car.carId + "\t" + car.manufacturer);
        });
    }
}

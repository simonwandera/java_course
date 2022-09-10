package com.Random;

import java.util.ArrayList;
import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

     for(int i=0; i< 16; i++){
         myList.add("soldier" + i);
     }

        for(int i=0; i< (myList.size()/2); i++){
            myList.set(i, myList.get(i) + "Gun");
        }

    for (int i=(myList.size()/2); i< (myList.size() * 3/4); i++){
        myList.set(i, myList.get(i) + "Jet");
    }

    for (int i=(myList.size() * 3/4); i< myList.size(); i++){
        myList.set(i, myList.get(i) + "Bomb");
    }


    ArrayList<Car> cars = new ArrayList<>();

    Car car1 = new Car(1, "Toyota", "Toyota kenya", 12);
    Car car2 = new Car(2, "Toyota", "Toyota kenya", 12);
    Car car3 = new Car(4, "Toyota", "Toyota kenya", 12);
    Car car4 = new Car(5, "Toyota", "Toyota kenya", 12);

    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);

    for(int i=0; i<50; i++){
        System.out.println(new Random().nextInt(10));
    }


    for (int i=0; i<cars.size(); i++){
        cars.get(i).printer();
    }

    }
}

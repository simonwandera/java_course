package com.CollectionsAndDataStructures;

import java.awt.*;
import java.util.*;
import java.util.List;

class Car implements Comparable<Car>{
    int carId;
    String model;
    String manufacturer;
    int odometer;

    public Car(int carId, String model, String manufacturer, int odometer) {
        this.carId = carId;
        this.model = model;
        this.manufacturer = manufacturer;
        this.odometer = odometer;
    }

    @Override
    public int compareTo(Car car) {
        if(carId>car.carId){
            return 1;
        } else if (carId < car.carId) {
            return -1;
        }else {
            return 0;
        }
    }

}

public class ArrayListPractise {
    List<String> arrayList = new ArrayList();
    ArrayList<Car> myCars = new ArrayList<>();
    List<String> csClass = new ArrayList<>();
    List<String> csSoftwareEng = new ArrayList<>();

    Car c1 = new Car(1,"V8", "Ford", 180);
    Car c2 = new Car(2,"RandeRover", "Toyota", 100);
    Car c3 = new Car(3,"Lexus", "Nissan", 210);
    Car c4 = new Car(4,"Oppa","Totoya", 190);



    public ArrayListPractise() {

        this.arrayList.add("Simon");
        this.arrayList.add("Cloe");
        this.arrayList.add("Mark");
        this.arrayList.add("Kevin");
        this.arrayList.add("Calvin");
        this.arrayList.add("Japheth");
        this.arrayList.add("Jackie");
        this.arrayList.add("James");
        this.arrayList.add("Paul");

        this.csClass.add("Simon");
        this.csClass.add("Jackie");
        this.csClass.add("Jeff");
        this.csClass.add("Livingstone");
        this.csClass.add("Cynthia");
        this.csClass.add("Mateo");
        this.csClass.add("Calvin");

        this.csSoftwareEng.add("Jeff");
        this.csSoftwareEng.add("Livingstone");
        this.csSoftwareEng.add("Calvin");
        this.csSoftwareEng.add("Mateo");
        this.csSoftwareEng.add("Msembi");

        myCars.add(c1);
        myCars.add(c2);
        myCars.add(c3);
        myCars.add(c4);
    }

    public void addToArraylist1(String st){
        arrayList.add(st);
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public void traverseUsingForEach(){
        for(String str: arrayList){
            System.out.println(str);
        }
    }
    public void traverseUsingForeachMethod(){
        arrayList.forEach(item ->{
            System.out.println(item);
        });
    }

    //accessing the element using get
    public void accessingAnElement(int i){
        System.out.println(arrayList.get(i));
    }
    public void sortingAndOutput(){
        Collections.sort(arrayList);
        traverseUsingForeachMethod();
    }

    public void usingIteratorInterface(){
        ListIterator<String> itr = arrayList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        Reverse Order
        System.out.println("Reverse Order\n");
        ListIterator<String> litr = arrayList.listIterator(arrayList.size());
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
    public void traversigUsingForEachRemaining(){
//        Iterator<String> iterator = arrayList.iterator();
//        Iterator iterator = arrayList.iterator();
        ListIterator<String> iterator = arrayList.listIterator();
        iterator.forEachRemaining(item ->{
            System.out.println(item);
        });
    }

    public void traverserCars(){
//        Iterator iterator = myCars.iterator();
        ListIterator<Car> iterator = myCars.listIterator();
//        while (iterator.hasNext()){
//            Car car = (Car)iterator.next();
//            System.out.println(car.manufacturer + " " + car.model + " "+ car.odemeter);
//        }

        myCars.forEach( item ->{
            Car car = (Car) item;
            System.out.println(car.manufacturer + " " + car.model + " "+ car.odometer);
        });
    }

    public void removeElements(){
        System.out.println("Before removing elements");
        traverseUsingForeachMethod();
        arrayList.remove(0);
        System.out.println("After removing element 0");
        traverseUsingForeachMethod();
        arrayList.removeIf(str -> str.toLowerCase().contains("j"));
        System.out.println("After removeif");
        traverseUsingForeachMethod();
    }

    public void retainAll(){
        System.out.println(csClass);
        System.out.println(csSoftwareEng);
        csClass.retainAll(csSoftwareEng);
        System.out.println(csClass);
    }

    public void isEmpty(){
        System.out.println("Check if ArrayList is empty before clear: " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("Check if ArrayList is empty after clear: " + arrayList.isEmpty());
    }

    public void displayCars(){
        myCars.forEach( item ->{
            Car car = (Car) item;
            System.out.println(car.manufacturer + " " + car.model);
        });

    }
}

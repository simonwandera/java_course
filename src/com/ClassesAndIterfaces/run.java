package com.ClassesAndIterfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class run {

    class Car{
        String carName;
        String CarNumber;

        public Car(String carName, String carNumber) {
            this.carName = carName;
            CarNumber = carNumber;
        }
    }

    public static void main(String[] args) throws IOException {
        Alien alien = new Alien("al23", "James");

        IAlien iAlien = new Alien("al23", "James");

//        iAlien.walk();
//        iAlien.run();

        Integer[] array = {2,4,6,7,8,5,3,4,7,5,2};

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


//        System.out.println(bufferedReader.readLine());

        System.out.println((char) inputStreamReader.read());

        List<Car> cars = new LinkedList<>();



//        String names = "Bonnie, James, Mercy, George, Simon";

//        List<String> linkedlist = new LinkedList<>(Arrays.asList(names.split(",")));

//        System.out.println(linkedlist);

     }
}

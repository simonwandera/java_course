package com.ExamSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {

    public void missingNumberInIntegerArray(){
        int [] integerArray = new int[100];

        for(int i=0; i<= integerArray.length -1 ; i++ ){
            int newNumber = new Random().nextInt(1, 101);
            integerArray[i] = newNumber;
//            System.out.println(i);
        }

        for(int i=0; i< integerArray.length; i++){
            System.out.println(integerArray[i]);
        }

    }

    public void traverseAList(){
        List<String> cars = new ArrayList<>();
        cars.add("Bughati");
        cars.add("Dakuti");
        cars.add("Tesla");
        cars.add("Lamboghini");
        cars.add("BMW");
        cars.add("Lexus");

//        Traversing a lisi using foreach method
        cars.forEach(element ->{
            System.out.println(element);
        });
    }

    public void convertAListToArray(){
        List<String> colorsList = new ArrayList<>();

        colorsList.add("Green");
        colorsList.add("Yellow");
        colorsList.add("Magenta");
        colorsList.add("Cian");
        colorsList.add("Pink");
        colorsList.add("Purple");
        colorsList.add("White");
        colorsList.add("Red");

//convert list to array using toArray method
        String[] colorsArray = colorsList.toArray(new String[0]);

//traversing the array
        for (String color: colorsArray){
            System.out.println("color: " + color);
        }

    }
}

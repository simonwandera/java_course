package com.ExamSolution;

import java.util.*;

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

    public void shuffleElementsInAList(){
        List<String> playlist = new ArrayList<>();

        playlist.add("Dior");
        playlist.add("Goodbyes");
        playlist.add("Rockstar");
        playlist.add("Congratulations");
        playlist.add("Better now");
        playlist.add("Circles");
        playlist.add("Hollywood's bleeding");
        playlist.add("Cooped up");

//        Shuffling elements using collection.shuffle
        Collections.shuffle(playlist);
        System.out.println(playlist);
    }

    public void findMaximumAndMinimum(ArrayList<Integer> list){

        System.out.println("Maximum value is: "+ Collections.max(list));
        System.out.println("Minimum value is: "+ Collections.min(list));
    }

    public void sortArrayOfIntegers(Integer[] myArray){
//Sorting in ascending order
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
//Sorting in reverse order
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(myArray));
    }

    public void findVowelsConsonantsDigitsAndWhiteSpaces(String str){
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whiteSpaces = 0;

        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++){

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vowels++;
            } else if(str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9' || str.charAt(i) == '0'){
                //Increments the digits counter
                digits++;
            } else if (str.charAt(i) == ' '){
                //Increments the whitespace counter
                whiteSpaces++;
            }else {
                //Increments the consonants counter
                consonants++;
            }
        }

        System.out.println("whiteSpaces = " + whiteSpaces);
        System.out.println("consonants = " + consonants);
        System.out.println("digits = " + digits);
        System.out.println("vowels = " + vowels);

    }
}

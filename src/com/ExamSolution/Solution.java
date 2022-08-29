package com.ExamSolution;

import java.util.*;

public class Solution {

    public void missingNumberInIntegerArray(){
        Integer [] integerArray = new Integer[100];

        for(int i=0; i<= integerArray.length -1 ; i++ ){
            int newNumber = new Random().nextInt(1, 101);
            integerArray[i] = newNumber;
        }

        List<Integer> integerList = Arrays.asList(integerArray);
        String missingDigits = "";

        for(int i=1; i< integerList.size(); i++){
           if(integerList.contains(i)){
               continue;
           }else{
               System.out.println(i + " Is missing");
           }
        }
    }

    public void findDuplicateNumber(){

        int [] integerArray = new int[]{1,3,4,2,4,5,6,76,11,4,6};

        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1 ; j < integerArray.length; j++) {
                if (integerArray[i] == integerArray[j]) {
                    System.out.println("Duplicate: "+integerArray[j]);
                }
            }
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
            } else if(Character.isDigit(str.charAt(i))){
                //Increments the digits counter
                digits++;
            } else if (Character.isWhitespace(str.charAt(i))){
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

    public void findOccurrenceOfAllAlphabets(String str){

        int letterCount = 0;
        for (int i=0; i< str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                letterCount++;
            }
        }
        System.out.println(letterCount);
    }

    public static void main(String[] args) {

        Integer[] integerArray = {2,5,8,9,20,5,7,18,4,9,2,7,12};

        String str = "Conquering CSS5 designs in 21 days";

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(182);
        arrayList.add(112);
        arrayList.add(142);
        arrayList.add(132);
        arrayList.add(142);
        arrayList.add(172);

        Solution solution = new Solution();
        solution.missingNumberInIntegerArray();
        solution.findDuplicateNumber();
        solution.traverseAList();
        solution.convertAListToArray();
        solution.shuffleElementsInAList();
        solution.findMaximumAndMinimum(arrayList);
        solution.sortArrayOfIntegers(integerArray);
        solution.findVowelsConsonantsDigitsAndWhiteSpaces(str);
        solution.findOccurrenceOfAllAlphabets(str);
    }
}

package com.CollectionsAndDataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {
    private HashMap<Integer, String> hashMap = new HashMap<>();
    public HashMapPractise() {
        hashMap.put(1, "Black");
        hashMap.put(2, "Green");
        hashMap.put(3, "Yellow");
        hashMap.put(4, "Orange");
        hashMap.put(5, "Magenta");
        hashMap.put(6, "Pink");
        hashMap.put(2, "Grey");

    }

    public void iteratingAHashMap(){
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+ "\t" + entry.getValue());
        }
    }
    public void iteratingUsingForeach(){
        hashMap.forEach((key,value) ->{
            System.out.println(key + "\t\t" + value);
        });
    }

    public void usingAddOperations(){
//        Adding elements using put
        hashMap.put(7, "Brown");
        System.out.println(hashMap);

        System.out.println("Adding using put if absent");
        hashMap.putIfAbsent(4, "White");
        hashMap.putIfAbsent(9, "White");
        System.out.println(hashMap);
//        Using putAll()

        HashMap<Integer, String> newColors = new HashMap<>();
        newColors.put(10,"Maroon");
        newColors.put(11,"Cian");
        newColors.put(12,"Golden");
        newColors.put(13,"Colorless");

        hashMap.putAll(newColors);
        System.out.println(hashMap);

    }

    public void usingReplaceOperations(){
        System.out.println(hashMap);
        hashMap.replace(3,"Purple");
        hashMap.replace(4, "Orange","Blue");
        System.out.println(hashMap);

        hashMap.replaceAll((key, value) -> "Shiny");
        System.out.println(hashMap);
    }
}

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
}

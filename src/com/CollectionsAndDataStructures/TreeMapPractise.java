package com.CollectionsAndDataStructures;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractise {
    private TreeMap<Integer, String> treeMap = new TreeMap<>();

    public TreeMapPractise() {
        treeMap.put(1, "Pig");
        treeMap.put(2, "Goat");
        treeMap.put(5, "Horse");
        treeMap.put(6, "Rabbit");
        treeMap.put(7, "Sheep");
        treeMap.put(3, "Cow");
        treeMap.put(4, "Donkey");

    }

    public void iteratingTreeMap(){
        for (Map.Entry entries: treeMap.entrySet()){
            System.out.println(entries.getKey() + "\t" + entries.getValue());
        }
    }

    public void removeOperations(){
        System.out.println("Before invoking remove() method");
        System.out.println(treeMap);
        treeMap.remove(1);
        System.out.println("After invoking the remove method");
        System.out.println(treeMap);
    }
}

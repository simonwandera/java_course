package com.CollectionsAndDataStructures;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;


class NavigableMapPractise{

    private NavigableMap<Integer, String> navigableMap = new TreeMap<>();
    public NavigableMapPractise() {
        navigableMap.put(100,"Amit");
        navigableMap.put(102,"Ravi");
        navigableMap.put(101,"Vijay");
        navigableMap.put(103,"Rahul");
    }

    public void NavigableMapOperations(){
        System.out.println("Navigable Map: "+ navigableMap);
        System.out.println("Descending map: "+ navigableMap.descendingMap());
        System.out.println("HeadMap" + navigableMap.headMap(102, true));
        System.out.println("tailMap: "+navigableMap.tailMap(102,true));
        System.out.println("subMap: "+navigableMap.subMap(100, false, 102, true));

    }
}
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

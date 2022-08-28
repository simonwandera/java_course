package com.CollectionsAndDataStructures;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
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
    private SortedMap<Integer, String> sortedMap = new TreeMap<>();

    private TreeMap<Integer, Song> playlist = new TreeMap<>();

    public TreeMapPractise() {
        treeMap.put(1, "Pig");
        treeMap.put(2, "Goat");
        treeMap.put(5, "Horse");
        treeMap.put(6, "Rabbit");
        treeMap.put(7, "Sheep");
        treeMap.put(3, "Cow");
        treeMap.put(4, "Donkey");

        sortedMap.putAll(treeMap);

        Song song1 = new Song(1, "Vibaya", "Harmonize");
        Song song2 = new Song(2, "Jirani", "Chidi Beenz");
        Song song3 = new Song(3, "Sweet Aroma", "Nyashinski");
        Song song4 = new Song(4, "Taala", "Pia Pounds");
        Song song5 = new Song(5, "Valum", "Alkain");
        Song song6 = new Song(6, "Abule", "Patoranking");

        playlist.put(1,song1);
        playlist.put(2,song2);
        playlist.put(3,song3);
        playlist.put(4,song4);
        playlist.put(5,song5);
        playlist.put(6,song6);

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

    public void sortedTreeMap(){
        System.out.println(sortedMap);
    }

    public void traversingClassElements(){
//        for (Map.Entry entry: playlist.entrySet()){
//            Song song = (Song)entry.getValue();
//            System.out.println(entry.getKey() + "\t" + song.title);
//        }

//        Using foreach
        playlist.forEach((key, value) ->{
            System.out.println(key + "\t\t" + value.artist + "\t\t" + value.title);
        });
    }
}

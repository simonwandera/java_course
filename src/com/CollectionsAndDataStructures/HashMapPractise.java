package com.CollectionsAndDataStructures;

import java.util.HashMap;
import java.util.Map;

class Song{
    int singId;
    String title;
    String artist;

    public Song(int singId, String title, String artist) {
        this.singId = singId;
        this.title = title;
        this.artist = artist;
    }
}

public class HashMapPractise {
    private HashMap<Integer, String> hashMap = new HashMap<>();

    private HashMap<Integer, Song> songs = new HashMap<>();
    public HashMapPractise() {
        hashMap.put(1, "Black");
        hashMap.put(2, "Green");
        hashMap.put(3, "Yellow");
        hashMap.put(4, "Orange");
        hashMap.put(5, "Magenta");
        hashMap.put(6, "Pink");
        hashMap.put(2, "Grey");

        Song song1 = new Song(1, "Ujue", "David Lutalo");
        Song song2 = new Song(2, "Island in the stream", "Kenny and Dolly");
        Song song3 = new Song(3, "Go Low", "L.A.X");
        Song song4 = new Song(4, "Vuli Ndlela", "Brenda Fassie");
        Song song5 = new Song(5, "Fantasy", "Blask Box");
        Song song6 = new Song(6, "Congratulations", "Post Malone");

        songs.put(1,song1);
        songs.put(2, song2);
        songs.put(3, song3);
        songs.put(4, song4);
        songs.put(5, song5);
        songs.put(6, song6);


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

    public void traversingHashMapWithCustomClass(){
        for (Map.Entry entry: songs.entrySet()){
            Song song = (Song) entry.getValue();
            System.out.println(entry.getKey() + "\t" + song.artist + "\t\t" + song.singId + "\t\t" + song.title);
        }
    }
}

package com.CollectionsAndDataStructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractise {
    private LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    protected LinkedHashMap<Integer, Song> mySongs = new LinkedHashMap<>();
    public LinkedHashMapPractise() {

        linkedHashMap.put("name","Maseno");
        linkedHashMap.put("location","Kisumu");
        linkedHashMap.put("type","Public");
        linkedHashMap.put("class","Fancy");
        linkedHashMap.put("vc","Poff Nyabundi");
        linkedHashMap.put("size","100+ ha");

    }
    public void traversingALinkedMap(){
        for (Map.Entry entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }

    public void linkedHashMapOperations(){
        System.out.println("Keys: "+linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
        System.out.println("Key Value pairs: " + linkedHashMap.entrySet());

        System.out.println("Removing elements from liked hash map");
        linkedHashMap.remove("class");
        System.out.println(linkedHashMap);
    }

    public void LinkedHashMapWithCustomClass(){

        Song song1 = new Song(1, "Circles", "Post Malone");
        Song song2 = new Song(2, "Nakupenda", "Joy Melody");
        Song song3 = new Song(3, "For My Hand", "Burna Boy");
        Song song4 = new Song(4, "GirlFriend", "Chakka Da'Soul");
        Song song5 = new Song(5, "Mirracle", "Wilson Bugembe");
        Song song6 = new Song(6, "Cocaine", "Dai verse");

        mySongs.put(1, song1);
        mySongs.put(2, song2);
        mySongs.put(3, song3);
        mySongs.put(4, song4);
        mySongs.put(5, song5);
        mySongs.put(6, song6);


    }
}

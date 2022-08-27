package com.CollectionsAndDataStructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractise {
    private LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
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
    }
}

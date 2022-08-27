package com.CollectionsAndDataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {
    private HashMap<String, String> hashMap = new HashMap<>();
    public MapPractise() {

        hashMap.put("name","Simon");
        hashMap.put("gender","Male");
        hashMap.put("personality","Architect");
    }

    public void traversingElements(){
        for (Map.Entry m: hashMap.entrySet()){
            System.out.println(m.getKey()+ "\t" + m.getValue());
        }
    }

    public void mapOperations(){
        System.out.println(hashMap.entrySet());
        
    }
}

package com.CollectionsAndDataStructures;

import java.util.EnumMap;
import java.util.Map;
class Soldier {
    int id;
    String soldierName;
    String soldierType;
    String gender;
    String country;

    public Soldier(int id, String soldierName, String soldierType, String gender, String country) {
        this.id = id;
        this.soldierName = soldierName;
        this.soldierType = soldierType;
        this.gender = gender;
        this.country = country;
    }
}

enum Days{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday ,Sunday
}

public class EnumMapPractise {

    public void generateEnumMap(){
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.Monday, "1");
        map.put(Days.Thursday, "2");
        map.put(Days.Wednesday, "3");
        map.put(Days.Thursday, "4");

        //Print the map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
    }
}

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

    @Override
    public String toString() {
        return "Soldier{" +
                "id=" + id +
                ", soldierName='" + soldierName.toUpperCase() + '\'' +
                ", soldierType='" + soldierType + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

enum Days{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday ,Sunday
}

public class EnumMapPractise {
    public enum Key{
        One, Two, Three, Four, Five, Six
    }

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

    public void soldierEnum(){
        EnumMap<Key, Soldier> soldierMap = new EnumMap<Key, Soldier>(Key.class);
        Soldier soldier1 = new Soldier(1, "Filex Wandera", "Army", "Male", "Kenya");
        Soldier soldier2 = new Soldier(2, "Jacob Barasa", "Navy", "Male", "Uganda");
        Soldier soldier3 = new Soldier(3, "Valarie Goodheart", "Air", "Female", "Senegal");
        Soldier soldier4 = new Soldier(4, "Brian Mugubi", "Army", "Male", "Morocco");
        Soldier soldier5 = new Soldier(5, "Clement Makanga", "Navy", "Male", "Libya");
        Soldier soldier6 = new Soldier(6, "Felistus Gacheo", "Air", "Female", "Chad");

        soldierMap.put(Key.One, soldier1);
        soldierMap.put(Key.Two, soldier2);
        soldierMap.put(Key.Three, soldier3);
        soldierMap.put(Key.Four, soldier4);
        soldierMap.put(Key.Five, soldier5);
        soldierMap.put(Key.Six, soldier6);

        for (Map.Entry<Key, Soldier> entry: soldierMap.entrySet()){
            Soldier soldier = entry.getValue();
            System.out.println(soldier);
        }
    }
}

package com.CollectionsAndDataStructures;

import java.util.EnumMap;

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
    }
}

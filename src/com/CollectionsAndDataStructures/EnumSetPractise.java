package com.CollectionsAndDataStructures;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetPractise {

    public void display(){
        //Traversing elements
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        Iterator<days> itr = set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public void generateWithAllOfAndNoneOf(){
        Set<days> enumSet = EnumSet.allOf(days.class);
        System.out.println("Set generated with allOf: " + enumSet);

    }
}

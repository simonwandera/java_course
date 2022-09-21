package com.CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPractise {

    public void arrayListCollection(){
        List<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "Item1", "item2", "Item3", "Item4");
        System.out.println("Added elements: " + arrayList);

        String[] moreItems = {"Item5", "Item6", "Item7", "Item8"};
        Collections.addAll(arrayList, moreItems);

        System.out.println("New ArrayList: " + arrayList);
    }
}

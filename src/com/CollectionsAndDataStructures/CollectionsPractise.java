package com.CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPractise {
    List<String> stringArrayList = new ArrayList<>();
    List<Integer> integerArrayList = new ArrayList<>();

    public void arrayListCollection(){
        Collections.addAll(stringArrayList, "Item1", "item2", "Item3", "Item4");
        System.out.println("Added elements: " + stringArrayList);

        String[] moreItems = {"Item5", "Item6", "Item7", "Item8"};
        Collections.addAll(stringArrayList, moreItems);

        System.out.println("New ArrayList: " + stringArrayList);
    }

    public void maxElement(){
        Collections.addAll(integerArrayList, 23,66,2,44,101,90,12,12,55,76,95);
        System.out.println("Value of the maximum element from the collection: "+ Collections.max(integerArrayList));
        System.out.println("Value of minimum element from the collection: "+Collections.min(integerArrayList));
    }

    public void sortingStrings(){
        Collections.addAll(stringArrayList,"cow", "pig","donket", "leopard", "camel", "lizard", "pinguin");
        System.out.println("Collection before sorting: " + stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println("Collection after sorting: " + stringArrayList);
    }
}

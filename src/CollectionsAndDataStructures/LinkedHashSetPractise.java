package CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractise {
    private LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    public LinkedHashSetPractise() {
        linkedHashSet.add("Cashy");
        linkedHashSet.add("Kelly");
        linkedHashSet.add("Stella");
        linkedHashSet.add("Mirrium");
        linkedHashSet.add("Amos");
        linkedHashSet.add("Felix");
    }

    public void iteraticngHashset(){
        Iterator <String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void removeItemsInHashSet(){
        System.out.println("Before removing Amos, Kelly and Felix");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Amos");
        linkedHashSet.remove("Kelly");
        linkedHashSet.remove("Felix");
        System.out.println("After removing Amos, Kelly and Felix");
        System.out.println(linkedHashSet);
    }
}

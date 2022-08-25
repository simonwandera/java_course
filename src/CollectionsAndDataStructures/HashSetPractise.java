package CollectionsAndDataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractise {
    private HashSet<String> hashSet = new HashSet<>();
    public HashSetPractise() {
        hashSet.add("Michele");
        hashSet.add("Simon");
        hashSet.add("Whitney");
        hashSet.add("Jane");
        hashSet.add("Paul");
        hashSet.add("Maria");
        hashSet.add("Whitney");
        hashSet.add("Douglas");
        hashSet.add("Tabby");
        hashSet.add("James");
        hashSet.add("Whitney");
    }
    public void iterratingElements(){
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

package CollectionsAndDataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractise {
    LinkedList<String> linkedList = new LinkedList<>();

    public LinkedListPractise() {
        linkedList.add("Simon");
        linkedList.add("Jackie");
        linkedList.add("Jeff");
        linkedList.add("Livingstone");
        linkedList.add("Cynthia");
        linkedList.add("Mateo");
        linkedList.add("Calvin");
    }

    public void displayListItems(){
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

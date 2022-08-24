package CollectionsAndDataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractise {
    private LinkedList<String> linkedList = new LinkedList<>();
    ArrayListPractise arrayListPractise = new ArrayListPractise();
    public LinkedListPractise() {

        linkedList.addAll(arrayListPractise.getArrayList());

        linkedList.add(3, "Valeria");
        linkedList.addLast("Kiche");
        linkedList.addFirst("Erastus");
        System.out.println(linkedList);
    }

    public void displayListItems(){
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

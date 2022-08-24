package CollectionsAndDataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractise {
    private LinkedList<String> linkedList = new LinkedList<>();
    ArrayListPractise arrayListPractise = new ArrayListPractise();
    public LinkedListPractise() {

        linkedList.addAll(arrayListPractise.getArrayList());
        linkedList.add(3, "Valeria");
        linkedList.add("Kevin");
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

    public void removeListItems(){
        System.out.println("Removing kevin from the Linked List");
        linkedList.remove("Kevin");
        System.out.println(linkedList);
        System.out.println("Removing item at index 2");
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println("Removing the first item");
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println("removing the last item");
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println("Removing the first occurence if item James");
        linkedList.removeFirstOccurrence("James");
        System.out.println(linkedList);
        System.out.println("Removing the last occurence of item James");
        linkedList.removeLastOccurrence("James");
        System.out.println("clearing the linked list");
        linkedList.clear();

    }
}

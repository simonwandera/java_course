package CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractise {
    private TreeSet<String> treeSet = new TreeSet<>();
    public TreeSetPractise() {
        treeSet.add("Moses");
        treeSet.add("John");
        treeSet.add("Sam");
        treeSet.add("Duncodi");
        treeSet.add("Nancy");
        treeSet.add("Rose Ann");
    }

    public void iteratingItemsInATreeSet(){
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            break;
        }
//        using a descennding iterator

        Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
    }

    public void retrieveHighestAndLowest(){
        System.out.println("Lowest value: " + treeSet.pollLast());
        System.out.println("Highest value: " + treeSet.pollFirst());
    }

    public void teeSetOperations(){
        System.out.println("Initial set: " + treeSet);
        System.out.println("Reverse set: " + treeSet.descendingSet());
        System.out.println("Head set" + treeSet.headSet("Sam", true));
        System.out.println("Initial set" + treeSet.tailSet("Moses", false));
        System.out.println("Initial set" + treeSet.tailSet("Moses", true));

    }
}

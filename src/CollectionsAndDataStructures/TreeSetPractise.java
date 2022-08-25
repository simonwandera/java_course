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
}

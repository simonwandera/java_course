package CollectionsAndDataStructures;

import java.util.Iterator;

public class run {
    public static void main(String[] args) {
        ArrayListPractise listExample = new ArrayListPractise();
        for(int i = 1; i <= 50; i++){
            listExample.addToArraylist1("item " + i);
        }

        Iterator itr = listExample.arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Traversing list through forEach() method:");
        listExample.arrayList.forEach(a ->{
            System.out.println(a);
        });
    }
}

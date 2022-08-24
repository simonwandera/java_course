package CollectionsAndDataStructures;

import java.util.*;

public class ArrayListPractise {
    List<String> arrayList = new ArrayList();

    public ArrayListPractise() {

        this.arrayList.add("Simon");
        this.arrayList.add("Cloe");
        this.arrayList.add("Mark");
        this.arrayList.add("Kevin");
        this.arrayList.add("Calvin");
        this.arrayList.add("Japheth");
        this.arrayList.add("Jackie");
        this.arrayList.add("James");
        this.arrayList.add("Paul");
    }

    public void addToArraylist1(String st){
        arrayList.add(st);
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public void traverseUsingForEach(){
        for(String str: arrayList){
            System.out.println(str);
        }
    }
    public void traverseUsingForeachMethod(){
        arrayList.forEach(item ->{
            System.out.println(item);
        });
    }

    //accessing the element using get
    public void accessingAnElement(int i){
        System.out.println(arrayList.get(i));
    }
    public void sortingAndOutput(){
        Collections.sort(arrayList);
        traverseUsingForeachMethod();
    }

    public void usingIteratorInterface(){
        ListIterator<String> itr = arrayList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        Reverse Order
        System.out.println("Reverse Order\n");
        ListIterator<String> litr = arrayList.listIterator(arrayList.size());
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }

    public void traversigUsingForEachRemaining(){
//        Iterator<String> iterator = arrayList.iterator();
//        Iterator iterator = arrayList.iterator();
        ListIterator<String> iterator = arrayList.listIterator();
        iterator.forEachRemaining(item ->{
            System.out.println(item);
        });
    }
}

package CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.List;

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

}

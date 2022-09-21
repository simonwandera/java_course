package com.CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class CollectionsPractise {
    List<String> stringArrayList = new ArrayList<>();
    List<Integer> integerArrayList = new ArrayList<>();

    public void arrayListCollection(){
        Collections.addAll(stringArrayList, "Item1", "item2", "Item3", "Item4");
        System.out.println("Added elements: " + stringArrayList);
        String[] moreItems = {"Item5", "Item6", "Item7", "Item8"};
        Collections.addAll(stringArrayList, moreItems);
        System.out.println("New ArrayList: " + stringArrayList);
    }

    public void maxElement(){
        Collections.addAll(integerArrayList, 23,66,2,44,101,90,12,12,55,76,95);
        System.out.println("Value of the maximum element from the collection: "+ Collections.max(integerArrayList));
        System.out.println("Value of minimum element from the collection: "+Collections.min(integerArrayList));
    }

    public void sortingStrings(){
        Collections.addAll(stringArrayList,"cow", "pig","donket", "leopard", "camel", "lizard", "pinguin", "hen", "zebra");
        System.out.println("Collection before sorting: " + stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println("Collection after sorting: " + stringArrayList);

        Collections.sort(stringArrayList, Collections.reverseOrder());
        System.out.println("Collection sorted in reverse Order: "+ stringArrayList);
    }

    public void sortingUserDefinedClasses(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike"));
        studentList.add(new Student("David"));
        studentList.add(new Student("Charity"));
        studentList.add(new Student("Sharon"));
        studentList.add(new Student("Peterson"));
        studentList.add(new Student("Doe"));

        Collections.sort(studentList);
        for (Student st: studentList){
            System.out.println(st);
        }


    }
}

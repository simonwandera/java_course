package com.CollectionsAndDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AgeComparator implements Comparator<Pupil>{
    @Override
    public int compare(Pupil p1, Pupil p2) {
        if (p1.age == p2.age)
            return 0;
        else if (p1.age > p2.age)
            return 1;
        else
            return 0;
    }
}

class NameComparator implements Comparator<Pupil>{
    @Override
    public int compare(Pupil p1, Pupil p2){
        return p1.name.compareTo(p2.name);
    }
}


class Pupil{
    int regNo;
    String name;
    int age;

    public Pupil(int regNo, String name, int age) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }
}

//How to user comparators class
public class ComparatorExample {

    public static void main(String[] args) {
        List<Pupil> pupilList = new ArrayList<>();
        pupilList.add(new Pupil(1001, "Alex", 24));
        pupilList.add(new Pupil(1002, "Mark", 22));
        pupilList.add(new Pupil(1004, "Rebecca", 26));
        pupilList.add(new Pupil(1005, "Jingo", 26));


        System.out.println("Sorting  by name");
        Collections.sort(pupilList, new NameComparator());
        for (Pupil pupil: pupilList){
            System.out.println(pupil.name + "\t" + pupil.age + "\t" + pupil.regNo);
        }


        System.out.println("Sorting  by name");
        for (Pupil pupil: pupilList){
            System.out.println(pupil.name + "\t" + pupil.age + "\t" + pupil.regNo);
        }

    }
}

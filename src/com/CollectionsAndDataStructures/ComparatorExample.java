package com.CollectionsAndDataStructures;

import java.util.Comparator;

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

public class ComparatorExample {

}

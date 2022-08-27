package com.CollectionsAndDataStructures;

import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
class Teacher{
    int tscNumber;
    String name;
    String qualification;

    public Teacher(int tscNumber, String name, String qualification) {
        this.tscNumber = tscNumber;
        this.name = name;
        this.qualification = qualification;
    }
}
public class ArrayDequeuePractise {
    private Deque<String> arrayDeque = new ArrayDeque<>();
    ArrayDeque<Teacher> myTeachers = new ArrayDeque<>();

    public ArrayDequeuePractise() {

        arrayDeque.add("Maurice");
        arrayDeque.add("Wetaba");
        arrayDeque.add("Aholi");
        arrayDeque.add("John");
        arrayDeque.add("Loki");
        arrayDeque.add("Isaac");

        Teacher teacher1 = new Teacher(1001, "Millicent Masasa", "PFD");
        Teacher teacher2 = new Teacher(1002, "Eunice Kisyangani", "Degree");
        Teacher teacher3 = new Teacher(1003, "John Borter", "Masters");
        Teacher teacher4 = new Teacher(1004, "Moses Barasa", "Degree");
        Teacher teacher5 = new Teacher(1005, "Cleopas Wangoliko", "Masters");
        Teacher teacher6 = new Teacher(1006, "Stephen Kale", "PhD");
        Teacher teacher7 = new Teacher(1007, "Benedetto Sinja", "Diploma");


        myTeachers.add(teacher1);
        myTeachers.add(teacher2);
        myTeachers.add(teacher3);
        myTeachers.add(teacher4);
        myTeachers.add(teacher5);
        myTeachers.add(teacher6);
        myTeachers.add(teacher7);




    }
    public void iteratingElements(){
        Iterator iterator = arrayDeque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void arrayDequeueOperations(){
        System.out.println("ArrayDequeue: " + arrayDeque);
        System.out.println("Element: " + arrayDeque.element());
        System.out.println("Peek: "+arrayDeque.peek());
        System.out.println("Size: "+ arrayDeque.size());
        System.out.println("getFirst: "+arrayDeque.getFirst());
        System.out.println("getLast: "+arrayDeque.getLast());
        System.out.println("peekFirst: "+arrayDeque.peekFirst());
        System.out.println("Poll: "+arrayDeque.poll());
        System.out.println("pollFirst: "+arrayDeque.pollFirst());
        System.out.println("Remove: " +arrayDeque.remove());
        System.out.println("RemoveFirst: " + arrayDeque.removeFirst());
        System.out.println("removeLast: "+ arrayDeque.removeLast());
    }

    public void iteratingClassElements(){
        for (Teacher teacher: myTeachers){
            System.out.println(teacher.tscNumber + "\t" + teacher.name + "\t" + teacher.qualification);
        }
    }
}

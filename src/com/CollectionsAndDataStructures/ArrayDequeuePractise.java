package com.CollectionsAndDataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeuePractise {

    private Deque<String> arrayDeque = new ArrayDeque<>();

    public ArrayDequeuePractise() {

        arrayDeque.add("Maurice");
        arrayDeque.add("Wetaba");
        arrayDeque.add("Aholi");
        arrayDeque.add("John");
        arrayDeque.add("Loki");
        arrayDeque.add("Isaac");

    }
    public void iteratingElements(){
        Iterator iterator = arrayDeque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

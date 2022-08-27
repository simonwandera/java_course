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
    }
}

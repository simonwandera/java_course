package com.Threads;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedCounter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized void decrement() {
        counter--;
    }

    public synchronized int value() {
        return counter;
    }
    
//    Synchronized code using synchronized keyword
    public void addName(String name) {
        int nameCount = 0;
        synchronized(this) {
            String lastName = name;
            nameCount++;
        }
        List<String> nameList = new ArrayList<>();
        nameList.add(name);
    }
}

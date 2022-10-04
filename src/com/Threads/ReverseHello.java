package com.Threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class ReverseWorkerThread extends Thread{

    private static ArrayList<Integer> threadId;

    @Override
    public void run() {
        String message = "Hello from thread "+ Thread.currentThread().getName();
        System.out.println(message);

    }
}
public class ReverseHello {

    public static void main(String[] args) throws InterruptedException {
        LinkedList<ReverseWorkerThread> threadsList = new LinkedList<>();
        for (int i = 1; i<=50; i++){
            ReverseWorkerThread reverseWorkerThread = new ReverseWorkerThread();
            reverseWorkerThread.setName(String.valueOf(i));
            threadsList.add(reverseWorkerThread);
        }

        Iterator threadsIterator = threadsList.descendingIterator();
        while (threadsIterator.hasNext()){
           ReverseWorkerThread r = (ReverseWorkerThread) threadsIterator.next();
           r.start();
           r.join();
        }
    }
}

package com.Threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class ReverseWorkerThread extends Thread{

    private static ArrayList<Integer> threadId;
    public ReverseWorkerThread() {
//        super();
    }


    @Override
    public void run() {
        String message = "Hello from thread "+ Thread.currentThread().getId();
        System.out.println(message);

    }
}
public class ReverseHello {

    public static void main(String[] args) throws InterruptedException {
        LinkedList<ReverseWorkerThread> threadsList = new LinkedList<>();
        for (int i = 0; i<50; i++){
            ReverseWorkerThread reverseWorkerThread = new ReverseWorkerThread();
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

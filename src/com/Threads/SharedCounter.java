package com.Threads;

class SharedCounterThread extends Thread {

    private int count;
    static int counter;
    public SharedCounterThread(int count) {
        this.count = count;
    }
    public synchronized void increment() {
        counter = count;
        for(int i = 1; i<=10; i++) {
            counter++;
        }
    }

    public void run(){
        increment();
    }
}

public class SharedCounter{
    static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        SharedCounterThread sharedCounterThread = new SharedCounterThread(counter);

        sharedCounterThread.start();
        sharedCounterThread.join();
    }
}

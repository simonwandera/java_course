package com.Threads;

class SharedCounterThread implements Runnable {
    private static int counter;
    public void increment() {
        synchronized(this) {
            for (int i = 1; i <= 10; i++) {
                counter++;
            }
        }
    }

    public int getCounter() {
        return counter;
    }

    public void run(){
        increment();
        System.out.println("Value of counter in thread " + Thread.currentThread().getName() +" is " + counter);
    }
}

public class SharedCounter{
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i<10; i++){
            Thread thread = new Thread(new SharedCounterThread());
            thread.start();
            thread.join();

        }
        SharedCounterThread sharedCounterThread = new SharedCounterThread();

        System.out.println("\nFinal counter = " + sharedCounterThread.getCounter());

    }
}

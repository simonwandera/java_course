package com.Threads;



class MyThread implements Runnable{
    static int counter = 1;
    int remainder;
    static Object lock = new Object();

    public MyThread(int remainder) {
        this.remainder = remainder;
    }

    public void count(){
        System.out.println(counter++ + " From " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i = 1; i<=20; i++){
            synchronized (lock){
                while (counter % 2 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
        count();
        lock.notify();

            }
        }
    }
}

public class MoreThreadPractise {

    static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread oddPrinter = new Thread(new MyThread(1), "Odd printer");
        Thread evenPrinter = new Thread(new MyThread(0), "Even printer");

        oddPrinter.start();
        evenPrinter.start();

    }
}


package com.Threads;

public class MoreThreadPractise {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread());

        Thread t2 = new Thread(new MyThread());

        t1.start();
        t2.start();

    }
}


class MyThread implements Runnable{
    static int counter = 1;

    public void count(){
//        System.out.println(counter++);
        System.out.println(counter++);
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++)
            count();
    }
}

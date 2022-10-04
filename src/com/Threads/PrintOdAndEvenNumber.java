package com.Threads;

class Printer implements Runnable{
    static int counter = 1;
    int reminder;
    static Object lock = new Object();
    public Printer(int reminder) {
        this.reminder = reminder;
    }
    public void printer(){
        System.out.println(Thread.currentThread().getName() + " " + counter++);
    }

    @Override
    public void run() {
       for(int i = 1; i<=10;i++){
           synchronized (lock) {
               while (counter % 2 != reminder) {
                   try {
                       lock.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               printer();
               lock.notifyAll();
           }
        }
    }
}
public class PrintOdAndEvenNumber {
    public static void main(String[] args) throws InterruptedException {

        Thread even = new Thread(new Printer(0), "Even thread");
        Thread odd = new Thread(new Printer(1), "Odd Thread");

        even.start();
        odd.start();

    }
}

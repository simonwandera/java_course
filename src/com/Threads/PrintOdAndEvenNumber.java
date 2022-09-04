package com.Threads;

class Printer implements Runnable{
    static int counter = 1;
    public void printer(){
        System.out.println(Thread.currentThread().getName() + " " + counter++);
    }

    @Override
    public void run() {
       for(int i = 1; i<=10;i++){
            printer();
        }
    }
}
public class PrintOdAndEvenNumber {
    public static void main(String[] args) throws InterruptedException {

        Thread even = new Thread(new Printer(), "Even thread");
        Thread odd = new Thread(new Printer(), "Odd Thread");

        even.start();
        odd.start();

    }
}

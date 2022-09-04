package com.Threads;

class Printer implements Runnable{
    int counter = 1;
    public void printer(){
        System.out.println(counter);
    }

    @Override
    public void run() {
        while (true){
            printer();
        }
    }
}
public class PrintOdAndEvenNumber {
    public static void main(String[] args) {

        Thread even = new Thread(new Printer());
        Thread odd = new Thread(new Printer());

        even.start();
        odd.start();
    }
}

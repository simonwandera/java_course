package com.Threads;
public class ReverseHello1 extends  Thread{
    private int idThread;

    public ReverseHello1(int idThread) {
        this.idThread = idThread;
    }

    @Override
    public void run() {
        if (idThread<=50){
            Thread thread = new Thread(new ReverseHello1(idThread+1));
            thread.setName("Thread  " + idThread);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (idThread>1){
            System.out.println("hello from # " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ReverseHello1(0));
        t1.start();

    }
}
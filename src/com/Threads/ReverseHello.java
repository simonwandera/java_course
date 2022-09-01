package com.Threads;
class ReverseWorkerThread extends Thread{
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
        for (int i = 50; i>0; i--){
            ReverseWorkerThread reverseWorkerThread = new ReverseWorkerThread();
            reverseWorkerThread.start();
            reverseWorkerThread.join();


        }
    }
}

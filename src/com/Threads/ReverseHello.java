package com.Threads;
class ReverseWorkerThread extends Thread{
    public ReverseWorkerThread() {
//        super();
    }
    @Override
    public void run() {
        String message = "Hello from thread "+ Thread.currentThread().getId();
        StringBuilder stringBuilder = new StringBuilder(message);
        System.out.println(stringBuilder.reverse());
    }
}
public class ReverseHello {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i<50; i++){
            ReverseWorkerThread reverseWorkerThread = new ReverseWorkerThread();
            reverseWorkerThread.join();
            reverseWorkerThread.start();
            reverseWorkerThread.join();
        }
    }
}

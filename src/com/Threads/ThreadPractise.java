package com.Threads;

public class ThreadPractise implements Runnable {
    public void run() {
        System.out.println("You have a thread here!");
    }

    public static void main(String[] args) {
        (new Thread(new ThreadPractise())).start();
    }
}

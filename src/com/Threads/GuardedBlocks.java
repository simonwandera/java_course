package com.Threads;

class GuardedBlocksThread extends Thread {

    @Override
    public void run() {
        guardedJoy();
    }

    public static boolean joy;

    //    Wasteful and inefficient way
    public void guardedJoy() {
        // Simple loop guard. Wastes
        // processor time. Don't do this!
        while (!joy) {
        }
        System.out.println("Joy has been achieved!");
    }

//    A more efficient way!

    public synchronized void notifyJoy() {
        joy = true;
        notifyAll();
    }

    public synchronized void guardedJoyEfficient() {
        // This guard only loops once for each special event, which may not
        // be the event we're waiting for.
        while (!joy) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Joy and efficiency have been achieved!");
    }

}

public class GuardedBlocks{

    public static void main(String[] args) {

        new GuardedBlocksThread().guardedJoy();
        new GuardedBlocksThread().notifyJoy();
        new GuardedBlocksThread().guardedJoyEfficient();

    }
}

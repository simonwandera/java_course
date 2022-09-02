package com.Threads;

public class GuardedBlocks {

    Boolean joy;

//    Wasteful and inefficient way
    public void guardedJoy() {
        // Simple loop guard. Wastes
        // processor time. Don't do this!
        while(!joy) {}
        System.out.println("Joy has been achieved!");
    }
}

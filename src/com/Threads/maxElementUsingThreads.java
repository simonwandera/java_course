package com.Threads;

import java.util.Random;

class WorkerThread extends Thread {

    private int startIndex;
    private int endIndex;
    private int SIZE;
    private int[] array = null;


    public WorkerThread(int startIndex, int endIndex, int[] array) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
//        this.SIZE = SIZE;
        this.array = array;
    }

    @Override
    public void run() {

        int max = array[startIndex];

        for (int k = startIndex; k < endIndex +1 ; k++) {
            if (array[k] > max)
                max = array[k];
        }

        System.out.println("Maximum at thread " + Thread.currentThread().getId() + " is "+ max);
    }
}


public class maxElementUsingThreads {

    private static int maximum;
    public static void main(String[] args) {

        int SIZE = 16;

        int values[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = new Random().nextInt(20);
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.println(values[i]);
        }

//Chunks
        int chunkSize = SIZE/4;

        int startOfChunkOne = 0;
        int endOfChunkOne = chunkSize -1;

        int startOfChunkTwo = chunkSize ;
        int endOfChunkTwo = chunkSize + chunkSize -1 ;

        int startOfChunkThree = chunkSize + chunkSize;
        int endOfChunkThree = chunkSize + chunkSize + chunkSize -1;

        int startOfChunkFour = chunkSize + chunkSize + chunkSize;
        int endOfChunkFour = chunkSize + chunkSize + chunkSize + chunkSize -1;

        WorkerThread t1 = new WorkerThread(startOfChunkOne, endOfChunkOne, values);
        t1.start();
        WorkerThread t2 = new WorkerThread(startOfChunkTwo, endOfChunkTwo, values);
        t2.start();
        WorkerThread t3 = new WorkerThread(startOfChunkThree, endOfChunkThree, values);
        t3.start();
        WorkerThread t4 = new WorkerThread(startOfChunkFour, endOfChunkFour, values);
        t4.start();

    }
}

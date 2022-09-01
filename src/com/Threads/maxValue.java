package com.Threads;

import java.util.Random;

class WorkerThread extends Thread {

    private int startIndex;
    private int endIndex;
    private int[] array;

    private static int maximum;

    public WorkerThread(int startIndex, int endIndex, int[] array) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.array = array;
    }

    public  int getMaximum() {
        return maximum;
    }

    @Override
    public void run() {

        int max = array[startIndex];

        for (int k = startIndex; k < endIndex +1 ; k++) {
            if (array[k] > max)
                max = array[k];
        }

        if(max > maximum)
            maximum = max;
        System.out.println("Maximum at thread " + Thread.currentThread().getName() + " is "+ max);
    }
}


public class maxValue {

    public static void main(String[] args) throws InterruptedException {

        int SIZE = 20;

        int values[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = new Random().nextInt(200);
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
        t1.join();
        WorkerThread t2 = new WorkerThread(startOfChunkTwo, endOfChunkTwo, values);
        t2.start();
        t2.join();
        WorkerThread t3 = new WorkerThread(startOfChunkThree, endOfChunkThree, values);
        t3.start();
        t3.join();
        WorkerThread t4 = new WorkerThread(startOfChunkFour, endOfChunkFour, values);
        t4.start();
        t4.join();

        System.out.println("\tMaximum on the array is: "+ t4.getMaximum());

    }
}

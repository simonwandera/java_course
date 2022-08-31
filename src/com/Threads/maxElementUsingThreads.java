package com.Threads;

import java.util.Random;

public class maxElementUsingThreads {

    public static void main(String[] args) {
        int SIZE = 16;
        int values[] = new int[SIZE];
        for (int i=0; i<SIZE; i++){
            values[i] = new Random().nextInt(20);
        }

//        Iterating the array

        for (int j=0; j<values.length; j++){
            System.out.println(values[j]);
        }

//        Find largest value
        int max = values[0];

        for (int k = 0; k< values.length; k++){
            if (values[k] > max)
                max =  values[k];
        }

//Chunks

        int chunkSize = SIZE/4;

        int startOfChunkOne = 0;
        int endOfChunkOne = chunkSize -1;

        int startOfChunkTwo = chunkSize ;
        int endOfChunkTwo = chunkSize + chunkSize -1 ;

        int StartOfChunkThree = chunkSize + chunkSize;
        int endOfChunkThree = chunkSize + chunkSize + chunkSize -1;

        int startOfChunkFour = chunkSize + chunkSize + chunkSize;
        int endOfChunkFour = chunkSize + chunkSize + chunkSize + chunkSize -1;


        System.out.println("Chunk 1: " + startOfChunkOne + " " + endOfChunkOne);
        System.out.println("Chunk 2: " + startOfChunkTwo + " " + endOfChunkTwo);
        System.out.println("Chunk 3: " + StartOfChunkThree + " " + endOfChunkThree);
        System.out.println("Chunk 4: " + startOfChunkFour + " " + endOfChunkFour);

    }

}

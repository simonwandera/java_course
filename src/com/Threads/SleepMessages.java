package com.Threads;

public class SleepMessages {
    public static void main(String args[]) throws InterruptedException {

        String importantInfo[] = {"Beautiful is better than ugly",
                "Complex is better than complicated",
                "Simple is better than complex.",
                "Complex is better than complicated.",
                "Flat is better than nested.",
                "Sparse is better than dense.",
                "Readability counts.",
                "Special cases aren't special enough to break the rules.",
                "Although practicality beats purity.",
                "Errors should never pass silently."
        };

        for (int i = 0; i < importantInfo.length; i++) {
            //Pause for 4 seconds
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
//                We've been interrupted, no more messages
                return;
            }
            //Print a message
            System.out.println(importantInfo[i]);

        }

        //Another way to handle threads
        for (int i=0; i<importantInfo.length; i++){
            System.out.println(importantInfo[i]);
            if(Thread.interrupted())
                //We have inturrupted, mo messages
                return;
        }


        threadMessage("This is a thread message");
    }

    public static void threadMessage(String message){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName + " Message: " + message);
    }
}

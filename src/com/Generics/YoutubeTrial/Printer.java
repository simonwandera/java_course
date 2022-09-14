package com.Generics.YoutubeTrial;

public class Printer {
    private String somethingToPrint;

    public Printer(String somethingToPrint) {
        this.somethingToPrint = somethingToPrint;
    }

    public void print(){
        System.out.println(somethingToPrint);
    }
}

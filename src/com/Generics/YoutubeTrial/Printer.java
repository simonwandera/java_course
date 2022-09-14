package com.Generics.YoutubeTrial;

public class Printer<T> {
    private T somethingToPrint;

    public Printer(T somethingToPrint) {
        this.somethingToPrint = somethingToPrint;
    }

    public void print(){
        System.out.println(somethingToPrint);
    }
}

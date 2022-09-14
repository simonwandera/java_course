package com.Generics.YoutubeTrial;

public class Main {
    public static void main(String[] args) {
        Printer printString = new Printer("Something to print");
        Printer printInteger = new Printer(23);
        printString.print();
        printInteger.print();
    }
}

package com.Generics.YoutubeTrial;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer<String> printString = new Printer<>("Something to print");
        Printer<Integer> printInteger = new Printer<>(23);
        Printer<Cat> catPrinter = new Printer<>(new Cat("Mews", 23));

        List<String> names = new ArrayList<>();
        names.add("Caleb");
        names.add("Victor");
        names.add("Pauline");
        Printer<List<String>> listPrinter = new Printer<>(names);

        printString.print();
        printInteger.print();
        catPrinter.print();
        catPrinter.eat(new Cat("Paka", 22));
    }
}

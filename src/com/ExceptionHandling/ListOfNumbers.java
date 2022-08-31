package com.ExceptionHandling;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

/*
* The following example defines and implements a class named ListOfNumbers. When constructed, ListOfNumbers
* creates an ArrayList that contains 10 Integer elements with sequential values 0 through 9. The
* ListOfNumbers class also defines a method named writeList, which writes the list of numbers
* into a text file called OutFile.txt. This example uses output classes defined in java.io, which are covered in Basic I/O.
* */

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }
    public void writeList() {

        PrintWriter out = null;
        FileWriter f = null;
        try {
            System.out.println("Entered try statement");
            f = new FileWriter("OutFile.txt");
            out = new PrintWriter(f);
            for (int i = 0; i < SIZE + 2; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException ex){
            System.err.println("IndexOutOfBoundsException: " + ex.getMessage());
        } catch (IOException e){
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
            if (f != null) {
                System.out.println("Closing FileWriter");
//                f.close();
            }
        }
    }

    public void writeListWithResource() throws IOException{
        try (FileWriter f = new FileWriter("file.txt");
             PrintWriter out = new PrintWriter(f)) {
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.writeList();
        listOfNumbers.writeListWithResource();

    }
}

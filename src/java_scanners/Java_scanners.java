package java_scanners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_scanners {

    public static void main(String[] args) throws IOException {
        System.out.println(" Welcome to java Scanners ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("What is your name: ");
        String name = bufferedReader.readLine();
        System.out.println("How old are you");
        int age = bufferedReader.read();
        System.out.println("age = " + age);
        System.out.println("Name = " + name);
    }
}

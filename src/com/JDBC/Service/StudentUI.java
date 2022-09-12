package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.util.Scanner;

public class StudentUI {

    static Scanner scanner;
    public static void main(String[] args) {

        registerStudent();
    }

    public static void registerStudent(){
        Student student = new Student();
        System.out.println("Enter student ID Number; ");
        student.setIdNumber(scanner.nextInt());
        System.out.println("Enter student Name; ");
        student.setName(scanner.nextLine());
        System.out.println("Enter student Gender; ");
        student.setGender(scanner.nextLine());
    }
}

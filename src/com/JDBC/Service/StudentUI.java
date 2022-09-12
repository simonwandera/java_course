package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.util.Scanner;

public class StudentUI {

    static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        registerStudent();
    }

    public static void registerStudent(){
        Student student = new Student();
        System.out.println("Enter student Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter student Gender: ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter student ID Number: ");
        student.setIdNumber(scanner.nextInt());

        IStudentDB iStudentDB = new MysqlStudentDB();
        String query = iStudentDB.createInsertQuery(student);
        iStudentDB.executeQuery(query);
    }
}

package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentUI {

    static Scanner scanner;
    static IStudentDB iStudentDB;
    public static void main(String[] args) throws SQLException {

        scanner = new Scanner(System.in);
        iStudentDB = new MysqlStudentDB();

        displayStudents();

//        registerStudent();
    }

    public static void displayStudents() throws SQLException {
        List<Student> studentList = iStudentDB.getStudents();
        for (Student student: studentList){
            System.out.println(student);
        }
    }

    public static void registerStudent(){
        Student student = new Student();
        System.out.println("Enter student Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter student Gender: ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter student ID Number: ");
        student.setIdNumber(scanner.nextInt());

        String query = iStudentDB.createInsertQuery(student);
        iStudentDB.executeQuery(query);
    }
}

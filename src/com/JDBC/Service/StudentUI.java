package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentUI {

    static Scanner scanner;
    static IStudentDB iStudentDB;
    public static void main(String[] args) throws SQLException, IOException {

        scanner = new Scanner(System.in);
//        scanner = new BufferedReader(inputStreamReader);
        iStudentDB = new MysqlStudentDB();
    
        displayStudents();
//        displayStudent(4);
//        registerStudent();
//        deleteStudent(6);
//        updateStudent();
    }

    public static void displayStudents() throws SQLException {
        List<Student> studentList = iStudentDB.getStudents();
        for (Student student: studentList){
            System.out.println(student);
        }
    }

    public static void displayStudent(int id) throws SQLException {
        System.out.println(iStudentDB.getStudent(id));
    }

    public static void deleteStudent(int id) throws SQLException {
        System.out.println(iStudentDB.deleteStudent(id));
    }

    public static void updateStudent() throws SQLException, IOException {
        System.out.print("Enter ID of the student to update: ");
        Student student = iStudentDB.getStudent(scanner.nextInt());

        scanner = new Scanner(System.in);
        System.out.print("Enter student Name: ");
        String name = scanner.nextLine();
        if (name.trim().length() > 0)
            student.setName(name);

        System.out.print("Enter student Gender: ");
        String gender = scanner.nextLine();
        if (gender.trim().length() > 0)
            student.setGender(gender);

        System.out.print("Enter student ID Number or 0 to continue: ");
        int idNumber = scanner.nextInt();
        if (idNumber > 0)
            student.setIdNumber(idNumber);

        String query = iStudentDB.createUpdateQuery(student);
        iStudentDB.executeQuery(query);
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

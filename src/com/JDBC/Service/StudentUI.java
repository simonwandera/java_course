package com.JDBC.Service;

import com.JDBC.Model.Student;
import com.JDBC.Model.Teacher;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentUI {

    static Scanner scanner;
    static IMySQLDB<IEntity> iStudentDB;
    public static void main(String[] args) throws SQLException, IOException {

        scanner = new Scanner(System.in);
        iStudentDB = new MySQLDB<>();
    
//        displayStudents();
//        displayStudent(4);
        Student student = registerStudent();
        student.getTargetColumns().add(student.getName());
        student.getTargetColumns().add(student.getIdNumber());
        student.getTargetColumns().add(student.getGender());

        String insertQuery = iStudentDB.createInsertQuery(student);
        iStudentDB.executeQuery(insertQuery);


//        deleteStudent(6);
//        updateStudent();
    }

//    public static void displayStudents() throws SQLException {
//        List<Student> studentList = iStudentDB.getStudents();
//        for (Student student: studentList){
//            System.out.println(student);
//        }
//    }

//    public static void displayStudent(int id) throws SQLException {
//        System.out.println(iStudentDB.getStudent(id));
//    }
//
//    public static void deleteStudent(int id) throws SQLException {
//        System.out.println(iStudentDB.deleteStudent(id));
//    }
//
//    public static void updateStudent() throws SQLException, IOException {
//        System.out.print("Enter ID of the student to update: ");
//        Student student = iStudentDB.getStudent(scanner.nextInt());
//
//        scanner = new Scanner(System.in);
//        System.out.print("Enter student Name: ");
//        String name = scanner.nextLine();
//        if (name.trim().length() > 0)
//            student.setName(name);
//
//        System.out.print("Enter student Gender: ");
//        String gender = scanner.nextLine();
//        if (gender.trim().length() > 0)
//            student.setGender(gender);
//
//        System.out.print("Enter student ID Number or 0 to continue: ");
//        int idNumber = scanner.nextInt();
//        if (idNumber > 0)
//            student.setIdNumber(idNumber);
//
//        String query = iStudentDB.createUpdateQuery(student);
//        iStudentDB.executeQuery(query);
//    }

    public static Student registerStudent(){
        Student student = new Student();

        System.out.println("Enter student Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter student Gender: ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter student ID Number: ");
        student.setIdNumber(scanner.nextInt());

        return student;
//        String query = iStudentDB.createInsertQuery();
//        iStudentDB.executeQuery(query);
    }

    public static Teacher registerT
}

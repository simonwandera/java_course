package com.JDBC.Service;
import com.JDBC.Model.Student;
import com.JDBC.Model.Teacher;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class StudentUI {

    static Scanner scanner;
    static IMySQLDB<Entity> iMySQLDB;
    private static ResultSet resultSet;
    public static void main(String[] args) throws SQLException, IOException {

        scanner = new Scanner(System.in);

        System.out.println("*************** WELCOME TO SCHOOL MANAGEMENT SYSTEM *************");

        menu();
    }

    public static void displayAllStudents() throws SQLException {
        List<Student> studentList = new ArrayList<>(Student.displayAll());
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    public static void displayAllTeachers() throws SQLException {
        IMySQLDB<Teacher> teacherDB = new MySQLDB<>(new Teacher());
        List<Teacher> teacherList = new ArrayList<>(Teacher.displayAll());
        for (Teacher teacher : teacherList){
            System.out.println(teacher);
        }
    }

    public static void updateStudents() throws SQLException {

        IMySQLDB<Student> studentDB = new MySQLDB<>(new Student());
        studentDB.createUpdateQuery(Student.getEntities());
    }
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

    public static void menu() throws SQLException {
        while (true) {
            System.out.println("1. Register Student");
            System.out.println("2. Register Teacher");
            System.out.println("3. Display all Students");
            System.out.println("4. Display all Teachers");
            System.out.println("5. Update Student");
            System.out.println("q. Exit System");

            String choice = scanner.nextLine();

            if (choice.equals("1"))
                registerStudent();
            else if (choice.equals("2"))
                registerTeacher();
            else if(choice.equals("3"))
                displayAllStudents();
            else if (choice.equals("4"))
                displayAllTeachers();
            else if (choice.equals("5"))
                updateStudents();
            else if (choice.equals("q")){
                System.out.println("Exiting ... ");
                break;
            }else {
                System.out.println("\nInvalid choice!\n");
            }
        }
    }

    public static void registerStudent() throws SQLException {
        Student student = new Student();

        System.out.println("Enter student Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter student Gender: ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter student ID Number: ");
        student.setIdNumber(scanner.nextInt());
        scanner.nextLine();
        student.getEntitiesMap().replace("name", student.getName());
        student.getEntitiesMap().replace("idNumber", student.getIdNumber());
        student.getEntitiesMap().replace("gender", student.getGender());

        IMySQLDB<Student> iMySQLDB = new MySQLDB<>(student);
        iMySQLDB.save();
    }

    public static void registerTeacher() throws SQLException {
        Teacher teacher = new Teacher();
        System.out.print("Enter teacher ID Number: ");
        teacher.setIdNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter teacher Name: ");
        teacher.setName(scanner.nextLine());
        System.out.print("Enter teacher's gender: ");
        teacher.setGender(scanner.nextLine());
        System.out.print("Enter teacher's TSC number: ");
        teacher.setTscNumber(scanner.nextLine());
        System.out.print("Enter teacher's qualification: ");
        teacher.setQualification(scanner.nextLine());

        teacher.getEntitiesMap().replace("idNumber", teacher.getIdNumber());
        teacher.getEntitiesMap().replace("name", teacher.getName());
        teacher.getEntitiesMap().replace("gender", teacher.getGender());
        teacher.getEntitiesMap().replace("tscNumber", teacher.getTscNumber());
        teacher.getEntitiesMap().replace("qualification", teacher.getQualification());

        IMySQLDB<Teacher> iMySQLDB = new MySQLDB<>(teacher);
        iMySQLDB.save();

    }
}

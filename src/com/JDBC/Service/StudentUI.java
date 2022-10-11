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
        List<Student> studentList = new ArrayList<>(new Student().displayAll());
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    public static void displayAllTeachers() throws SQLException {
        List<Teacher> teacherList = new ArrayList<>(new Teacher().displayAll());
        for (Teacher teacher : teacherList){
            System.out.println(teacher);
        }
    }

    public static void updateStudents(int id) throws SQLException {
        Student studentToUpdate = new Student();
        studentToUpdate.setId(id);

        IMySQLDB<Student> studentDB = new MySQLDB<>(studentToUpdate);
        resultSet = studentDB.fetchOne();
        while (resultSet.next()){
            studentToUpdate.setId(resultSet.getInt("id"));
            studentToUpdate.setName(resultSet.getString("name"));
            studentToUpdate.setGender(resultSet.getString("gender"));
            studentToUpdate.setIdNumber(resultSet.getInt("idNumber"));
        }

        studentToUpdate.setName("Updated Name");
        IMySQLDB<Student> newStudentDB = new MySQLDB<>(studentToUpdate);
        newStudentDB.update();
    }


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
                updateStudents(3);
            else if (choice.equals("6"))
                selectWithWhere();
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

    public static void selectWithWhere() throws SQLException{

        Map<String, String> critetia = new HashMap<>(){{
            put("id", "1");
            put("tscNumber", "23ww");
        }};

        MySQLDB<Teacher> teacherDB = new MySQLDB<>(new Teacher());
        String selectQ = teacherDB.createSelectWithWhereClauseQuery(critetia);
        System.out.println("Select Query >>>: "  + selectQ);

    }
}

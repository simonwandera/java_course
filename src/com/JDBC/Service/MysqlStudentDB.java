package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlStudentDB implements IStudentDB{
    private Connection connection;
    private ResultSet resultSet;
    Statement statement;

    public MysqlStudentDB() throws SQLException {
        this.openConnection();
    }

    private boolean openConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_practise", "root", "");
            return true;
        }catch (SQLException e){
            throw e;
        }
    }
    @Override
    public String createInsertQuery(Student student) {

        return "INSERT INTO student (idNumber, name, gender) VALUES (" + student.getIdNumber() + ", \""+ student.getName() +"\", \""+ student.getGender()+"\");";
    }

    public String createUpdateQuery(Student student) {
        return "UPDATE student SET name = \"" + student.getName() + "\", gender = \""+ student.getGender() +"\", idNumber = " + student.getIdNumber()+ " WHERE id = " +student.getId()+ ";";
    }

    @Override
    public List<Student> getStudents() throws SQLException {

        List<Student> studentList = new ArrayList<>();
        String query = "SELECT * FROM student;";
        resultSet = executeReadQuery(query);

        while (resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setIdNumber(resultSet.getInt("idNumber"));
            student.setName(resultSet.getString("name"));
            student.setGender(resultSet.getString("gender"));
            studentList.add(student);
        }

        return studentList;
    }

    @Override
    public Student getStudent(int id) throws SQLException {
        String query = "SELECT * FROM student WHERE id = " + id + ";";

        resultSet = executeReadQuery(query);
        Student student = new Student();

        while (resultSet.next()) {
            student.setId(resultSet.getInt("id"));
            student.setIdNumber(resultSet.getInt("IdNUmber"));
            student.setGender(resultSet.getString("gender"));
            student.setName(resultSet.getString("name"));
        }
        return student;
    }

    @Override
    public boolean executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            System.out.println("Executed Successfully. ");
            return true;
        }catch (SQLException e){
            System.out.println("Failed to execute");
            return false;
        }
    }

    @Override
    public boolean deleteStudent(int id) {
        String query = "DELETE FROM student WHERE id = " + id;
        if(executeQuery(query))
            return true;
        else
            return false;
    }

    @Override
    public ResultSet executeReadQuery(String query) throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        return resultSet;

    }
}

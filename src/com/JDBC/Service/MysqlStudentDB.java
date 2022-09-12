package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlStudentDB implements IStudentDB{
    private Connection connection;
    private ResultSet resultSet;
    Statement statement;

    public MysqlStudentDB() {
        this.openConnection();
    }

    private boolean openConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_practise", "root", "");
            return true;
        }catch (SQLException e){
            return false;
        }
    }
    @Override
    public String createInsertQuery(Student student) {

        return "INSERT INTO student (idNumber, name, gender) VALUES (" + student.getIdNumber() + ", \""+ student.getName() +"\", \""+ student.getGender()+"\");";
    }

    @Override
    public List<Student> getStudents() throws SQLException {

        List<Student> studentList = new ArrayList<>();
        String query = "SELECT * FROM student;";
        ResultSet resultSet = executeReadQuery(query);

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
        return null;
    }

    @Override
    public boolean executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        }catch (SQLException e){
            return false;
        }
    }

    @Override
    public ResultSet executeReadQuery(String query) throws SQLException {

        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        return resultSet;

    }
}

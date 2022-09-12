package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.*;
import java.util.List;

public class MysqlStudentDB implements IStudentDB{
    private Connection connection;

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
        return null;
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
    public ResultSet executeReadQuery(String query) {
        return null;
    }
}

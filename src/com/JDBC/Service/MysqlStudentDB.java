package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MysqlStudentDB implements IStudentDB{
    private Connection connection;

    public MysqlStudentDB() {
        this.openConnection();
    }

    private boolean openConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/patients", "root", "");
            return true;
        }catch (SQLException e){
            return false;
        }
    }
    @Override
    public String createInsertQuery(Student student) {
        return null;
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
        return false;
    }

    @Override
    public ResultSet executeReadQuery(String query) {
        return null;
    }
}

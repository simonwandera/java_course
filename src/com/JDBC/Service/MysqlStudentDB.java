package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MysqlStudentDB implements IStudentDB{
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

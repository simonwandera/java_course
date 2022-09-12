package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IStudentDB {

    String createInsertQuery(Student student);
    String createUpdateQuery(Student student);
    List<Student> getStudents() throws SQLException;
    Student getStudent(int id) throws SQLException;
    boolean executeQuery(String query);
    boolean deleteStudent(int id);
    ResultSet executeReadQuery(String query) throws SQLException;
}

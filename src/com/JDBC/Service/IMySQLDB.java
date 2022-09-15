package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IMySQLDB<T extends IEntity> {

    String createInsertQuery(T t);
    String createUpdateQuery(Student student);

//    T getT(int id) throws SQLException;
    String createSelectEntityQuery(T t, int id);
//    boolean deleteStudent(int id);
    List<T> getList() throws SQLException;
//    Student getStudent(int id) throws SQLException;

    boolean executeQuery(String query);
    ResultSet executeReadQuery(String query) throws SQLException;
}

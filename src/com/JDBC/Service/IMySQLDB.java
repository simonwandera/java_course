package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IMySQLDB<T extends Entity> {

    String createInsertQuery(T t);
    String createUpdateQuery(Student student);
    List<T> fetchAll() throws SQLException;
    String createSelectQuery();
    public String createSelectWithWhereClauseQuery();
    boolean executeQuery(String query);
    public void save();
    ResultSet executeReadQuery(String query) throws SQLException;
}

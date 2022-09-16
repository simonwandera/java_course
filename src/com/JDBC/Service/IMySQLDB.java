package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IMySQLDB<T extends Entity> {

    String createInsertQuery();
    String createUpdateQuery(Map<String, Object> entryMap);
    public ResultSet fetchAll() throws SQLException;
    public ResultSet fetchOne() throws SQLException;
    String createSelectQuery();
    public String createSelectWithWhereClauseQuery();
    boolean executeQuery(String query);
    public void save();
    ResultSet executeReadQuery(String query) throws SQLException;
}

package com.JDBC.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MySQLDB<T extends Entity> implements IMySQLDB<T> {
    private Connection connection;
    static ResultSet resultSet;
    private Statement statement;
    private T t;

    public MySQLDB(T t) throws SQLException {
        this.t = t;
        this.openConnection();
    }

    @Override
    public String createSelectWithWhereClauseQuery(Map<String, String> criteria) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(t.getTableName()).append(" WHERE ");
        boolean isFirst = true;

        for (Map.Entry<String, String> entry: criteria.entrySet()){
            if (!isFirst)
                stringBuilder.append(" AND ");
            stringBuilder.append(entry.getKey()).append("=").append("\"").append(entry.getValue()).append("\"");
            isFirst = false;
        }

        return stringBuilder.toString();
    }

    @Override
    public String createSelectOneQuery() {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(t.getTableName()).append(" WHERE ").append("id = ").append(t.getEntitiesMap().get("id"));
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public String createSelectQuery() {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(this.t.getTableName());
        return stringBuilder.toString();
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
    public String createInsertQuery() {
        StringBuilder stringBuilder = new StringBuilder("INSERT INTO "); // insert into
        stringBuilder.append(t.getTableName()); // tbl_students or tbl_patients
        stringBuilder.append("(");
        // (id, name, registrationNumber, idNumber) or (id, patientNumber)
        boolean isFirstColumn = true;
        for (String key : t.getEntitiesMap().keySet())
        {
            if (!isFirstColumn)
                stringBuilder.append(",");
            stringBuilder.append("`").append(key).append("`");
            isFirstColumn = false;
        }
        stringBuilder.append(")").append("values").append("(");

        isFirstColumn = true;
        for (Object object: t.getEntitiesMap().values()){
            if (!isFirstColumn)
                stringBuilder.append(",");
            if (object != null)
                stringBuilder.append("\"").append(object).append("\"");
            else
                stringBuilder.append((Object) null);
            isFirstColumn = false;
        }
        stringBuilder.append(")");

        return stringBuilder.toString();
    }

    public String createUpdateQuery(Map <String, Object> entryMap) {
        StringBuilder updateQuery = new StringBuilder("UPDATE ");
        updateQuery.append(t.getTableName()).append(" SET ");
        boolean isFirst = true;
        for (Map.Entry<String, Object> entry: entryMap.entrySet()){
            if (!isFirst)
                updateQuery.append(",");
            updateQuery.append(entry.getKey()).append("=").append("\"").append(entry.getValue()).append("\"");
            isFirst = false;
        }

        updateQuery.append(" WHERE ").append("id =").append(entryMap.get("id"));

        System.out.println("Update query = " + updateQuery.toString());
        return updateQuery.toString();
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
    public void save() {
        String insertQuery = this.createInsertQuery();
        System.out.println("Insert query>>>: " +insertQuery);
        this.executeQuery(insertQuery);
    }

    @Override
    public ResultSet fetchAll() throws SQLException {
        String selectQuery = this.createSelectQuery();
        resultSet = this.executeReadQuery(selectQuery);
        return resultSet;
    }

    @Override
    public ResultSet fetchOne() throws SQLException {
        String selectQuery = this.createSelectOneQuery();
        resultSet = this.executeReadQuery(selectQuery);
        return resultSet;
    }

    @Override
    public void update() {
        String updateQuery = this.createUpdateQuery(t.getEntitiesMap());
        this.executeQuery(updateQuery);
    }

    @Override
    public ResultSet executeReadQuery(String query) throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        return resultSet;
    }
}

package com.JDBC.Service;

import com.JDBC.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MySQLDB<T extends IEntity> implements IMySQLDB<T> {
    private Connection connection;
    private ResultSet resultSet;
    Statement statement;

    private T t;

    HashMap<Object, Object> elementsToSelect;

    public MySQLDB() throws SQLException {
        this.openConnection();
    }

//    @Override
//    public T getT(int id) throws SQLException {
//        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
//        stringBuilder.append(t.getTableName()).append("WHERE ");
//        resultSet = executeReadQuery(stringBuilder.toString());
//
//        return null;
//    }

    @Override
    public String createSelectEntityQuery(T t, int id) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(t.getTableName()).append("WHERE ").append("");
        return stringBuilder.toString();
    }

    @Override
    public List<T> getList() throws SQLException {
        return null;
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
    public String createInsertQuery(T t) {
        StringBuilder stringBuilder = new StringBuilder("INSERT INTO "); // insert into
        stringBuilder.append(t.getTableName()); // tbl_students or tbl_patients
        stringBuilder.append("(");
        // (id, name, registrationNumber, idNumber) or (id, patientNumber)
        boolean isFirstColumn = true;
        for (String column : t.getColumns())
        {
            if (!isFirstColumn)
                stringBuilder.append(",");
            stringBuilder.append("`").append(column).append("`");
            isFirstColumn = false;
        }
        stringBuilder.append(")").append("values").append("(");

        isFirstColumn = true;
        for (Object object: t.getTargetColumns()){
            if (!isFirstColumn)
                stringBuilder.append(",");
            stringBuilder.append("\"").append(object).append("\"");
            isFirstColumn = false;
        }
        stringBuilder.append(")");

        return stringBuilder.toString();
    }

    public String createUpdateQuery(Student student) {
        return "UPDATE student SET name = \"" + student.getName() + "\", gender = \""+ student.getGender() +"\", idNumber = " + student.getIdNumber()+ " WHERE id = " +student.getId()+ ";";
    }

//    @Override
//    public List<Student> getStudents() throws SQLException {
//
//        List<Student> studentList = new ArrayList<>();
//        String query = "SELECT * FROM student;";
//        resultSet = executeReadQuery(query);
//
//        while (resultSet.next()){
//            Student student = new Student();
//            student.setId(resultSet.getInt("id"));
//            student.setIdNumber(resultSet.getInt("idNumber"));
//            student.setName(resultSet.getString("name"));
//            student.setGender(resultSet.getString("gender"));
//            studentList.add(student);
//        }
//
//        return studentList;
//    }

//    @Override
//    public Student getStudent(int id) throws SQLException {
//        String query = "SELECT * FROM student WHERE id = " + id + ";";
//
//        resultSet = executeReadQuery(query);
//        Student student = new Student();
//
//        while (resultSet.next()) {
//            student.setId(resultSet.getInt("id"));
//            student.setIdNumber(resultSet.getInt("IdNUmber"));
//            student.setGender(resultSet.getString("gender"));
//            student.setName(resultSet.getString("name"));
//        }
//        return student;
//    }

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

//    @Override
//    public boolean deleteStudent(int id) {
//        String query = "DELETE FROM student WHERE id = " + id;
//        if(executeQuery(query))
//            return true;
//        else
//            return false;
//    }

    @Override
    public ResultSet executeReadQuery(String query) throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        return resultSet;
    }
}
package com.JDBC.Model;

import com.JDBC.Service.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Student extends Entity {
    private int id;
    private String name;
    private int IdNumber;
    private String gender;
    static ResultSet resultSet;

    private static final String tableName = "student";
    private static final Map<String, Object> entitiesMap = new HashMap<>(){{
        put("id", null);
        put("name", "");
        put("idNumber", "");
        put("gender", "");
    }};;

    public Student() throws SQLException {
        super(entitiesMap, tableName);
    }

    public int getId() {
        return id;
    }

    public static Map<String, Object> getEntities() {
        return entitiesMap;
    }

    public void setId(int id) {
        entitiesMap.put("id", id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        entitiesMap.put("name", name);
        this.name = name;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(int idNumber) {
        entitiesMap.put("idNumber", idNumber);
        IdNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        entitiesMap.put("gender", gender);
        this.gender = gender;
    }
    public List<Student> displayAll() throws SQLException {
        List<Student> studentList = new ArrayList<>();
        resultSet = this.getMySqlDB().fetchAll();
        while (resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setGender(resultSet.getString("gender"));
            student.setIdNumber(resultSet.getInt("idNumber"));
            studentList.add(student);
        }
        return studentList;
    }

        @Override
    public String toString() {
        return "id= " + id + "\tidNumber= " + IdNumber + "\tname= " + name + "\tgender= " + gender;
    }

}

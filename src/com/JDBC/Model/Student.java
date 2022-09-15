package com.JDBC.Model;

import com.JDBC.Service.IEntity;

import java.util.*;

public class Student extends IEntity {
    private int id;
    private String name;
    private int IdNumber;
    private String gender;
    private static final String tableName = "student";
    private static Map<String, Object> entitiesMap = new HashMap<>(){{
        entitiesMap.put("id", "");
        entitiesMap.put("name", "");
        entitiesMap.put("idNumber", "");
        entitiesMap.put("gender", "");
    }};;

    public Student() {
        super(entitiesMap, tableName);
    }

    public int getId() {
        return id;
    }

    public static Map<String, Object> getEntities() {
        return entities;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id= " + id + "\tidNumber= " + IdNumber + "\tname= " + name + "\tgender= " + gender;
    }
}

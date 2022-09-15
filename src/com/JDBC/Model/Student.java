package com.JDBC.Model;

import com.JDBC.Service.IEntity;

import java.util.*;

public class Student extends IEntity {
    private int id;
    private String name;
    private int IdNumber;
    private String gender;
    private static final String tableName = "student";
    private static final Map<String, Object> entitiesMap = new HashMap<>(){{
        put("id", null);
        put("name", "");
        put("idNumber", "");
        put("gender", "");
    }};;

    public Student() {
        super(entitiesMap, tableName);
    }

    public int getId() {
        return id;
    }

    public static Map<String, Object> getEntities() {
        return entitiesMap;
    }

    public void setId(int id) {
        this.entitiesMap.put("id", id);
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

    @Override
    public String toString() {
        return "id= " + id + "\tidNumber= " + IdNumber + "\tname= " + name + "\tgender= " + gender;
    }
}

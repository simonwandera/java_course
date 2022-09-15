package com.JDBC.Model;

import com.JDBC.Service.IEntity;

import java.util.*;

public class Teacher extends IEntity {

    private int id;
    private int idNumber;
    private String name;
    private String gender;
    private String tscNumber;
    private String qualification;
    private static final String tableName = "teacher";

    private static final Map<String, Object> entitiesMap = new HashMap<>(){{
        put("id", "");
        put("idNumber", "");
        put("name", "");
        put("gender", "");
        put("tscNumber", "");
        put("qualification", "");
    }};;

    public Teacher() {
        super(entitiesMap, tableName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTscNumber() {
        return tscNumber;
    }

    public void setTscNumber(String tscNumber) {
        this.tscNumber = tscNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", idNumber=" + idNumber +
                ", name=" + name +
                ", gender='" + gender + '\'' +
                ", tscNumber='" + tscNumber + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}

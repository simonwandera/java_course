package com.JDBC.Model;

import com.JDBC.Service.IEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends IEntity {

    private int id;
    private int idNumber;
    private int name;
    private String gender;
    private String tscNumber;
    private String qualification;
    private static final String tableName = "teacher";
    private static final String[] columnNames = {"idNumber", "name", "gender", "tscNumber", "qualification"};
    private static final List<String> columns = new ArrayList<>(Arrays.asList(columnNames));

    public Teacher() {
        super(columns, tableName);
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
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

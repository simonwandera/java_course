package com.JDBC.Model;

public class Student {
    int id;
    String name;
    int IdNumber;
    String gender;

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
        return "id= " + id + "idNumber= " + IdNumber + "name= " + name + "gender= " + gender;
    }
}

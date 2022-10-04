package com.ClassesAndIterfaces;

public class Alien implements IAlien{
    String alienNo;
    String alienName;

    public Alien(String alienNo, String alienName) {
        this.alienNo = alienNo;
        this.alienName = alienName;
    }

    public String getAlienNo() {
        return alienNo;
    }

    public void setAlienNo(String alienNo) {
        this.alienNo = alienNo;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    @Override
    public void walk() {
        System.out.println(this.alienName + "is now walking on space");
    }

    @Override
    public void run() {
        System.out.println(this.alienName + " is now running online");
    }
}

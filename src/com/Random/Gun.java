package com.Random;

public class Gun extends Weapon{

    public Gun(int weaponNumber, boolean active) {
        super(weaponNumber);
    }

    public void shoot(){
        System.out.println("Shooting");

    }
}

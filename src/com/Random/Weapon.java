package com.Random;

public class Weapon {

    private int weaponNumber;
    private boolean active;

    private int bullets;

    private int missiles;
    public Weapon(int weaponNumber) {
        this.weaponNumber = weaponNumber;
    }

    public void setActive(boolean active){
        this.active = active;
    }
}


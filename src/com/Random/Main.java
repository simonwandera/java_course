package com.Random;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Weapon> weapons = new ArrayList<>();

        weapons.add(new Gun(12, true));

        if(weapons.get(0) instanceof Weapon){
            System.out.println("Gun is an instance of a weapon");
        }
    }
}

package com.JavaClases;

import java.util.ArrayList;
import java.util.Random;

public class Army {
//    private Soldier[] soldiers;

    private ArrayList<Soldier> soldiers;
//    private Gun[] guns;
    private ArrayList<Gun> guns;
//    private Tank[] tanks;
    private ArrayList<Tank> tanks;
//    private Jet[] jets;
    private ArrayList<Jet> jets;
    private static final int maxGuns= 100;

    public Army() {
//        guns = new Gun[maxGuns];

        guns = new ArrayList<>();
        for (int k = 0; k < maxGuns; k ++) {
            int rand = new Random().nextInt(100);
            if (rand % 3 == 0)
//                guns[k] = new Gun("medium", 5);
                guns.add(new Gun("medium", 5));

            else if (rand % 5 == 0)
//                guns[k] = new Gun("small", 5);
                guns.add(new Gun("small", 5));

            else
//                guns[k] = new Gun("large", 5);
            guns.add(new Gun("large", 5));
        }
    }

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    private void assignGuns() {
        for (int k = 0; k < soldiers.size(); k ++) {
            int gunIndex = new Random().nextInt(maxGuns - 1);
//            soldiers[k].setGun(guns[gunIndex]);
            soldiers.get(k).setGun(guns.get(gunIndex));
        }
    }

    public void setSoldiers(ArrayList<Soldier> soldiers) {
        this.soldiers = soldiers;
        this.assignGuns();
    }

    public ArrayList<Gun> getGuns() {
        return guns;
    }

    public void setGuns(ArrayList<Gun> guns) {
        this.guns = guns;
    }

    public ArrayList<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(ArrayList<Tank> tanks) {
        this.tanks = tanks;
    }

    public ArrayList<Jet> getJets() {
        return jets;
    }

    public void setJets(ArrayList<Jet> jets) {
        this.jets = jets;
    }
}

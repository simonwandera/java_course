package JavaClases;

import java.util.Random;

public class Army {
    private Soldier[] soldiers;
    private Gun[] guns;
    private Tank[] tanks;
    private Jet[] jets;
    private static final int maxGuns= 100;

    public Army() {
        guns = new Gun[maxGuns];
        for (int k = 0; k < maxGuns; k ++) {
            int rand = new Random().nextInt(100);
            if (rand % 3 == 0)
                guns[k] = new Gun("medium", 100);
            else if (rand % 5 == 0)
                guns[k] = new Gun("small", 50);
            else
                guns[k] = new Gun("large", 250);
        }
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }

    private void assignGuns() {
        for (int k = 0; k < soldiers.length; k ++) {
            int gunIndex = new Random().nextInt(maxGuns - 1);
            soldiers[k].setGun(guns[gunIndex]);
        }
    }

    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers = soldiers;
        this.assignGuns();
    }

    public Gun[] getGuns() {
        return guns;
    }

    public void setGuns(Gun[] guns) {
        this.guns = guns;
    }

    public Tank[] getTanks() {
        return tanks;
    }

    public void setTanks(Tank[] tanks) {
        this.tanks = tanks;
    }

    public Jet[] getJets() {
        return jets;
    }

    public void setJets(Jet[] jets) {
        this.jets = jets;
    }
}

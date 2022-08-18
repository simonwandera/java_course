package JavaClases;

public class Soldier {
    private Gun gun;
    private String militaryId;
    private char type; // A or E

    private Jet jet;
    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.gun = new Gun("small", 30);
        this.jet = new Jet(12, "JET_0054");
    }
    public void shootBullets() {
        System.out.println(this.militaryId + " shooting");
        this.gun.shootBullets();
    }

    public void shootMissile(){
        System.out.println(this.militaryId + ": Releasing missile");
        this.gun.shootMissiles();
    }
    public void changeShootingMode() {
        this.gun.changeShootingMode();
    }

    public int getBullets(){
        return this.gun.getBullets();
    }

    public void reloadGun(){
        this.gun.setBullets(20);
    }

    public void changeGunSize(String size){
        this.gun.setGunSize(size);
    }

    public void fireJetMissile(){
        this.jet.fireMissiles();
    }

    public void reloadJetMissile(){
        this.jet.setMissiles(10);
    }

    public int getJetMissiles(){
        return this.jet.getMissiles();
    }
}

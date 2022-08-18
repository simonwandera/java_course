package JavaClases;

public class Soldier {
    private Gun gun;
    private String militaryId;
    private char type; // A or E
    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.gun = new Gun("small", 30);
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
}

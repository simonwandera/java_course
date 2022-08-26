package com.JavaClases;
public class Soldier {
    private Gun gun;
    private boolean alive;
    private String militaryId;
    private Jet jet;
    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.alive = true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public boolean gunHasBullets() {
        if (this.gun.getBullets() > 0)
            return true;
        else
            return false;
    }
    public void shoot() {
        System.out.println(this.militaryId + " shooting");
        this.gun.shootBullets();
    }

    public void setGun(Gun gun) {
        this.gun = gun;
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
        this.jet.missiles --;
    }

    public void reloadJetMissile(){
        this.jet.setMissiles(10);
    }

    public int getJetMissiles(){
        return this.jet.getMissiles();
    }

    public void shot() {
        this.alive = false;
        System.out.println(this.militaryId + " Was just killed");
        this.gun.setBullets(0);
    }
}

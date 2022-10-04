package com.JavaClases;

public class Tank {
    private String tankNumber;
    private String model; // T-72
    private int shell;
    private String tankSize;
    private String tankWeight;
    private Gun gun;


    public Tank(String tankNumber, String model, int shell, String size) {
        this.tankNumber = tankNumber;
        this.model = model;
        this.shell = shell;
        this.tankSize = size;
        this.gun = new Gun("large", 30);

    }
    public void reloadShell(int reload){
        shell = reload;
        gun.setBullets(reload);
    }
    public String getTankSize() {
        return tankSize;
    }
    public void setTankSize(String tankSize) {
        this.tankSize = tankSize;
    }

    public String getTankNumber() {
        return tankNumber;
    }

    public void setTankNumber(String tankNumber) {
        this.tankNumber = tankNumber;
    }
    public void changeTankModel(String model) {
        this.model = model;
    }

    public int getShell() {
        return shell;
    }

    public void setShell(int shell) {
        this.shell = shell;
    }

    public void fireShell(){
        if(this.tankSize == "small"){
            gun.setGunSize("small");
            gun.shootMissiles();
        }else if(this.tankSize == "medium"){
            gun.setGunSize("medium");
            gun.shootMissiles();
        } else if(this.tankSize == "large"){
            gun.setGunSize("large");
            gun.shootMissiles();
        }
        this.shell--;
    }
}
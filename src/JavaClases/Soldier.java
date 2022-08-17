package JavaClases;

public class Soldier {
    private Gun gun;
    private String militaryId;
    private char type; // A or E
    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.gun = new Gun("small");
    }
    public void shoot() {
        System.out.println(this.militaryId + " shooting");
        this.gun.shootBullets();
    }
    public void changeShootingMode() {
        this.gun.changeShootingMode();
    }
}

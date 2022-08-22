package JavaClases;

public class Gun {
    int bullets;
    int maxBullets;
    char shootingMode; // S for single, A for automatic 5 bullets (per shot)
    String gunSize;

    public String getGunSize() {
        return gunSize;
    }

    public void setGunSize(String gunSize) {
        this.gunSize = gunSize;
    }

    public void reloadBullets() {
        bullets = maxBullets;
    }

    public char getShootingMode() {
        return shootingMode;
    }

    public void setShootingMode(char shootingMode) {

        this.shootingMode = shootingMode;
    }

    public void changeShootingMode() {
        if (shootingMode == 'S')
            this.setShootingMode('A');
        else
            this.setShootingMode('S');
    }

    public Gun(String size, int bullets) {
        this.shootingMode = 'S';
        this.maxBullets = 5;
        reloadBullets();
        this.gunSize = size;
        this.bullets = bullets;
    }
    public void shootBullets() {
        if (bullets > 0)
        {
            if (shootingMode == 'S'){
                bullets --;
                System.out.println("-");
            }
            else {
                bullets -= 5;
                System.out.println("-----");
            }
        }
    }

    public void shootMissiles() {
        if (bullets > 0)
        {
            if (this.gunSize.equals("small")){
                bullets --;
                System.out.println("------");
            }
            else if(this.gunSize.equals("medium")) {
                bullets --;
                System.out.println("---------------");
            } else if (this.gunSize.equals("large")) {
                bullets --;
                System.out.println("------------------------------");
                
            }
        }else {
            System.out.println("Reloadin ...");
            this.setBullets(15);
        }
    }
    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public void setMaxBullets(int maxBullets) {
        this.maxBullets = maxBullets;
    }
}

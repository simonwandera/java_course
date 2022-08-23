package JavaClases;

import java.util.Random;

public class WarGameWorld {
    private final static int maxSoldiers = 20;
    private Army ally;
    private Army enemy;
    public WarGameWorld() {
        this.setupGame();
    }

    private void setupGame() {
        // Create 2 armies (Ally and Enemy)
        ally = new Army();
        enemy = new Army();
        // 1000 soldiers per army
        Soldier[] allySoldiers = new Soldier[maxSoldiers];
        Soldier[] enemySoldiers = new Soldier[maxSoldiers];
        for (int k = 0; k < maxSoldiers; k++) {
            allySoldiers[k] = new Soldier("ALLY_00" + k);
            enemySoldiers[k] = new Soldier("ENEMY_00" + k);
        }
        ally.setSoldiers(allySoldiers);
        enemy.setSoldiers(enemySoldiers);
    }

    private void runGame() {
        // randomize enemy or ally
        int choice = new Random().nextInt(5);
        if (choice % 2 == 0) {
            // enemy
            for (int k = 0; k < 10; k ++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().length - 1);
                if (enemy.getSoldiers()[soldierIndex].getBullets() == 0)
                    enemy.getSoldiers()[soldierIndex].setAlive(false);
                else
                    enemy.getSoldiers()[soldierIndex].shoot();
            }
            // ally
            for (int k = 0; k < 10; k ++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().length - 1);
                choice = new Random().nextInt(5);
                if (choice % 2 == 0 && ally.getSoldiers()[soldierIndex].isAlive())
                    ally.getSoldiers()[soldierIndex].shot();
            }
        }
        else {
            for (int k = 0; k < 10; k ++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().length - 1);
                if (ally.getSoldiers()[soldierIndex].getBullets() == 0)
                    ally.getSoldiers()[soldierIndex].setAlive(false);
                else
                    ally.getSoldiers()[soldierIndex].shoot();
            }
            // ally
            for (int k = 0; k < 10; k ++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().length - 1);
                choice = new Random().nextInt(10);
                if (choice % 2 == 0 && enemy.getSoldiers()[soldierIndex].isAlive())
                    enemy.getSoldiers()[soldierIndex].shot();
            }
        }
    }

    private boolean allSoldiersAreDead(Army army) {
        for (int k = 0; k < army.getSoldiers().length; k ++)
            if (army.getSoldiers()[k].isAlive())
                return false;
        return true;
    }

    private boolean noWeaponHasBullets(Army army) {
        for (int k = 0; k < army.getSoldiers().length; k ++)
            if (army.getSoldiers()[k].gunHasBullets())
                return false;
        return true;
    }

    public void run() throws InterruptedException {
        // - Setup the game [Soldiers, Army (Ally, Enemy), Weapon Arsenal]
        // - Run the game [ Soldiers shoot at enemy, Control Weapons + Arsenal ]
        // - Control the game. Determine, when the game ends...
        // [1 - All soldiers are dead,
        // [2 - No weapon has bullets
        while (true) {

            if (allSoldiersAreDead(ally) || allSoldiersAreDead(enemy) || noWeaponHasBullets(ally) || noWeaponHasBullets(enemy)) {
                System.out.println("Ended");
                break;
            }

            System.out.println();
            this.runGame();
            Thread.sleep(2000);

        }
    }
}
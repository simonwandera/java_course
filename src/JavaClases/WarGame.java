package JavaClases;

import java.util.Random;

public class WarGame {
    private static Soldier[] createSoldiers() {
        Soldier[] soldiers = new Soldier[1000];
        for (int k = 0; k < 1000; k ++) {
            Soldier soldier = new Soldier("MIL_ID_000747");
            soldiers[k] = soldier;
        }
        return soldiers;
    }
    public static void main(String[] args) {
        Army army = new Army();
        army.setSoldiers(createSoldiers());

        Tank tank = new Tank("T1123", "canon", 13, "small");

        Soldier my_soldier = new Soldier("MIL_ID_000790");
        for(int i=0; i<50; i++){
            if(i < 15){
                tank.setTankSize("small");
            } else if(i < 30){
                tank.setTankSize("medium");
            } else {
                tank.setTankSize("large");
            }
        }


        Soldier soldier = new Soldier("MIL_ID_000747");
        int i = 0;
        while (i <= 10000) {
           soldier.shoot();
           if (new Random().nextInt() % 2 == 0)
               soldier.changeShootingMode();
           i += 1000;
        }
    }
}

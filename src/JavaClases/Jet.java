package JavaClases;

public class Jet {
    int missiles;

    public int getMissiles() {
        return missiles;
    }

    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }

    public Jet(int missiles){
        this.missiles = missiles;
    }

    public void fireMissiles(){
        if (this.missiles > 0){
            System.out.println("==============(**)==============");
            this.missiles--;
        }
    }
}
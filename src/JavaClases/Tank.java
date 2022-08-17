package JavaClases;

public class Tank {
    private String tankNumber;
    private String model; // T-72
    private int shell;
    private String tankSize;
    private int maxShell;
    private String tankWeight;

    private Gun gun;


    public Tank(String tankNumber, String model, int shell, String size) {
        this.tankNumber = tankNumber;
        this.model = model;
        this.shell = shell;
        this.maxShell = 500;
        this.tankSize = size;
        this.gun = new Gun("large");
    }
    public void reloadShell(){
        shell = maxShell;
    }

    public String getTankSize() {
        return tankSize;
    }

    public void setTankSize(String tankSize) {
        this.tankSize = tankSize;
    }

    public int getMaxShell() {
        return maxShell;
    }

    public void setMaxShell(int maxShell) {
        this.maxShell = maxShell;
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

    public void fireShell(){
        if(shell > 0){
            if(tankSize == 'canon'){

            }
        }
    }
}
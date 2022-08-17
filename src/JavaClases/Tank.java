package JavaClases;

public class Tank {
    private String tankNumber;
    private String model; // T-72
    private int shell;

    private int maxShell;

    public Tank(String tankNumber, String model, int shell) {
        this.tankNumber = tankNumber;
        this.model = model;
        this.shell = shell;
        this.maxShell = 500;

    }
    public void reloadShell(){
        shell = maxShell;
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
}
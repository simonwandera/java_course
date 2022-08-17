package JavaClases;

public class Tank {
    private String tankNumber;
    private String model; // T-72
    private int shell;

    public Tank(String tankNumber, String model, int shell) {
        this.tankNumber = tankNumber;
        this.model = model;
        this.shell = shell;
    }

    public String getTankNumber() {
        return tankNumber;
    }

    public void setTankNumber(String tankNumber) {
        this.tankNumber = tankNumber;
    }

    public void shoot() {
        
    }
}
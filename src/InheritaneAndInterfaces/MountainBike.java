package InheritaneAndInterfaces;

public class MountainBike extends Bicycle{
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }


    public static void main(String[] args) {

        MountainBike myBike = new MountainBike(12, 20, 40, 3);
        System.out.println(myBike.speed);
        myBike.speedUp(12);
        System.out.println(myBike.speed);

    }

}

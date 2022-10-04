package com.Random;

public class Car {
        int carId;
        String model;
        String manufacturer;
        int odometer;

        public Car(int carId, String model, String manufacturer, int odometer) {
            this.carId = carId;
            this.model = model;
            this.manufacturer = manufacturer;
            this.odometer = odometer;
        }

        public void printer(){
            System.out.println("This is car "+carId );
        }
}

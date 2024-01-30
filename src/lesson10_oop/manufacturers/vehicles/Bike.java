package lesson10_oop.manufacturers.vehicles;

import lesson10_oop.manufacturers.Vehicle;

public class Bike extends Vehicle {
    String model;
    String brand;

    public Bike(double engineVolume, int wheelsCount, String model, String brand) {
        super(engineVolume, wheelsCount);
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void ride() {
        System.out.println("Riding bike");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

package lesson10_oop.manufacturers.vehicles;

import lesson10_oop.manufacturers.Vehicle;

public class Truck extends Vehicle {
    public String model;
    public String brand;
    public int capacity;


    public Truck(double engineVolume, int wheelsCount, String model, String brand, int capacity) {
        super(engineVolume, wheelsCount);
        this.model = model;
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public void ride() {
        System.out.println("Drive hard truck");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

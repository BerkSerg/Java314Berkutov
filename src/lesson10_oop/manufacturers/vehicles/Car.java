package lesson10_oop.manufacturers.vehicles;

import lesson10_oop.manufacturers.Vehicle;

public class Car extends Vehicle {
    public String model;
    public String brand;
    public String type;
    public boolean gearAuto;

    public Car(double engineVolume, int wheelsCount, String model, String brand, String type, boolean gearAuto) {
        super(engineVolume, wheelsCount);
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.gearAuto = gearAuto;
    }

    @Override
    public void ride() {
        System.out.println("Drive car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

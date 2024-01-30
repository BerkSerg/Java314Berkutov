package lesson10_oop.manufacturers.brands;

import lesson10_oop.manufacturers.Vehicle;
import lesson10_oop.manufacturers.vehicles.Bike;
import lesson10_oop.manufacturers.vehicles.Truck;

public class Man implements IManufacture{
    @Override
    public Vehicle[] getVehicles(int amount) {
        Truck[] production = new Truck[amount];
        for(int i = 0; i < amount; i++){
            production[i] = new Truck(5.6, 8, "M-150", "Man", 15);
        }
        return production;
    }

    @Override
    public Part[] getParts(int amount) {
        Part[] production = new Part[amount];
        for(int i = 0; i < amount; i++){
            production[i] = new Part("brakes", Integer.valueOf(i).hashCode());
        }
        return production;

    }
}

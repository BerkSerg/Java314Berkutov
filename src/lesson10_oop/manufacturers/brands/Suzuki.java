package lesson10_oop.manufacturers.brands;

import lesson10_oop.manufacturers.Vehicle;
import lesson10_oop.manufacturers.vehicles.Bike;

public class Suzuki implements IManufacture{
    @Override
    public Vehicle[] getVehicles(int amount) {
        Vehicle[] production = new Vehicle[amount];
        for(int i = 0; i < amount; i++){
            production[i] = new Bike(0.9, 2, "650", "Suzuki");
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

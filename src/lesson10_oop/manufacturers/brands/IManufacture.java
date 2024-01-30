package lesson10_oop.manufacturers.brands;

import lesson10_oop.manufacturers.Vehicle;

public interface IManufacture {
    Vehicle[] getVehicles(int amount);
    Part[] getParts(int amount);
}

package lesson10_oop.manufacturers;

import lesson10_oop.manufacturers.brands.BMW;
import lesson10_oop.manufacturers.brands.IManufacture;
import lesson10_oop.manufacturers.brands.Man;
import lesson10_oop.manufacturers.brands.Suzuki;

public class Main {

    public static void main(String[] args) {
        AutoMarket am = new AutoMarket();
        IManufacture bmv = new BMW();
        IManufacture suzuki = new Suzuki();
        IManufacture man = new Man();

        Vehicle[] bmws = bmv.getVehicles(13);
        Vehicle[] suzukis = suzuki.getVehicles(13);
        Vehicle[] mans = man.getVehicles(13);

        for(int i = 0; i < 40; i++){

        }

    }
}

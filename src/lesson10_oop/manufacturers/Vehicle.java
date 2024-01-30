package lesson10_oop.manufacturers;

public abstract class Vehicle {
    public double engineVolume;
    public int wheelsCount;

    public Vehicle(double engineVolume, int wheelsCount){
        this.engineVolume = engineVolume;
        this.wheelsCount = wheelsCount;
    };

    abstract public void ride();

}

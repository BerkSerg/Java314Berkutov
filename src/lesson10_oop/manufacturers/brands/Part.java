package lesson10_oop.manufacturers.brands;

public class Part {
    String brand;
    int partNumber;

    public Part(String brand, int partNumber) {
        this.brand = brand;
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Part{" +
                "brand='" + brand + '\'' +
                ", partNumber='" + partNumber + '\'' +
                '}';
    }
}

package lesson10.shape;

public class Rectangle extends Shape{
    private int sideA;

    public Rectangle(String color, int sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    double area() {
        return sideA * sideA;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", sideA=" + sideA +
                '}';
    }
}

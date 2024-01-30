package lesson10.shape;

public class Circle extends Shape{
    @Override
    double area() {
        return Math.PI * radius*radius;
    }

    private int radius;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}

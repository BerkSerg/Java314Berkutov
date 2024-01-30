package lesson10.shape;

abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double area();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

package lesson10.shape;

import java.awt.*;

public class Main {
    Color black = Color.BLACK;
    final static Drawer drawer = new Drawer();
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("black", 5);
        Circle c1 = new Circle("blue", 7);
        drawer.draw(r1);
        drawer.draw(c1);
    }
}

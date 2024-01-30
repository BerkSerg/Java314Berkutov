import javax.swing.*;

public class Java314Berkutov_Lesson6_class {
    public static void main(String[] args){
        Fruit apple = new Fruit("Яблоко", 0.7, 100);
        Fruit pear = new Fruit("Груша", 0.45, 200);
        apple.printInfo();
        pear.printInfo();
    }
}

class Fruit {
    String name;
    double weight;
    double price;

    public Fruit(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Информация о фрукте:");
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Вес: " + weight);
        System.out.println("Стоимость: " + weight * price);
    }
}

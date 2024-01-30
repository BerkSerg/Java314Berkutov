package hw10;

import java.util.Scanner;

//TODO Задание 4. Цифры числа справа налево
// Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами.
// Разрешена только рекурсия и целочисленная арифметика.
public class Recurs_task4 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число:");
        try {
            int number = sc.nextInt();
            printNumbersReverse(number);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    private static void printNumbersReverse(int number) {
        if (number % 10 == number) {
            System.out.print(number);
            return;
        }
        System.out.printf("%s ", number % 10);
        printNumbersReverse(number / 10);
    }
}


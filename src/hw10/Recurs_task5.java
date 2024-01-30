package hw10;

import java.util.Scanner;

//TODO Задание 5. Цифры числа слева направо
// Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их
// пробелами или новыми строками. При решении этой задачи
// нельзя использовать  строки, списки, массивы, циклы. Разрешена только рекурсия и целочисленная арифметика.
public class Recurs_task5 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число:");
        try {
            int number = sc.nextInt();
            printNumbers(number);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    private static void printNumbers(int number) {
        if (number % 10 == number) {
            System.out.printf("%s ", number);
            return;
        } else {
            printNumbers(number / 10);
        }
        System.out.printf("%s ", number % 10);
    }
}


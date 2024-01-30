package hw10;

import java.util.Scanner;

//TODO Задание 6. Разворот числа
// С клавиатуры вводится число n, десятичная запись которого не содержит нулей. Получите число,
// записанное теми же цифрами, но в противоположном порядке. При решении этой задачи разрешается только
// рекурсия и целочисленная арифметика. Метод должен возвращать целое число, являющееся результатом
// работы программы, выводить число по одной цифре нельзя
public class Recurs_task6 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число:");
        try {
            int number = sc.nextInt();
            System.out.println(getNumbersRevers(number, 0));
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    private static int getNumbersRevers(int number, int newNum) {
        if (number == 0) {
            return newNum;
        } else {
            return getNumbersRevers(number / 10, newNum * 10 + number % 10);
        }
    }
}


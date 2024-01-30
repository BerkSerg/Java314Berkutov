package hw10;

import java.util.Scanner;

//TODO Задание 2. Точная степень двойки
// Дано натуральное число N. Выведите слово YES, если число
// N является точной степенью двойки, или слово NO – в противном случае.
public class Recurs_task2 {
    final static Scanner sc = new Scanner(System.in);
    final static int TWO = 2;

    public static void main(String[] args) {
        System.out.print("Введите число:");
        try {
            int number = sc.nextInt();
            System.out.println(isNumPowOfTwo(number, TWO) ? "YES" : "NO");
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    private static boolean isNumPowOfTwo(int number, int powOfTwo) {
        if (number == powOfTwo) {
            return true;
        }
        if (number < powOfTwo) {
            return false;
        }
        return isNumPowOfTwo(number, powOfTwo * TWO);
    }
}

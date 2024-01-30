package hw10;

import java.util.Scanner;

//TODO Задание 3. Сумма цифр числа. Дано натуральное число N. Вычислите сумму его цифр
public class Recurs_task3 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число:");
        try {
            int number = sc.nextInt();
            System.out.println(getSumOfNumbers(number));
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    private static int getSumOfNumbers(int number) {
        int res;
        if(number % 10 == number){
            return number;
        }
        res = number % 10;
        return res + getSumOfNumbers(number / 10);
    }
}

package hw10;

import java.util.Scanner;

//TODO Задание 1 //Даны два целых числа A и В. Выведите все числа от A до
// B включительно, в порядке возрастания, если A < B, или в
// порядке убывания – в противном случае
public class Recurs_task1 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число:");
        try {
            int number1 = sc.nextInt();
            System.out.print("Введите второе число:");
            int number2 = sc.nextInt();
            printNext(number1, number2);
        } catch(NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    private static void printNext(int from, int to) {
        if (from == to ) {
            System.out.print(to);
            return;
        }
        System.out.print(from);
        printNext((from > to) ? --from : ++from, to);
    }
}

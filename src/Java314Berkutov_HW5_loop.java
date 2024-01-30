import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Java314Berkutov_HW5_loop {
    public static void main(String[] args){
        //task1();
        //task2();
        //task3();
        task4();
        //task5();
        //task6();

    }

    // TODO Определение года на високосность
    static void task1(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();
            boolean is4year = (year % 400 == 0 || (year % 4 == 0 && year % 100 > 0));
            String yearType = (is4year) ? "високосный" : "не високосный";
            System.out.printf("Год %d - %s\n", year, yearType);
        } catch(InputMismatchException e){
            System.out.println("Введено не число");
        }
    }

    //TODO Проверка на палиндром
    static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        String lineMod = line.toLowerCase().replaceAll("[^а-я,a-z]", "");
        int lineLength = lineMod.length() - 1;
        int x = 0;
        while (x <= (lineLength - x)){
            char symbolOne = lineMod.charAt(x);
            char symbolTwo = lineMod.charAt(lineLength - x);
            if(symbolOne != symbolTwo){
                System.out.println("Это не палиндром");
                return;
            }
            x++;
        }
        System.out.println("Это палиндром");
    }

    //TODO Пирамида из звездочек
    static void task3(){
        final int HEIGHT = 5;
        final int WIDTH = HEIGHT * 2;

        for(int y = HEIGHT; y > 0; y--){
            for(int x = 0; x < WIDTH; x++){
                if(y <= x && (WIDTH - x >= y)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }

    //TODO Нахождение простых чисел в диапазоне
    static void task4(){
        final int FIRST_NUMBER = 2;
        final int LAST_NUMBER = 100;
        for( int i = FIRST_NUMBER; i <= LAST_NUMBER; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    /* isPrime(int number)
    * поиск простого числа. делится без остатка только на себя и на 1
    */
    public static boolean isPrime(int number){
        for(int x = 2; x <= Math.sqrt(number); x++ ){
            if(number % x == 0){
                return false;
            }
        }
        return true;
    }

    //TODO Угадай число
    static void task5(){
        final int FROM = 0;
        final int TO = 100;
        Random rnd = new Random();
        int number = rnd.nextInt(FROM, TO+1);
        System.out.printf("Я загадал число от %d до %d, попробуй угадать.\n", FROM, TO);

        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int count = 0;
        do {
            try {
                count++;
                System.out.print("Введи число: ");
                int tryNumber = scanner.nextInt();
                result = (number == tryNumber);
                if(result){
                    System.out.println("Верно! Количество попыток: " + count);
                }else{
                    if(tryNumber >  number){
                        System.out.println("Меньше.");
                    }else{
                        System.out.println("Больше.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Введено не число");
            }
        }while(!result);
    }

    //TODO Пропуск четных чисел
    static void task6(){
        final int FROM = 1;
        final int TO = 20;
        for(int i = FROM; i <= TO; i++){
            if(i % 2 == 0){
                continue;
            }
            if(i > FROM){
                System.out.print(" ");
            }
            System.out.print(i);
        }
    }
}


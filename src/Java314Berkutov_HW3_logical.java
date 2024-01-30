import java.util.InputMismatchException;
import java.util.Scanner;

public class Java314Berkutov_HW3_logical{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            String result = (number % 2 == 0) ? "Число - четное" : "Число - нечетное";
            System.out.println(result);
        } catch(InputMismatchException e){
            System.out.println("Введенные данные не являются числом");
        }
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите первое число: ");
            int numberOne = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int numberTwo = scanner.nextInt();
            if(numberOne == numberTwo) {
                System.out.println("Числа равны\n");
            }else {
                int result = (numberOne > numberTwo) ? numberOne : numberTwo;
                System.out.printf("Наибольшее число - %d\n", result);
            }
        } catch(InputMismatchException e){
            System.out.println("Введенные данные не являются числом");
        }
    }

    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if( (number % 2 == 0) && (number % 5 == 0) ){
                System.out.printf("Число %d делится на 2 и 5", number);
            } else if( (number % 3 == 0) && (number % 7 ==0) ) {
                System.out.printf("Число %d делится на 3 и 7", number);
            } else {
                System.out.printf("Число %d не делится на 3 и 7 и не делится на 2 и 5", number);
            }
        } catch(InputMismatchException e){
            System.out.println("Введенные данные не являются числом");
        }
    }
}
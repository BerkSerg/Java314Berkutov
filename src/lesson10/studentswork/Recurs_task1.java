package lesson10.studentswork;


//TODO 1) Метод нахождения факториала числа. Результат – число
public class Recurs_task1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int num) {
        if(num <= 1){
            return 1;
        }
        return num * factorial(--num);
    }
}

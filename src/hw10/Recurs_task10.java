package hw10;

public class Recurs_task10 {
    public static void main(String[] args) {
        System.out.println(getNOD(10, 15));
        System.out.println(getNOD(287, 451));
    }

    private static int getNOD(int number1, int number2) {
        if ((number1 % number2) == 0) {
            return number2;
        }
        return getNOD(number2, number1 % number2);
    }
}

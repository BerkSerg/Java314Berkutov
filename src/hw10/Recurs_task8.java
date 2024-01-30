package hw10;

//TODO Задание 8. Степень числа
// Вычислить результат возведения числа m в степень n, используя рекурсию. В статический метод
// передается 2 параметра – число и степень
public class Recurs_task8 {
    public static void main(String[] args) {
        System.out.println(myPow(2, 8));
        System.out.println(myPow(5, 3));
        System.out.println(myPow(10, 5));
    }

    private static int myPow(int number, int pow) {
        return (pow == 1) ? number : number * myPow(number, --pow);
    }
}

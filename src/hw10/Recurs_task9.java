package hw10;

// TODO Задание 9. Сумма чисел в диапазоне
//  Вычислить сумму чисел в определенном диапазоне. Начало и конец диапазона задается параметрами.
public class Recurs_task9 {
    public static void main(String[] args) {
        System.out.println(calcSumm(5, 9));
        System.out.println(calcSumm(0, 9));
    }

    private static int calcSumm(int from, int to) {
        return (from == to) ? from : from + calcSumm(++from, to);
    }
}

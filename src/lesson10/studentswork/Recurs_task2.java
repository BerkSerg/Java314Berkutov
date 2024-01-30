package lesson10.studentswork;

//TODO 2) Метод, находящий сумму чисел из диапазона  Результат- число
public class Recurs_task2 {
    public static void main(String[] args) {
        System.out.println(getSumRange(1, 5));
    }

    private static int getSumRange(int num1, int num2) {
        int res;
        if(num1 == num2){
            return num1;
        }
        res = num1 + getSumRange(++num1, num2);
        return res;
    }
}

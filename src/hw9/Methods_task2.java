package hw9;

import java.util.Arrays;
import java.util.Random;


//TODO Написать статический метод, заполняющий массив заданной в аргументах длины целыми случайными
// числами из диапазона 100-200
public class Methods_task2 {
    static final int FROM = 100;
    static final int TO = 200;

    public static void main(String[] args) {
        int[] array = getFilledArray(10);
        System.out.println(Arrays.toString(array));
    }

    private static int[] getFilledArray(int size){
        Random rnd = new Random();
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = rnd.nextInt(FROM,TO + 1);
        }
        return result;
    }
}

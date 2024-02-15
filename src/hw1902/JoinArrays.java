package hw1902;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JoinArrays {
    public static void main(String[] args) {
        Integer[] arrayOne = {1, 2, 3, 4, 5};
        Integer[] arrayTwo = {1, 2, 3, 4, 5};
        String[] arrayThree = {"1", "2", "3", "4", "5"};
        Integer[] arrayFour = {0, 2, 3, 4, 5};

        printResult(joinArrays(arrayOne, arrayTwo));
        printResult(joinArrays(arrayTwo, arrayThree));
    }

    private static <T> T[] joinArrays(T[] arrayOne, T[] arrayTwo) {
        if(!arrayOne.getClass().equals(arrayTwo.getClass())){
            System.out.println("Массивы не могут быть сложены");
            return null;
        }

        T[] result = (T[]) Array.newInstance(arrayOne.getClass().getComponentType(), arrayOne.length + arrayTwo.length);

        int i = 0;
        int j = 0;
        while ((i + j) < result.length) {
            if (i < arrayOne.length) {
                result[i + j] = arrayOne[i++];
            }
            if (j < arrayTwo.length) {
                result[i + j] = arrayTwo[j++];
            }
        }
        return result;
    }

    private static <T> void printResult(T[] result) {
        System.out.println("Массив: " + Arrays.toString(result));
    }
}

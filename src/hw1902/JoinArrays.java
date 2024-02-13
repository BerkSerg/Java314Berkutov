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
    }

    private static class SomeContainer<E> {
        E createContents(Class<E> clazz) throws InstantiationException, IllegalAccessException {
            return clazz.newInstance();
        }
    }

    private static <T> T[] joinArrays(T[] arrayOne, T[] arrayTwo) {
        T[] result = (T[]) Array.newInstance(arrayOne.getClass(), arrayOne.length + arrayTwo.length);
        for(int i = 0; i < result.length; i++){
            result[i] = (T) arrayOne[i];
            result[i + 1] = arrayTwo[i];
        }
        return result;
    }

    private static <T> void printResult(T[] result) {
        System.out.println("Массив: "+ Arrays.toString(result));
    }
}

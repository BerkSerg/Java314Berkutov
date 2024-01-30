package sorts.exp;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {-7, 600, 7, -4, 23, 590, 45, -4 -45, -4, 6, 0};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    private static void choosingSort(int[] array) {
        int[] tempArray = new int[array.length];
    }


    private static void bubbleSort(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++){
                if (array[j]>array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

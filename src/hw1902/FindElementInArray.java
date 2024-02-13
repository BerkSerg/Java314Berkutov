package hw1902;

public class FindElementInArray {

    public static void main(String[] args) {
        Integer[] arrayOne = {1, 2, 3, 4, 5};
        String[] arrayTwo = {"1", "2", "3", "4", "5"};

        printResult(joinArrays(arrayOne, 3));
        printResult(joinArrays(arrayOne, "1"));
        printResult(joinArrays(arrayTwo, "4"));
    }

    private static <T> int joinArrays(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private static void printResult(int result) {
        if (result < 0) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден по индексу: " + result);
        }

    }
}

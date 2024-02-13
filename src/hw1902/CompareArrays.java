package hw1902;

public class CompareArrays {
    public static void main(String[] args) {
        Integer[] arrayOne = {1, 2, 3, 4, 5};
        Integer[] arrayTwo = {1, 2, 3, 4, 5};
        String[] arrayThree = {"1", "2", "3", "4", "5"};
        Integer[] arrayFour = {0, 2, 3, 4, 5};

        printResult(compareArrays(arrayOne, arrayTwo));
        printResult(compareArrays(arrayOne, arrayThree));
        printResult(compareArrays(arrayTwo, arrayFour));
    }

    private static <T> boolean compareArrays(T[] arrayOne, T[] arrayTwo) {
        if (arrayOne.getClass().equals(arrayTwo.getClass())) {
            if (arrayOne.length == arrayTwo.length) {
                for (int i = 0; i < arrayOne.length; i++) {
                    if (!arrayOne[i].equals(arrayTwo[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void printResult(boolean result) {
        System.out.println("Массивы " + ((result) ? "равны" : "не равны"));
    }
}

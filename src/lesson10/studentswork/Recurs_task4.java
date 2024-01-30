package lesson10.studentswork;

//TODO Метод нахождения максимального значения в массиве
public class Recurs_task4 {
    public static void main(String[] args) {
        int[] testArr =  {0, 7, 7, 1, 17, 0, 5, 3, 4, 2, 1, 9, 11, 0};
        System.out.println(getMaxFromArray(testArr, testArr.length-1, Integer.MIN_VALUE));
    }

    private static int getMaxFromArray(int[] testArr, int index, int max) {
        if(index == 0) {
            return Math.max(max, testArr[index]);
        }
        max = Math.max(max, testArr[index]);
        return getMaxFromArray(testArr, --index,  max);
    }
}

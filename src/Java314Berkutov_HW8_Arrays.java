import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java314Berkutov_HW8_Arrays {
    public static void main(String[] args){
        //TODO Задача 1: Переворот массива:
        solution1();

        //TODO Задача 2: Поиск дубликатов в массиве:
        solution2();

        //TODO Задача 3: Поиск заданного элемента в массиве
        solution3();

        //TODO Задача 4: Найти наименьший элемент в одномерном массиве чисел
        solution4();

        //TODO Задача 5*: Найти сумму элементов двумерного массива
        solution5();

        //TODO Задача 6*: Вычислить среднее значение элементов в трехмерном массиве
        solution6();

        //TODO Задача 7*: Найти самую длинную строку в массиве строк
        solution7();

        //TODO Задача 8*: Удаление дубликатов из массива
        solution8(); // с сортировкой
        solution8_2(); // без сортировки

        //TODO Задача 9**: Ротация массива на заданное количество шагов
        solution9();

        //TODO Задача 10**: Поиск подмассива с наибольшей суммой
        solution10();
    }

    private static void solution1() {
        int[] array = {7, 6, 5, 4, 3, 2, 1, 0};
        int i = 0;
        int lastIndex = array.length-1;
        int tmpNum;
        while(i <= lastIndex){
            tmpNum = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = tmpNum;
            i++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void solution2() {
        int[] array = {7, 7, 1, 7, 0, 5, 3, 4, 2, 1, 1, 0};
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        boolean firstLoop = true;
        int currentNumber = 0;
        for(int x : sortedArray){
            int count = 0;
            int firstIndex = 0;
            String indexes = "";
            if(firstLoop || currentNumber != x){
                firstLoop = false;
                currentNumber = x;
                for(int i = 0; i < array.length; i++){
                    if(array[i] == currentNumber){
                        if(count++ == 0){
                            firstIndex = i;
                        }
                        if(count > 1){
                            indexes += "," + i;
                        }
                    }
                }
                if(count > 1){
                    System.out.println("Дубликат " + currentNumber+" по индексам: " + firstIndex + indexes);
                }

            }
        }
    }

    private static void solution3() {
        int[] array = {7, 7, 1, 7, 0, 5, 3, 4, 2, 1, 1, 0};
        String indexes = "";
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Введите число для поиска:");
            int number = scanner.nextInt();
            for(int i = 0; i < array.length; i++) {
                if(array[i] == number){
                    if(!indexes.equals("")) {
                        indexes += ",";
                    }
                    indexes += i;
                }
            }
            if(!indexes.equals("")) {
                System.out.printf("\nЧисло %d найдено по индексу(-ам): %s", number, indexes);
            } else {
                System.out.printf("\nЧисло %d не найдено", number);
            }

        }catch (InputMismatchException e ){
            System.out.println("Введено не число");
        }
    }

    private static void solution4() {
        int[] array = {10, 7, 0, 1, 7,  5, 3, 4, 2, 1, 1, -8};
        int minNumber = 0;
        for(int number : array){
            if(number < minNumber){
                minNumber = number;
            }
        }
        System.out.println("Наименьший элемент массива равен " + minNumber);

    }

    private static void solution5() {
        int[][] twoLevelArray= {{1,1,2,3}, {2,3,4,5,6,7,8}, {5,6}, {7,3,5,6}};
        int amount = 0;
        for(int[] array : twoLevelArray){
            for(int number : array){
                amount += number;
            }
        }
        System.out.println("Сумма элементов массива равна " + amount);
    }

    private static void solution6() {
        int[][][] threeLevelArray= {
                {
                    {1,2,3},
                    {6,8,9},
                    {3,40,5}
                },
                {
                    {7,6},
                    {3,4,6}
                },
                {{5},{7,8,100},{4,8,5,8,9,8}}
        };
        int amount = 0;
        int count = 0;
        for(int[][] arrayTwo : threeLevelArray){
            for(int[] arrayThree : arrayTwo){
                for(int number : arrayThree) {
                    count++;
                    amount += number;
                }
            }
        }
        System.out.println("Среднее арифметическое элементов массива равна " + amount / count);
    }

    private static void solution7() {
        String[] strArray = {
                "У вас есть одномерный массив целых чисел",
                "Предоставлен массив чисел",
                "Если есть",
                "У вас есть трехмерный массив чисел, представляющий собой набор матриц.",
                "Задача 7",
        };
        String longestString = "";
        for(String str : strArray) {
            if(str.length() > longestString.length()) {
                longestString = str;
            }
        }
        System.out.printf("Самая длинная строка в массиве: \"%s\"\n", longestString);

    }

    private static void solution8() {
        // метод с сортиовкой
        // сначала вычислим размер нового массива
        // затем заполним уникальными значениями из старого
        int[] sourceArray = {0, 7, 7, 1, 7, 0, 5, 3, 4, 2, 1, 9, 1, 0};
        int[] workArray = Arrays.copyOf(sourceArray, sourceArray.length);
        Arrays.sort(workArray);
        int uniqueElement = 0;
        int newArraySize = 0;
        for(int i = 0; i < workArray.length;  i++){
            if(newArraySize == 0 || workArray[i] != uniqueElement){
                newArraySize++;
                uniqueElement = workArray[i];
            }
        }
        int[] newArray = new int[newArraySize];
        int newArrayIndex = 0;
        uniqueElement = 0;
        boolean isFirstLoop = true;
        for(int i = 0; i < workArray.length;  i++) {
            if(isFirstLoop || workArray[i] != uniqueElement){
                isFirstLoop = false;
                uniqueElement = workArray[i];
                newArray[newArrayIndex++] = uniqueElement;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    private static void solution8_2() {
        // метод без сортиовки с добавлением и поиском в новом массиве
        int[] sourceArray = {0, 7, 7, 1, 7, 0, 5, 3, 4, 2, 1, 9, 1, 0};
        int[] workArray = new int[sourceArray.length];

        int uniqueElement = 0;
        int count = 0;
        boolean found;
        for(int i = 0; i < sourceArray.length;  i++){
            if(count == 0 || sourceArray[i] != uniqueElement){
                found = false;
                for(int j = 0; j < count; j++){
                    if(workArray[j] == sourceArray[i]){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    uniqueElement = workArray[i];
                    workArray[count] = sourceArray[i];
                    count++;
                }
            }
        }
        int[] newArray = Arrays.copyOf(workArray, count);
        System.out.println(Arrays.toString(newArray));
    }

    private static void solution9() {
        int[] sourceArray = {0, 7, 7, 1, 7, 0, 5, 3, 4, 2, 1, 9, 1, 0};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество шагов сдвига вправо: ");
            int steps = scanner.nextInt();
            int lastNumber;
            if(steps >= sourceArray.length){
                steps = steps % sourceArray.length;
            }
            for(int i = 0; i < steps; i++) {
                lastNumber = sourceArray[sourceArray.length-1];
                for(int j = sourceArray.length-2; j >= 0; j--){
                    sourceArray[j+1] = sourceArray[j];
                }
                sourceArray[0] = lastNumber;
            }
            System.out.println("\n" + Arrays.toString(sourceArray));

        } catch(InputMismatchException e) {
            System.out.println("\nВведено не число");
        }

    }

    private static void solution10() {
        //int[] array = {0, -7, 2, 1, 7, 0, -5, -3, 4, 2, -1, 9, -1, 0};
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSumm = Integer.MIN_VALUE;
        int currentSumm = 0;
        int startIndex=0;
        int  tryStart = 0;
        int endIndex = 0;
        for(int i = 0; i < array.length; i++){
            int x = array[i];
            currentSumm += x;
            if(currentSumm < x){
                tryStart = i;
                currentSumm = x;
            }
            if(currentSumm > maxSumm) {
                maxSumm = currentSumm;
                startIndex = tryStart;
                endIndex = i;
            }
        }
        System.out.printf("Подмассив по индексам с %d по %d имеет наибольшую сумму: %d", startIndex, endIndex, maxSumm);



    }
}

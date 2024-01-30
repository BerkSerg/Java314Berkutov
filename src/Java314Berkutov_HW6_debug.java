public class Java314Berkutov_HW6_debug {
    public static void main(String[] args){

        //TODO Задача 2: Нахождение ошибки в программе
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        /* тут и дебаггера не надо (ошибка выполнения в конце), выходим за границы размера массива
        * так как индексы массивов начинаются с 0, то последний элемент
        * имеет индекс numbers.length-1
        * решения два:
        * 1: "i < numbers.length"
        * 2: "i <= numbers.length-1", брр выглядит "вырви глаз", думаю решение всё же одно - первое :)
        */
        //for (int i = 0; i <= numbers.length; i++) {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма чисел: " + sum);


        //TODO Задача 3: Нахождение ошибки в методе
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + " != " + result);
    }

    /*
    * Полагаю, что проблема в условии if (n == 2), при котором мы упускаем одну
    * итерацию рекурсии, правильно будет if (n == 1)
     */
    public static int computeFactorial(int n) {
        return (n == 1) ? n : n * computeFactorial(n - 1);
        /*if (n == 2) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }*/
    }

}



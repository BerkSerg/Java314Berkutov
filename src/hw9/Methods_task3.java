package hw9;

//TODO Написать статический метод, позволяющий выяснить, является ли число простым
public class Methods_task3 {
    public static void main(String[] args) {
        int[] testNumbers= {3, 23, 77, 127, 339, 501, 503, 799};
        for(int num : testNumbers){
            if( isNumberSimple(num) ) {
                System.out.printf("Число %d простое\n", num);
            }
        }
    }

    private static boolean isNumberSimple(int number){
        for(int x = 2; x <= Math.sqrt(number); x++ ){
            if(number % x == 0){
                return false;
            }
        }
        return true;
    }
}

package hw9;

// TODO Написать и протестировать перегруженный статический метод, выводящий на экран...
public class Methods_task1 {

    public static void main(String[] args) {
        task1();
    }

    private static void task1(){
        int[] intArray = new int[]{1,2,3,4,5};
        int[][] twoLevelIntArray = new int[][]{{1,2,3}, {4,5}, {6,7,8,9,0}, {7,5,4},{2}};

        String[] strArray = new String[]{"q","w","e","r","t"};
        String[][] twoLevelStrArray = new String[][]{{"one","two","three","four"}, {"five","six"}, {"seven","eight","nine"}};

        printArray(intArray);
        printArray(twoLevelIntArray);

        printArray(strArray);
        printArray(twoLevelStrArray);
    }

    private static void printArray(int[] array) {
        System.out.println("Печать одномерного массива типа int\n-------------");
        for(int x : array){
            System.out.print(x);
        }
        System.out.println("\n-------------");
    }

    private static void printArray(int[][] array) {
        System.out.println("Печать двумерного массива типа int\n-------------");
        for(int[] element : array){
            for(int x : element) {
                System.out.print(x);
            }
            System.out.print("\n");
        }
        System.out.println("-------------");
    }

    private static void printArray(String[] array) {
        System.out.println("Печать одномерного массива типа String\n-------------");
        for(String s : array){
            System.out.print(s+' ');
        }
        System.out.println("\n-------------");
    }

    private static void printArray(String[][] array) {
        System.out.println("Печать двумерного массива типа String\n-------------");
        for(String[] element : array){
            for(String s : element) {
                System.out.print(s+' ');
            }
            System.out.print("\n");
        }
        System.out.println("-------------");
    }
}

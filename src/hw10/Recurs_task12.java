package hw10;

import java.util.Random;

//TODO Черепашка
// На квадратной доске размером NхN расставлены случайные целые положительные числа. Черепашка, находящаяся в
// левом верхнем углу, мечтает попасть в правый нижний. При этом, она может переползать только в клетку справа или в
// клетку снизу (не наискосок) и хочет, чтобысумма всех чисел, оказавшихся у нее на пути, была максимально возможной.
// Показать на экране консоли эту сумму. Показать путь следования черепашки. Показать исходный массив в виде таблицы
public class Recurs_task12 {
    final static int DESK_HEIGHT = 8;
    final static int DESK_WIDTH = 8;
    final static int[][] DESK = new int[DESK_WIDTH][DESK_HEIGHT];
    static final int[][] POSSIBLE_MOVES = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    static int collectedAmount = 0;

    static int[][] trackArray = new int[DESK_WIDTH][DESK_HEIGHT];


    public static void main(String[] args) {
        fillDesk();
        printDesk();
        findBestWay(0, 0);
        System.out.println(collectedAmount);
    }

    private static boolean findBestWay(int x, int y) {
        int max = 0;
        if(x == DESK_WIDTH - 1 && y == DESK_HEIGHT - 1){
            return false;
        }


        collectedAmount += DESK[x][y];
        trackArray[x][y] = 1;

        for (int[] move : POSSIBLE_MOVES) {
             int nextX = x + move[0];
             int nextY = y + move[1];
            if (isMovePossible(nextX, nextY) && findBestWay(nextX, nextY)) {

            }
        }
        return false;
    }

    private static boolean isMovePossible(int x, int y) {
        return x >= 0 && y >= 0 && x < DESK_WIDTH && y < DESK_HEIGHT && trackArray[x][y] == 0;
    }

    private static void fillDesk() {
        Random rnd = new Random();
        for (int x = 0; x < DESK_WIDTH; x++) {
            for (int y = 0; y < DESK_HEIGHT; y++) {
                DESK[y][x] = rnd.nextInt(0, 100);
            }
        }
    }

    private static void printDesk() {
        for (int x = 0; x < DESK_WIDTH; x++) {
            for (int y = 0; y < DESK_HEIGHT; y++) {
                System.out.printf((DESK[y][x] > 9) ? "%d |" : " %d |", DESK[y][x]);
            }
            System.out.println();
        }
    }


}

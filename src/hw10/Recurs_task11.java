package hw10;

public class Recurs_task11 {
    final static int DESK_HEIGHT = 8;
    final static int DESK_WIDTH = 8;
    static final int[][] POSSIBLE_MOVES = {{-1, -2}, {-2, -1}, {-2, 1}, {1, -2}, {-1, 2}, {2, -1}, {1, 2}, {2, 1}};
    final static int[][] DESK = new int[DESK_WIDTH][DESK_HEIGHT];
    final static int MAX_MOVES = DESK_HEIGHT * DESK_WIDTH - 1;


    public static void main(String[] args) {
        if (moveHorse(2, 0, 1)) {
            printDesk();
        } else {
            System.out.println("Нет решения");
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

    private static boolean moveHorse(int x, int y, int currentMove) {
        DESK[x][y] = currentMove;

        if (currentMove > MAX_MOVES) {
            return true;
        }

        for (int[] nextXY : POSSIBLE_MOVES) {
            int nextX = x + nextXY[0];
            int nextY = y + nextXY[1];
            if (isMovePossible(nextX, nextY) && moveHorse(nextX, nextY, currentMove + 1)) {
                return true;
            }
        }
        DESK[x][y] = 0;
        return false;
    }

    private static boolean isMovePossible(int x, int y) {
        return (x >= 0 && y >= 0 && x < DESK_WIDTH && y < DESK_HEIGHT && DESK[x][y] == 0);
    }
}

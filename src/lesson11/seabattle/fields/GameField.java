package lesson11.seabattle.fields;

public class GameField {
    private char[][] gameField;

    public GameField(int size) {
        this.gameField = new char[size][size];
    }

    public void fillGameField(){
        for(int x = 0; x < gameField.length; x++){
            for(int y = 0; y < gameField.length; y++){
                gameField[y][x] = '~';
            }
        }
    }

    public void setCell(int x, int y, char newVal){

    }
}

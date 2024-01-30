package lesson11.seabattle.players;

import lesson11.seabattle.fields.GameField;
import lesson11.seabattle.fields.Ship;

public abstract class Player {
    GameField myField;
    GameField opField;
    Ship[] shipsList;
    boolean isAlive;

    public Player(GameField myField) {
        this.myField = myField;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setOpField(GameField opField) {
        this.opField = opField;
    }

    public abstract String shoot();

    public abstract boolean getShoot();

    public abstract void autoSetShips();

}

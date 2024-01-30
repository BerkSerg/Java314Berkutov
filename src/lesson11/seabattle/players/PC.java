package lesson11.seabattle.players;

import lesson11.seabattle.fields.GameField;

public class PC extends Player{
    String name;
    Player player;

    public PC(String name, GameField myField) {
        super(myField);
        this.name = name;
    }


    @Override
    public String shoot() {
        return null;
    }

    @Override
    public boolean getShoot() {
        return false;
    }

    @Override
    public void autoSetShips() {

    }
}

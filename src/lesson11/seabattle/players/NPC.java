package lesson11.seabattle.players;

import lesson11.seabattle.fields.GameField;

public class NPC extends Player{
    Player player;

    public NPC(GameField myField) {
        super(myField);
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

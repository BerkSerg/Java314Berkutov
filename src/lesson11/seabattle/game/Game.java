package lesson11.seabattle.game;

import lesson11.seabattle.fields.GameField;
import lesson11.seabattle.players.NPC;
import lesson11.seabattle.players.PC;
import lesson11.seabattle.players.Player;

import java.util.Scanner;

public class Game {
    PC pc;
    NPC npc;

    public Game() {
        setPc();
    }

    private void setPc() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = sc.nextLine();
        pc = new PC(name, new GameField(10));
    }

    private void setNpc() {
        npc = new NPC(new GameField(10));
    }

    public String game(){
        //цикл игры
        while(pc.isAlive() && npc.isAlive()){
            round();
        }
        return "winner is";
    }

    private void round() {
        //цикл игрока
        doMove(pc);
        doMove(npc);

    }

    private void doMove(Player pl) {
        while(true){

        }

    }

}

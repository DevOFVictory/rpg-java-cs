package de.devofvictory.informatik.rpg;

import de.devofvictory.informatik.rpg.gamefield.GamePlan;
import de.devofvictory.informatik.rpg.gameobjects.Player;

public class RPGGame {

    private GamePlan gameField;

    public void start() {

        System.out.println("Game has stated.");
        Player p = new Player("Bob");
        System.out.println(p.getHp());
        p.damage(10);
        System.out.println(p.getHp());

    }

    public void setGameField(GamePlan gamePlan) {
        this.gameField = gamePlan;
    }
}

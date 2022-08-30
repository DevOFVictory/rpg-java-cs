package de.devofvictory.informatik.rpg;

import de.devofvictory.informatik.rpg.gamefield.GamePlan;

public class RPGGame {

    private GamePlan gameField;

    public void start() {

        System.out.println("Game has stated.");

    }

    public void setGameField(GamePlan gamePlan) {
        this.gameField = gamePlan;
    }
}

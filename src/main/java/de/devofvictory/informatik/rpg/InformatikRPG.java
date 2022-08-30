package de.devofvictory.informatik.rpg;

import de.devofvictory.informatik.rpg.gamefield.GamePlan;

public class InformatikRPG {

    public static void main(String[] args) {

        RPGGame game = new RPGGame();
        GamePlan gamePlan = new GamePlan(30);
        game.setGameField(gamePlan);

        game.start();

    }

}

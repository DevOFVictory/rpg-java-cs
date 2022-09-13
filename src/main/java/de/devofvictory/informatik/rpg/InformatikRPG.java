package de.devofvictory.informatik.rpg;

import de.devofvictory.informatik.rpg.gamefield.GamePlan;
import lombok.Getter;

public class InformatikRPG {

    @Getter
    private static RPGGame game;

    public static void main(String[] args) {

        game = new RPGGame();

        GamePlan plan = new GamePlan(30);
        game.setGameField(plan);

        game.start();

    }

}

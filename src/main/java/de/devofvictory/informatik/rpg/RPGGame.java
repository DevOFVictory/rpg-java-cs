package de.devofvictory.informatik.rpg;

import de.devofvictory.informatik.rpg.gamefield.GamePlan;
import de.devofvictory.informatik.rpg.gameobjects.Player;
import lombok.Getter;

public class RPGGame {
    @Getter
    private GamePlan gamePlan;

    public void start() {

        System.out.println("Game has stated.");
        Player p = new Player("Bob");
        System.out.println(p.getHp());
        p.damage(10);
        System.out.println(p.getHp());

        p.move(4);
        System.out.println(p.getField().getFieldNumber());


        // Test

    }

    public void setGameField(GamePlan gamePlan) {
        this.gamePlan = gamePlan;
    }
}

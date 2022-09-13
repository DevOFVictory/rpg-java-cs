package de.devofvictory.informatik.rpg.gamefield;

import de.devofvictory.informatik.rpg.gameobjects.Player;
import lombok.Data;

@Data
public class GameField {

    private Player player;
    private GamePlan gamePlan;

    public GameField(GamePlan gamePlan) {
        this.gamePlan = gamePlan;
    }

    public int getFieldNumber() {
        return gamePlan.getGameFields().keySet().stream().findFirst().get();
    }


}

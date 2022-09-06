package de.devofvictory.informatik.rpg.gamefield;

import de.devofvictory.informatik.rpg.gameobjects.Player;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GamePlan {

    @Getter
    private final Map<Integer, GameField> gameFields;

    public GamePlan(int amount) {

        this.gameFields = new HashMap<>();

        for (int i = 0; i < amount; i++) {
            GameField gameField = new GameField(this);
            gameFields.put(i, gameField);
        }

        System.out.println("GamePlan has been created.");
    }

    public GameField findPlayer(Player player) {
        for (GameField gameField : gameFields.values()) {
            if (gameField.getPlayer().equals(player)) {
                return gameField;
            }
        }
        return null;
    }

    public void movePlayer(Player player, int fieldId) {
        GameField field = gameFields.get(fieldId);
        GameField oldField = findPlayer(player);

        if (oldField != null)
            oldField.setPlayer(null);

        field.setPlayer(player);
    }

}

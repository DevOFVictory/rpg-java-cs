package de.devofvictory.informatik.rpg.gamefield;

import lombok.Getter;

import java.util.List;

public class GamePlan {

    @Getter
    private List<GameField> gameFields;

    public GamePlan(int amount) {

        for (int i = 0; i < amount; i++) {
            GameField gameField = new GameField();
            gameFields.add(gameField);
        }

        System.out.println("GamePlan has been created.");

    }


}

package de.devofvictory.informatik.rpg;

import lombok.Data;

import java.util.UUID;

@Data
public class GameObject {
    private String name;
    private UUID id;
    private RPGGame game;

    public GameObject() {
        this.game = InformatikRPG.getGame();
    }

}

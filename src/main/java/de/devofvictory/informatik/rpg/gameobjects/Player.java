package de.devofvictory.informatik.rpg.gameobjects;

import de.devofvictory.informatik.rpg.RPGGame;
import de.devofvictory.informatik.rpg.gamefield.GameField;
import de.devofvictory.informatik.rpg.roles.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Player extends LivingEntity {
    private int talent;
    private int hp;
    private int gold;

    private PlayerInventory inventory;
    private Role role;


    public Player(String name) {
        super();
        this.setName(name);
    }


    public void damage(int amount){
        hp -= amount;
    }

    public void move(int amount) {
        getGame().getGamePlan().movePlayer(this, getGame().getGamePlan().findPlayer(this).getFieldNumber()+amount);
    }

    public GameField getField() {
        return getGame().getGamePlan().findPlayer(this);
    }
}

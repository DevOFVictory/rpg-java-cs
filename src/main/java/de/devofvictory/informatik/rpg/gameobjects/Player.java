package de.devofvictory.informatik.rpg.gameobjects;

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
        this.setName(name);
    }


    public void damage(int amount){
        hp -= amount;
    }

    public void move(int amount) {

    }
}

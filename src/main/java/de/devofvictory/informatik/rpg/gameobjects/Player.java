package de.devofvictory.informatik.rpg.gameobjects;

import de.devofvictory.informatik.rpg.roles.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Player extends LivingEntity {
    private int talent;
    private int hp;

    private PlayerInventory inventory;
    private Role role;
}

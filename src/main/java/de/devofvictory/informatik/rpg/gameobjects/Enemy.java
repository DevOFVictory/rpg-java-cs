package de.devofvictory.informatik.rpg.gameobjects;

import lombok.Data;
import de.devofvictory.informatik.rpg.roles.EnemyCategory;

import java.util.List;

@Data
public class Enemy extends LivingEntity {

    private EnemyCategory enemyCategory;
    private int strength;
    private int goldDrop;

    private List<Item> itemDrops;

}

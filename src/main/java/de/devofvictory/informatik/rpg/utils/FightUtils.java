package de.devofvictory.informatik.rpg.utils;

import de.devofvictory.informatik.rpg.gameobjects.Enemy;
import de.devofvictory.informatik.rpg.gameobjects.Item;
import de.devofvictory.informatik.rpg.gameobjects.LivingEntity;
import de.devofvictory.informatik.rpg.gameobjects.Player;

import java.util.List;

public class FightUtils {

    public static LivingEntity fight(LivingEntity a, LivingEntity b) {
        if (getEntityStrength(a) > getEntityStrength(b)) {
            return a;
        } else if(getEntityStrength(a) < getEntityStrength(b)) {
            return b;
        } else {
            return null;
        }
    }

    public static int getEntityStrength(LivingEntity entity) {

        if (entity instanceof Player player) {

            int strength = 0;
            strength += player.getRole().getStrength();
            strength += player.getInventory().items.stream().mapToInt(Item::getGeneralStrength).sum();

            return strength;
        }else {
            Enemy enemy = (Enemy) entity;
            return enemy.getStrength();
        }

    }

}

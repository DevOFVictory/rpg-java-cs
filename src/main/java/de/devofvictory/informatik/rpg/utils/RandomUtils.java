package de.devofvictory.informatik.rpg.utils;

import java.util.Random;

public class RandomUtils {

    public static int rollDice() {
        Random r = new Random();
        return r.nextInt(6)+1;
    }

}

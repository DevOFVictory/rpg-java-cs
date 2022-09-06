package de.devofvictory.informatik.rpg.roles;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {

    THIEF("Dieb", 100, 10),
    MAGE("Magier", 100, 10),
    FETTI("Irgendwas tankiges", 400, 5),
    ARCHER("Bogenschütze",1000,10),
    WARRIOR("Krieger",200,20);

    @Getter
    private final String name;
    @Getter
    private final int hp, strength;

}

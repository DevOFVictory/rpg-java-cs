package de.devofvictory.informatik.rpg.roles;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {

    THIEF("Dieb", 100, 10), MAGIER("Magier", 100, 10), FETTI("Irgendwas tankiges", 1000, 100);

    @Getter
    private final String name;
    @Getter
    private final int hp, strength;

}

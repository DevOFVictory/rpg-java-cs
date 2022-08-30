package de.devofvictory.informatik.rpg.roles;

public enum EnemyCategory {

    FIRE("Feuermonster"),
    WATER("Wassermonster"),
    AIR("Monster der Lüfte"),
    ELECTRICITY("Schockierendes Monster");

    private final String name;

    EnemyCategory(String name) {
        this.name = name;
    }
}

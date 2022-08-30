package de.devofvictory.informatik.rpg.gameobjects;

import lombok.Getter;
import lombok.Setter;
import de.devofvictory.informatik.rpg.GameObject;

import java.util.List;


public class PlayerInventory extends GameObject {

    @Getter @Setter
    private Item rightHand, leftHand, head, body, boots;

    public List<Item> items = List.of(rightHand, leftHand, head, body, boots);

}

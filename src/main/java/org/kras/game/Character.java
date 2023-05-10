package org.kras.game;

public class Character {
    void pickUpWeapon() {

    }

    public void defenseAction() {

    }

    public void moveToSafety() {

    }

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

}

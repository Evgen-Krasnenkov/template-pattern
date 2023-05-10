package org.kras.game;

public class Troll extends Character{

  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  public void defenseAction() {
    System.out.println("Defend with club");
  }

  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }

  public void defendAgainstAttack() {
    pickUpWeapon();
    defenseAction();
    moveToSafety();
    System.out.println();
  }

}

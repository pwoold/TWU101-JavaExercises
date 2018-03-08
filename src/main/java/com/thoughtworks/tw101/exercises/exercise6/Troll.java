package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    private int hitpoints;

    public Troll() {
        hitpoints = 40;
    }

    public void takeDamage(int amount) {
        hitpoints-=(int)(amount/2.0);
    }

    public void reportStatus() {
        System.out.println("Troll's current HP: " + hitpoints);
    }
}

package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.Destroyable;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;
    private int health;

    public Barrel(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void hit(int damage) {
        health = health - damage > 0 ? health - damage : 0;
    }

    @Override
    public boolean isDestroyed() {
        return health <= 0;
    }

    @Override
    public String getMessage() {
        return "I see a barrel, I'm going to explode it! Over.";
    }
}
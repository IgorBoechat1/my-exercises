package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.Destroyable;

/**
 * A Soldier enemy without any special behaviour
 */
public class SoldierEnemy extends Enemy {

    /**
     * @see Enemy#Enemy(int)
     */
    public SoldierEnemy(int health) {
        super(health);
    }

    @Override
    public boolean isDestroyed() {
        return true;
    }
}

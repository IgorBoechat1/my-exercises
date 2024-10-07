package io.codeforall.bootcamp.gameobject;

public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;

    private int maxDamage =  1;

    public int getMaxDamage() {
        return maxDamage;
    }
}

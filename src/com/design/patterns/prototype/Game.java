package com.design.patterns.prototype;

public abstract class Game implements Cloneable{

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playGame();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

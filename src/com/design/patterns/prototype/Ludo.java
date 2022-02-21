package com.design.patterns.prototype;

public class Ludo extends Game{
    @Override
    public void playGame() {
        System.out.println("Play Ludo");
    }

    @Override
    public String toString() {
        return "Ludo{" +
                "name='" + name + '\'' +
                '}';
    }
}

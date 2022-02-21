package com.design.patterns.prototype;

public class Pubg  extends Game{
    @Override
    public void playGame() {
        System.out.println("Play Pubg");
    }

    @Override
    public String toString() {
        return "Pubg{" +
                "name='" + name + '\'' +
                '}';
    }
}

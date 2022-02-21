package com.design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {

    private Map<GameType,Game> games=new HashMap<>();

    public GameRegistry() {
        this.initialize();
    }

    private void initialize() {
        Ludo ludo=new Ludo();
        ludo.setName("ludo");

        Pubg pubg=new Pubg();
        pubg.setName("pubg");

        games.put(GameType.LUDO,ludo);
        games.put(GameType.PUBG,pubg);
    }

    public Game getGame(GameType gameType) throws CloneNotSupportedException {
        return (Game) games.get(gameType).clone();
    }
}

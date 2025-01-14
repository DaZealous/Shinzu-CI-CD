package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole game;

    public GameRunner(@Qualifier("SuperContraGame") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game + "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

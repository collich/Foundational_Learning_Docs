package com.second.learn_another.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GameConsole game;

    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

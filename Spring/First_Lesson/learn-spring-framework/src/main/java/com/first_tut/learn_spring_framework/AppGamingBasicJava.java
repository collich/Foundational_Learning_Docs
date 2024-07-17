package com.first_tut.learn_spring_framework;

import com.first_tut.learn_spring_framework.game.GameRunner;
import com.first_tut.learn_spring_framework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}

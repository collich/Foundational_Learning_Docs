package com.first_tut.learn_spring_framework.game;

public class GameRunner {
    private MarioGame game;

    public GameRunner(MarioGame game){
        this.game = game;
    }

    public void run() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        System.out.printf("Running game: %v", this.game);
    }
}

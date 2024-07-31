package com.first_tut.learn_spring_framework.game;

public class MarioGame implements GameConsole{

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Squat");
    }

    @Override
    public void left() {
        System.out.println("Go Back");
    }

    @Override
    public void right() {
        System.out.println("Go Forward");
    }

    @Override
    public void AButton() {
        System.out.println("Pick up Item");
    }

}

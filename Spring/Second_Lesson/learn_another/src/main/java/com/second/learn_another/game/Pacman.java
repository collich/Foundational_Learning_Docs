package com.second.learn_another.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacmanQualifier")
public class Pacman implements GameConsole{

    @Override
    public void up() {
        System.out.println("Up");
    }

    @Override
    public void down() {
        System.out.println("Down");
    }

    @Override
    public void left() {
        System.out.println("Left");
    }

    @Override
    public void right() {
        System.out.println("Right");
    }

    @Override
    public void AButton() {
        System.out.println("Use Pickup Item A");
    }
    
}

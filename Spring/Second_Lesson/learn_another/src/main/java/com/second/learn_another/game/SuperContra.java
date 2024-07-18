package com.second.learn_another.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class SuperContra implements GameConsole{

    @Override
    public void up() {
        System.out.println("Jump");
    }
    
    @Override
    public void down() {
        System.out.println("Down");
    }
    
    @Override
    public void left() {
        System.out.println("Go Back");
    }
    
    @Override
    public void right() {
        System.out.println("Forward");
    }

    @Override
    public void AButton() {
        System.out.println("Shoot Bullets");
    }
    
}

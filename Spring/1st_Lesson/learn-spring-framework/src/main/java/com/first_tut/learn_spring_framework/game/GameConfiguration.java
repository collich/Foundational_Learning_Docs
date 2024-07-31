package com.first_tut.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    @Bean
    public GameConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game){
        return new GameRunner(game);
    }
}

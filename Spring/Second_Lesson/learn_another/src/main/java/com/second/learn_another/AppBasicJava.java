package com.second.learn_another;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.second.learn_another.game.GameRunner;

@Configuration
@ComponentScan("com.second.learn_another.game")
public class AppBasicJava {
    // @Bean
    // public GameConsole game(){
    //     return new MarioGame();
    // }

    // @Bean
    // public GameRunner gameRunner(GameConsole game){
    //     return new GameRunner(game);
    // }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppBasicJava.class);
        context.getBean(GameRunner.class).run();
        context.close();
    }
}

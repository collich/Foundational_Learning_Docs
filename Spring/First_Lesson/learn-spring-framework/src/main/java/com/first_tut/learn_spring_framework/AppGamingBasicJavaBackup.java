package com.first_tut.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.first_tut.learn_spring_framework.game.GameConfiguration;
import com.first_tut.learn_spring_framework.game.GameRunner;

public class AppGamingBasicJavaBackup {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var gameRunner = new GameRunner(game);
        // gameRunner.run();
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class);) {
            context.getBean(GameRunner.class).run();
            context.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

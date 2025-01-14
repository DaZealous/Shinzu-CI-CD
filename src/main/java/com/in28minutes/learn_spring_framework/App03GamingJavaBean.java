package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConfiguration;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingJavaBean {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
//            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
//        System.out.println("helloooooooooo");
////        var game = new MarioGame();
//        var game = new PacManGame();
////        var game = new SuperContraGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}

package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class App01GamingBasicJava {
    public static void main(String[] args){
        System.out.println("helloooooooooo");
//        var game = new MarioGame();
        var game = new PacManGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}

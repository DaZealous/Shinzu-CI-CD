package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class GamingConfiguration {

//    @Bean
//    public GamingConsole game(){
//        return new PacManGame();
//    }

//    @Bean
//    public  GameRunner gameRunner(GamingConsole game){
//        return new GameRunner(game);
//    }
}

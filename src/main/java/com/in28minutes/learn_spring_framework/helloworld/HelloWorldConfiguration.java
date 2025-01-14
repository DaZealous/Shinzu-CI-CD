package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "How far";
    }

    @Bean(name = "person")
    public Person person1(){
        return new Person("ade", 10);
    }
}

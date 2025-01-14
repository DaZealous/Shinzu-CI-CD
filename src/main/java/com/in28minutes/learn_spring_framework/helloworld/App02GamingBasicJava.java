package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootConfiguration
public class App02GamingBasicJava {
    public static void main(String[] args){
//        1. launch a spring context
//        2. configure the things that we want our spring to manage - Configuration

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            var name = context.getBean("name");
            var person = context.getBean("person");
//        var person = context.getBean(Person.class);

            System.out.println(name);
            System.out.println(person);

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}

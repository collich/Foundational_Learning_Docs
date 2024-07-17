package com.first_tut.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Test Name";
    }

    @Bean
    public int age(){
        return 420;
    }
}

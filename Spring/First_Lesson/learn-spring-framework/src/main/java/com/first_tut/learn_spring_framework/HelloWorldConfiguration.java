package com.first_tut.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Test Name";
    }
    
    @Bean(name = "age")
    public int age(){
        return 420;
    }

    @Bean
    public Person person(String personName, int personAge){
        return new Person(personName, personAge);
    }
}

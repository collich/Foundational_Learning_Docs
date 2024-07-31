package com.first_tut.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        var helloWorldContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // System.out.println(helloWorldContext.getBean("name"));
        // System.out.println(helloWorldContext.getBean("age"));
        System.out.println(helloWorldContext.getBean(Person.class, "Alex", 49));
        helloWorldContext.close();
    }
}

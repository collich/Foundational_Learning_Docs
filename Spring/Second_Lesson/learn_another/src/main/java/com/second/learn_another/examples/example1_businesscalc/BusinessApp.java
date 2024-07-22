package com.second.learn_another.examples.example1_businesscalc;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.second.learn_another.examples.example1_businesscalc.dataservice.BusinessCalculationService;

@Configuration
@ComponentScan
public class BusinessApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessApp.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

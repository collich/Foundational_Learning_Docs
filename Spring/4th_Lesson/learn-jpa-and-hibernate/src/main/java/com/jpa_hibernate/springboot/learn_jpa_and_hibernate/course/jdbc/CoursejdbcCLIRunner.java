package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;

@Component
class CoursejdbcCLIRunner implements CommandLineRunner{

    @Autowired
    private CoursejdbcRepository repos;

    @Override
    public void run(String... args){
        repos.insert(new Course(1, "Discrete Math", "Karin"));
        repos.insert(new Course(2, "C Programming", "Nicholas"));
        repos.insert(new Course(3, "Cloud", "Li Xiao Rong"));
        System.out.println(repos.findId(1));
        System.out.println(repos.findId(2));
        System.out.println(repos.findId(3));
    }
}
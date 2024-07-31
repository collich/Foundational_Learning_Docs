package com.jpa_hibernate.springboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.jpa_hibernate.springboot.course.Course;

@Component
class CoursejdbcCLIRunner implements CommandLineRunner{

    @Autowired
    private CoursejdbcRepository repos;

    @Override
    public void run(String... args){
        // repos.insert(new Course(1, "Discrete Math", "Karin"));
    }
}
package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseSDJpaRunner implements CommandLineRunner{
    
    @Autowired
    private CourseSDJpaRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(1, "Discrete Math", "Nirak"));
        repo.save(new Course(2, "C Programming", "Salohcin"));
        repo.save(new Course(3, "Cloud", "Gnor Oaix Il"));

        // repo.deleteById(1l);
        System.out.println(repo.findById(1l));
        System.out.println(repo.findById(2l));
        System.out.println(repo.findById(3l));
    }
}

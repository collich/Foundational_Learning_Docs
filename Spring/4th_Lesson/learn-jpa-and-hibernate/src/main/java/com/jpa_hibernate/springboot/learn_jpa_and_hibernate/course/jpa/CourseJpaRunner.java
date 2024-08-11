// package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.jpa;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;

// @Component
// public class CourseJpaRunner implements CommandLineRunner{

//     @Autowired
//     private CourseJpaRepository repo;

//     @Override
//     public void run(String... args) throws Exception {
//         repo.insert(new Course(1, "Discrete Math", "Nirak"));
//         repo.insert(new Course(2, "C Programming", "Salohcin"));
//         repo.insert(new Course(3, "Cloud", "Gnor Oaix Il"));
//         System.out.println(repo.findById(1));
//         System.out.println(repo.findById(2));
//         System.out.println(repo.findById(3));
//         System.out.println(repo.findAll());
//     }
// }

package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;
import java.util.List;


public interface CourseSDJpaRepository extends JpaRepository<Course, Long>{
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}

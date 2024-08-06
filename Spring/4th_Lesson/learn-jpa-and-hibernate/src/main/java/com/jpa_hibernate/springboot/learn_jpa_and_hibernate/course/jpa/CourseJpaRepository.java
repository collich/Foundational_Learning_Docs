package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;

@Repository
public class CourseJpaRepository {
    private EntityManager entityManager;

    public void insertEntity(Course course){
        entityManager.merge(course);
    }
}

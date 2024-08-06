package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public void deleteByID(long id){
        Course course = findById(id);
        entityManager.remove(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }
}

package com.jpa_hibernate.springboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jpa_hibernate.springboot.course.Course;

@Repository
public class CoursejdbcRepository {
    
    @Autowired
    private JdbcTemplate repo;

    private static String INSERT_QUERY = "INSERT INTO course (id, name, author) VALUES (?, ?, ?);";
    private static String DELETE_QUERY = "DELETE FROM course WHERE id=?";

    public void insert(Course course){
        repo.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id){
        repo.update(DELETE_QUERY, id);
    }
}

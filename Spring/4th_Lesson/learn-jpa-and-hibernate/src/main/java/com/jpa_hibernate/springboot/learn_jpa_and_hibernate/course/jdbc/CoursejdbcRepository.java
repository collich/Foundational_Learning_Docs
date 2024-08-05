package com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jpa_hibernate.springboot.learn_jpa_and_hibernate.course.Course;


@Repository
public class CoursejdbcRepository {
    
    @Autowired
    private JdbcTemplate repo;

    private static String INSERT_QUERY = "INSERT INTO course (id, name, author) VALUES (?, ?, ?);";
    private static String DELETE_QUERY = "DELETE FROM course WHERE id=?";
    private static String SELECT_QUERY = "SELECT * FROM course WHERE id=?";

    public void insert(Course course){
        repo.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id){
        repo.update(DELETE_QUERY, id);
    }

    public Course findId(long id){
        return repo.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}

package com.learn.spring_boot;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("courses")
public class CourseController {

    // @GetMapping("path")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }

    @GetMapping
    public List<Course> getMethodName() {
        return Arrays.asList(
            new Course(1, "Statistics and C Programming", "Nicholas"),
            new Course(2, "Discrete Math and Ethics", "Karin"),
            new Course(3, "ICT Fundamentals and Python Programming", "Malcomm"),
            new Course(4, "Digital Logic and Computer Systems", "Forest")
        );
    }
}

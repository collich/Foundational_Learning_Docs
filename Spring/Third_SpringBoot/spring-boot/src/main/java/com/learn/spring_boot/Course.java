package com.learn.spring_boot;

public class Course {
    private long id;
    private String subject;
    private String instructor;

    public Course(long id, String subject, String instructor){
        this.id = id;
        this.subject = subject;
        this.instructor = instructor;
    }

    // Getter
    public long getId() {
        return id;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getSubject() {
        return subject;
    }

    // Setter
    public void setId(long id) {
        this.id = id;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        String newStr = str.append(String.format("Course [id = '%d', subject/(s) = '%s', instructor = '%s']", getId(), getSubject(), getInstructor())).toString();
        return newStr;
    }

}

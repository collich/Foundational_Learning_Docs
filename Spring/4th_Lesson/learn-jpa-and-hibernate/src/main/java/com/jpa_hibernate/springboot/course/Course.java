package com.jpa_hibernate.springboot.course;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Getter

    public String getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other

    public String toString(){
        return String.format("");
    }
}

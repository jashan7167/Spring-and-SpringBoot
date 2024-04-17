package com.startedspringwmk.learnspringboot;

public class Course {
    private long id;
    private String name;
    private String author;


    //Getters
    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
    //Constructors
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

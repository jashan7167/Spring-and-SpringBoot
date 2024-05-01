package com.learnspringboot.section6.learnjpaandhibernate;

import com.learnspringboot.section6.learnjpaandhibernate.course.jdbc.Course.Course;
import com.learnspringboot.section6.learnjpaandhibernate.jdbc.CourseJdbcRepository;
import com.learnspringboot.section6.learnjpaandhibernate.jpa.CourseJpaRepostiory;
import com.learnspringboot.section6.learnjpaandhibernate.springJPA.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepostiory repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn aws","In28minutes"));
//        repository.insert(new Course(2,"Learn devops","In28minutes"));
//        repository.insert(new Course(3,"Learn azure now","In28minutes"));
//        repository.insert(new Course(4,"Learn rust programming","In28minutes"));
//        repository.delete(3);
//        System.out.println(repository.selectById(2));

        //for Spring Data JPA

        //CRUD Operation
        repository.save(new Course(1,"Learn aws","In28minutes"));
        repository.save(new Course(2,"Learn devops","In28minutes"));
        repository.save(new Course(3,"Learn azure now","In28minutes"));
        repository.save(new Course(4,"Learn rust programming","In28minutes"));
        //delete
        repository.deleteById(3l);

        //find operation
        System.out.println(repository.findById(2l));

        //find all the courses
        System.out.println(repository.findAll());

        //count
        System.out.println(repository.count());

        //custom-method find my author
        System.out.println(repository.findByAuthor("in28minutes"));

        //custom-method find my name
        System.out.println(repository.findByName("Learn aws"));
    }
}

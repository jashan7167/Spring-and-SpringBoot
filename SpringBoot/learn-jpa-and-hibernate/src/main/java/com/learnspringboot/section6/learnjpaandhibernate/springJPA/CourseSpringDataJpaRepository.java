package com.learnspringboot.section6.learnjpaandhibernate.springJPA;

import com.learnspringboot.section6.learnjpaandhibernate.course.jdbc.Course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//We can also add our custom methods to Spring Data Jpa
public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);


}

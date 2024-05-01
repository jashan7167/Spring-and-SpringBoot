package com.learnspringboot.section6.learnjpaandhibernate.jpa;

import com.learnspringboot.section6.learnjpaandhibernate.course.jdbc.Course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepostiory {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }
    public Course selectById(long id) {
        return entityManager.find(Course.class,id);
    }
    public void delete(long id) {
        Course courseToDelete = entityManager.find(Course.class,id);
        entityManager.remove(courseToDelete);
    }
}

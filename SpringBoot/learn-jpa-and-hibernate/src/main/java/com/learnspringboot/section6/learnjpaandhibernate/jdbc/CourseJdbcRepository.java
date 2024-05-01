package com.learnspringboot.section6.learnjpaandhibernate.jdbc;

import com.learnspringboot.section6.learnjpaandhibernate.course.jdbc.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate  springJdbcTemplate;
    private static String INSERT_QUERY =
            """
               insert into course(id,name,author)
               values(?,?,?);
            """;
    private static String DELETE_QUERY =
            """
            delete from course where id = ?;
                    """;
    private static String SELECT_QUERY =
            """
                    select * from course where id = ?;        
                    """;
    public void insert(Course course)
    {
        //issue a single sql insert,update,de;ete operation
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(),course.getName(),course.getAuthor());

    }
    public void delete(int id)
    {
        springJdbcTemplate.update(DELETE_QUERY,id);
    }
    public Course selectById(int id)
    {
       return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
        //Result set -> Bean => RowMappers
        // id
    }
}

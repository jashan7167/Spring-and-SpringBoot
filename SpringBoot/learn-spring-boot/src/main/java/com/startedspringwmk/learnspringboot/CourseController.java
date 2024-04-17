package com.startedspringwmk.learnspringboot;
// courses

//Course id . name , author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/courses")
public class CourseController {
    //courses


    //map a url using @RequestMapping("courses")
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()
    {
        return Arrays.asList(
                new Course(1,"Learn Spring Boot","Ranga The Legend"),
        new Course(2,"Learn DevOps","Ranga The Legend")
        );

    }

}

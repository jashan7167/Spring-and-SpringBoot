package com.startedspringwmk.learnspringboot;
// courses

//Course id . name , author

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/courses")
public class CurrencyController {
    //courses
    //map a url using @RequestMapping("courses")
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses()
    {
        return  configuration;
    }

}

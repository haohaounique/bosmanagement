package com.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :haohaounique
 * @Detaildescription :
 * @date : 2019/10/14
 */
@RestController
public class CourseController  {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/course/{courseid}")
    public Course getCourse(@PathVariable("courseid") Integer courseid){
        return new Course("课程名:"+port+"   参数："+courseid, 500.00D);
    }
}

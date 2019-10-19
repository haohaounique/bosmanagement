package com.course.service;


import com.course.Course.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :haohaounique
 * @Detaildescription :
 * @date : 2019/10/15
 */
@FeignClient("HAO-COURSE-SERVICE")
public interface ICourseService {
    @RequestMapping("/course/{courseid}")
    public Course getCourse(@PathVariable("courseid") Integer courseid);
}

package com.hao;

import com.course.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author :haohaounique
 * @Detaildescription :
 * @date : 2019/10/14
 */
@RestController
public class UserController {
    //  private  static RestTemplate restTemplate =  new RestTemplate();
    @Autowired
    private RestTemplate restTemplate; //restTemplate方式    发送http请求 远程调用

    @Autowired
   private ICourseService courseService; //Feign的方式 发送http请求 远程调用

    @RequestMapping("/user/mycourse")
    public Course getCourse() {
        System.out.println("9002 请求");
        Course course = courseService.getCourse(123);
//        return restTemplate.getForObject("http://localhost:9001/course/12", Course.class);
//        return restTemplate.getForObject("http://hao-course-service/course/12", Course.class);
        return course;
    }
}

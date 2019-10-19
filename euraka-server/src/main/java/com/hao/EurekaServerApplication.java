package com.hao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :haohaounique
 * @Detaildescription :  服务放  courseservice   调用方 userservice
 *  方式1：restTemplate  http请求
 *  方式2： Feign    http请求
 * @date : 2019/10/14
 */
@SpringBootApplication
@EnableEurekaServer //开启EurekaServer服务
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}

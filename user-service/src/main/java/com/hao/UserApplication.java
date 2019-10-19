package com.hao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author :haohaounique
 * @Detaildescription : springcloud 的使用
 * @date : 2019/10/14
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端   注册服务信息
@EnableFeignClients //开启Feign客户端
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    /**
     * ribbon的工作流程
     * 1.ribbon拦截所有的http请求，获取应用名称  LoadBalancerAutoConfiguration（LoadBalancerInterceptor  intercept  loadBalancer.execute  RibbonLoadBalancerClient（execute  execute（getLoadBalancer getServer）） ）
     * 2.根据应用名从Eureka服务端获取服务列表
     * 3.从列表中选取其中一个服务，选取规则涉及负载均衡策略    （随机访问  ,轮询[默认]）
     * @return -Dserver.port=9001  在idea中设置VM参数  可启动两份实例
     * */
    @Bean
    @LoadBalanced  // 此注解可以被ribbon发现 配置做负载均衡, restTemplate 发送请求会被ribbon拦截到
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //自定义的负载均衡策略
//    @Bean
//    public IRule getMyRule(){
//        return new RandomRule();
//    }




}

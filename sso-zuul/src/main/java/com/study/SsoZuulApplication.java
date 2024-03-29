package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启Zuul的网关功能
@EnableDiscoveryClient //开启Eureka客户端发现功能
public class SsoZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoZuulApplication.class, args);
    }

}

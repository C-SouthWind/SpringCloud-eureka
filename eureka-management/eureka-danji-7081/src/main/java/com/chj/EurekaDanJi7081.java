package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 9:57
 * @params :
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDanJi7081 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDanJi7081.class,args);
    }
}

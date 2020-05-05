package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 10:47
 * @params :
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaJiQun7083 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaJiQun7083.class,args);
    }
}

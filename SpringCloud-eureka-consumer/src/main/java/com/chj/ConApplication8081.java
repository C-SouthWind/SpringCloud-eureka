package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 9:46
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(ConApplication8081.class,args);
    }
}

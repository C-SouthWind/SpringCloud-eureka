package com.chj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:34
 * @params :
 */
@Configuration
public class RestConfig {
    /** 方法描述 
    * @Description: SpringCloud所提供的rpc方法
    * @Param: []
    * @return: org.springframework.web.client.RestTemplate
    * @Author: chj
    * @Date: 2020/4/28
    */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
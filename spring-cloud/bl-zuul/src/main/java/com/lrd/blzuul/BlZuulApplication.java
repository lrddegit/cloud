package com.lrd.blzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关
 *
 * @author lrd
 * @version $Id: BlZuulApplication.java, v 0.1 2019/11/1 15:39 lrd Exp $
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class BlZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlZuulApplication.class, args);
    }

    /*@Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }*/
}

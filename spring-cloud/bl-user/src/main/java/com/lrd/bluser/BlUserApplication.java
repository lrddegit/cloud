package com.lrd.bluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 用户
 *
 * @author lrd
 * @version $Id: BlUserApplication.java, v 0.1 2019/11/1 15:47 lrd Exp $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
public class BlUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlUserApplication.class, args);
    }

}

package com.lrd.bleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author lrd
 * @version $Id: BlEureKaApplication.java, v 0.1 2019/11/1 14:26 lrd Exp $
 */
@SpringBootApplication
@EnableEurekaServer
public class BlEureKaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlEureKaApplication.class, args);
    }

}

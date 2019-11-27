package com.lrd.blconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class BlConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlConfigApplication.class, args);
        System.out.println("配置中心服务端启动成功!");
    }

}

package com.lrd.blzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
public class BlZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlZipkinApplication.class, args);
        System.out.println("链路跟踪模块启动成功!");
    }

}

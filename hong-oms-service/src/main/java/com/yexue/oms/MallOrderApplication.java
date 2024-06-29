package com.yexue.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.yexue.oms.api")
@MapperScan("com.yexue.oms.mapper")
public class MallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallOrderApplication.class, args);
    }
}
package com.yexue.ums;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yexue.ums.mapper")
public class MallUMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallUMSApplication.class, args);
    }
}
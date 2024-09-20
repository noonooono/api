package com.son.project;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.son.project.mapper")
@EnableDubbo
public class sonApiBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(sonApiBackendApplication.class, args);
    }
}

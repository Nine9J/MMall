package com.mmall;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 注解指定当前项目mapper接口位置
@MapperScan("com.mmall.mapper")
public class MMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MMallApplication.class, args);
    }
}

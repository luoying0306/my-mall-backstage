package com.ly.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ly.mall.dao")
public class MyMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyMallApplication.class, args);
    }

}

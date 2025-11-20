package com.mostarc.eyeglass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mostarc.eyeglass.dao")
public class EyeglassApplication {

    public static void main(String[] args) {
        SpringApplication.run(EyeglassApplication.class, args);
    }

}

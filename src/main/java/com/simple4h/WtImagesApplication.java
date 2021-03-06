package com.simple4h;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simple4h.dao")
public class WtImagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtImagesApplication.class, args);
    }

}

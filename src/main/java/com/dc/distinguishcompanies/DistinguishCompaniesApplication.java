package com.dc.distinguishcompanies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@MapperScan("com.dc.distinguishcompanies.mapper")
@SpringBootApplication
public class DistinguishCompaniesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistinguishCompaniesApplication.class, args);
    }

}

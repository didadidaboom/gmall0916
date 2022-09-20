package com.cwu.gmall0916.manageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.cwu.gmall0916.manageservice.mapper")
public class Gmall0916ManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gmall0916ManageServiceApplication.class, args);
    }

}

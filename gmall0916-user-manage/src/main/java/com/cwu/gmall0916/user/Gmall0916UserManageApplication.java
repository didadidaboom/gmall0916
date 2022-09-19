package com.cwu.gmall0916.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.cwu.gmall0916.user.mapper")
public class Gmall0916UserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gmall0916UserManageApplication.class, args);
    }

}

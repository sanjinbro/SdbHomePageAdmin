package edu.hhu.sdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sanjin 2023-09-15 14:31
 */
@SpringBootApplication
@MapperScan(basePackages = "edu.hhu.sdb.mapper")
public class SdbHomePageAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SdbHomePageAdmin.class, args);
    }
}

package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("org.example.mapper.StuMapper")
/*@MapperScan("org.example.mapper.StuMapper")*/
public class mybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(mybatisPlusApplication.class,args);
    }
}

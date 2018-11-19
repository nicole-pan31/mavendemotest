package com.aaa.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * className:test
 * discription:
 * author:panjing
 * createTime:2018-11-09 14:42
 */
@EnableTransactionManagement //springboot开启注解式事务
@SpringBootApplication
@MapperScan("com.aaa.sm.dao")
public class test {
    public static void main(String[] args) {

        SpringApplication.run(test.class);
    }
}

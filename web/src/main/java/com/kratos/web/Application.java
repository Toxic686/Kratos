package com.kratos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Time : 2022/10/31 10:39
 * @Author : KratosLuo
 * @describe :
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "com.kratos.web")
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        log.info("*********************WEB 运行成功*********************");
    }

}

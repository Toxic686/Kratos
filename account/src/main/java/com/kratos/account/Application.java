package com.kratos.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Time : 2022/11/2 11:52
 * @Author : KratosLuo
 * @describe :
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "com.kratos.account")
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        log.info("*********************ACCOUNT 运行成功*********************");
    }
}

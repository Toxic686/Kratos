package com.kratos.web.adapter;

import com.kratos.web.interceptor.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Time : 2023/1/3 16:43
 * @Author : KratosLuo
 * @describe :
 */
public class WebConfigurerAdapter implements WebMvcConfigurer {
    @Bean
    public LogInterceptor logInterceptor() {
        return new LogInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor());
    }
}

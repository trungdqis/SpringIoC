package com.springioc.config;

import com.springioc.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Tao doi tuong Bean, do HelloWorld chi la 1 class binh thuong (POJO) => Can phai cau hinh
    @Bean
    public HelloWorld helloWorldBean() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!!! (java)");

        return helloWorld;
    }
}

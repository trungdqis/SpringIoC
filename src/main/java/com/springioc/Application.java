package com.springioc;

import com.springioc.bean.HelloWorld;
import com.springioc.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        //AppConfig -> Quan ly Bean
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldBean");
        System.out.println(helloWorld.getMessage());
    }
}

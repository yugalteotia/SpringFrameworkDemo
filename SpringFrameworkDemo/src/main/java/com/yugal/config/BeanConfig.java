package com.yugal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yugal")
public class BeanConfig {

//      //  we can also explicitly create bean like the method below, if we don't add component scan
//    @Bean
//    public FullStackDev fullStackDev() {
//        return new FullStackDev();
//    }


}
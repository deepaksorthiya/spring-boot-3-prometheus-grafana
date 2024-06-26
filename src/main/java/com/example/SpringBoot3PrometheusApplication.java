package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot3PrometheusApplication {

    private final Logger logger = LoggerFactory.getLogger(SpringBoot3PrometheusApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3PrometheusApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        logger.info("log message {} ", "hello");
        return "Hello";
    }
}

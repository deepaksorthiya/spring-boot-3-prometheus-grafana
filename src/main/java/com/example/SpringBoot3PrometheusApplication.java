package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@SpringBootApplication
@RestController
public class SpringBoot3PrometheusApplication implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(SpringBoot3PrometheusApplication.class);

    private final DataSource dataSource;

    public SpringBoot3PrometheusApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3PrometheusApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        logger.info("log message {} ", "hello");
        try {
            Thread.sleep(2000); // Simulate a delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Thread was interrupted", e);
        }
        return "Hello";
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("DataSource class: " + dataSource.getClass().getName());
    }
}

package com.neptunezxn.demo.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath*:/spring/si-config.xml")
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}

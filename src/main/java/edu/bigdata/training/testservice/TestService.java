package edu.bigdata.training.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TestService {
    public static void main(String[] args) {
        SpringApplication.run(TestService.class, args);
    }
}

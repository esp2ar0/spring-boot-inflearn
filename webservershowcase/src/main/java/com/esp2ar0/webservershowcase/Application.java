package com.esp2ar0.webservershowcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hello")
    public String hello() {
        return "Hello spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

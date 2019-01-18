package com.esp2ar0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    ChangHwanProperties changHwanProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("======================");
        System.out.println(changHwanProperties.getName());
        System.out.println(changHwanProperties.getAge());
        System.out.println("======================");

    }
}

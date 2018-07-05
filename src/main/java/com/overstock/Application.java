package com.overstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Jana on 7/5/2018.
 */
@SpringBootApplication(scanBasePackages = "com.overstock.mydrink")
public class Application {
    public static void main(String[]args) {
        SpringApplication.run(Application.class, args);
    }
}

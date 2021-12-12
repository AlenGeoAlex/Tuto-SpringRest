package me.alen_alex.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new DataManager();
        SpringApplication.run(Application.class, args);
    }

}

package com.example.chapter_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Chapter1Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Chapter1Application.class, args);
        while (true){
            System.out.printf(String.valueOf(new Date()));
            Thread.sleep(1000);
        }
    }

}

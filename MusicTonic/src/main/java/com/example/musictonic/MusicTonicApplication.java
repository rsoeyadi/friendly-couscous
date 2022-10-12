package com.example.musictonic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MusicTonicApplication {

    @RequestMapping("/")
    public String home() {
        return "cs is awesome like really the best...";
    }

    @RequestMapping("/test")
    public String test() {
        return "test...";
    }
    public static void main(String[] args) {
        SpringApplication.run(MusicTonicApplication.class, args);
    }


}

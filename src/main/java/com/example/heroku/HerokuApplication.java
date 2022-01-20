package com.example.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokuApplication {
    @GetMapping("/name")
    public String name(){
        return "name.html";
    }
    @ResponseBody
    public static void main(String[] args) {

        SpringApplication.run(HerokuApplication.class, args);
    }
}

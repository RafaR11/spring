package com.example.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;

@Controller
@SpringBootApplication
public class HerokuApplication {
    @GetMapping(path = "/src/main/resources/templates/name.html")
    public void name(){ }
    @ResponseBody
    public static void main(String[] args) {

        SpringApplication.run(HerokuApplication.class, args);
    }
}

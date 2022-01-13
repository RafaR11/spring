package com.example.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
@SpringBootApplication
public class HerokuApplication {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world!!!";
    }
    public static void main(String[] args) {

        SpringApplication.run(HerokuApplication.class, args);
    }
}

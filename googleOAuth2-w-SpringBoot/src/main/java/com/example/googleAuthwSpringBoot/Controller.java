package com.example.googleAuthwSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mainPage(){
        return "Welcome to main page";
    }
    @GetMapping("/restricted")
    public String restricted(){
        return "auth is successfully";
    }
}

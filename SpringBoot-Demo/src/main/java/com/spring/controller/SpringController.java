package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Base URL for all endpoints
public class SpringController {

    @GetMapping("/hi")
    public String getMessage() {
        return "Hi Srinu!";
    }

    @GetMapping("/hello")
    public String printMessage() {
        return "Happy to learn Spring Boot!";
    }
}

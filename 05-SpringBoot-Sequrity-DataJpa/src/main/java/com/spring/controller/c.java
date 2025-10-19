package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {

    @GetMapping("/user/hello")
    public String userHello() {
        return "Hello USER - Authenticated successfully!";
    }

    @GetMapping("/admin/hello")
    public String adminHello() {
        return "Hello ADMIN - You have full access!";
    }
}
